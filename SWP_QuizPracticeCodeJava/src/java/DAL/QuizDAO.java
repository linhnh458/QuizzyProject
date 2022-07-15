package DAL;

import Models.Answer;
import Models.Question;
import Models.Quiz;
import Models.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class QuizDAO extends DBContext {

    public Quiz getPracticeQuizCustom(int subjectid, int duration, int numberQ) {
        QuestionDAO qd = new QuestionDAO();
        String sql = "    SELECT * FROM dbo.Quiz where subjectId = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, subjectid);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Quiz q = new Quiz();
                q.setDuration(rs.getInt("duration"));
                q.setDuration(duration * 60);
                q.setQuizId(rs.getInt("quizId"));
                q.setQuizName(rs.getString("quizName"));

                q.setQ(qd.getQuesByQuiz(rs.getInt("quizId"), numberQ));

                return q;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Answer> getCorrectAnswer(int questionId) {
        ArrayList<Answer> list = new ArrayList<>();
        String sql = "SELECT * FROM  dbo.Question AS q JOIN dbo.Answer AS a ON a.questionId = q.questionId WHERE a.questionId = ? AND a.isCorrect = 1";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, questionId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Answer a = new Answer();
                a.setAnswerContent(rs.getString("answerContent"));
                list.add(a);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Quiz> getAllQuiz() {
        ArrayList<Quiz> list = new ArrayList<>();
        String sql = "Select * from Quiz";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Subject s = new Subject();
                s.setSubjectId(rs.getInt(9));
                Quiz quiz = new Quiz(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        s);
                list.add(quiz);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void editQuizDuration(int settingid, int value, int status) {
        String sql = "UPDATE [dbo].[Setting]\n"
                + "   SET [Value] = ?\n"
                + "      ,[Status] = ?\n"
                + " WHERE ID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(3, settingid);
            stm.setInt(1, value);
            stm.setInt(2, status);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Quiz getQuizById(int quizid) {
        String sql = "select * from Quiz where quizid = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, quizid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Subject s = new Subject();
                s.setSubjectId(rs.getInt(9));
                Quiz quiz = new Quiz(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        s);
                return quiz;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Quiz> getQuizLeftToAddSetting() {
        ArrayList<Quiz> list = new ArrayList<>();
        String sql = "select * from Quiz where quizId not in (SELECT quizID FROM Setting)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Subject s = new Subject();
                s.setSubjectId(rs.getInt(9));
                Quiz quiz = new Quiz(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        s);
                list.add(quiz);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static void main(String[] args) {
        QuizDAO dao = new QuizDAO();
//        ArrayList<Quiz> listQuiz = dao.getAllQuiz();
//        for (Quiz quiz : listQuiz) {
//            System.out.println(quiz);
//        }
        Quiz q = dao.getQuizById(1);
        System.out.println(q.getQuizName());
    }

    public Quiz getPracticeQuizByLesson(int subjectId, int lessonId) {
        QuestionDAO qd = new QuestionDAO();
        String sql = "SELECT * FROM dbo.Quiz WHERE lessonId = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, lessonId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Quiz q = new Quiz();
                q.setDuration(rs.getInt("duration"));
                q.setQuizId(rs.getInt("quizId"));
                q.setQuizName(rs.getString("quizName"));

                q.setQ(qd.getQuesByQuizLesson(rs.getInt("quizId")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void calculateScore(Quiz q) {
        boolean isCorrect = true;

        ArrayList<Integer> chooseAnswers = new ArrayList<>();
        ArrayList<Integer> correctAnswers = new ArrayList<>();
        Question ques = new Question();
        float totalCorrectAnswer = 0;
        int totalChoice = 0;

        for (Question question : q.getQ()) {
            correctAnswers = getCorrectAnswerByQuestionId(question.getQuestionId());
            //5, 6
            if (question.getMarkedAnswer() != null) {
                for (Integer answer : question.getMarkedAnswer()) {
                    // 5
                    if (correctAnswers.contains(answer)) {
                        isCorrect = true;
                        totalChoice++;
                    } else {
                        isCorrect = false;
                        break;
                    }
                }
                if (isCorrect == true && totalChoice == correctAnswers.size()) {
                    totalCorrectAnswer += 1;
                    totalChoice = 0;
                }
                isCorrect = true;
            }

        }
        float point = totalCorrectAnswer / (float) q.getQ().size();
        point = point * 100;

        String sql2 = "INSERT INTO dbo.CustomerQuiz(quizId, userId, point, time, submitted)\n"
                + "VALUES(?, \n"
                + "?   ,\n"
                + "? , \n"
                + "?   , \n"
                + "GETDATE()\n"
                + "    )";
        try {
            PreparedStatement stm = connection.prepareStatement(sql2);
            stm.setInt(1, q.getQuizId());
            stm.setInt(2, q.getUserid());
            stm.setFloat(3, point);
            stm.setDouble(4, q.getTimeTaken());

            stm.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Integer> getCorrectAnswerByQuestionId(int questionId) {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "SELECT * FROM  dbo.Question AS q JOIN dbo.Answer AS a ON a.questionId = q.questionId WHERE a.questionId = ? AND a.isCorrect = 1";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, questionId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt("answerId"));
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
