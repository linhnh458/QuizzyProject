
package Controllers;

import DAL.AnswerDAO;
import DAL.QuestionDAO;
import Models.Answer;
import Models.Question;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AnswerQuestionDetailController", urlPatterns = {"/admin/answerDetail"})
public class AnswerQuestionDetailController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int questid = Integer.parseInt(request.getParameter("questid"));
        QuestionDAO qdao = new QuestionDAO();
        AnswerDAO adao = new AnswerDAO();
        int numberOfAnsPerQues = adao.countAnswerOfAQuest(questid);
        ArrayList<Answer> listAnswer = adao.getAnswerByQuesID(questid);
        Question q = qdao.getQuestionByQuesID(questid);
        request.setAttribute("question", q);
        request.setAttribute("listAns", listAnswer);
        request.setAttribute("ansNumber", numberOfAnsPerQues);
        request.getRequestDispatcher("../AdminAnswerDetail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("questid"));
        //ANSWER DETAILS
        AnswerDAO adao = new AnswerDAO();
        String[] answeridArray = request.getParameterValues("ansid");
        String[] anscontentArray = request.getParameterValues("content");
        String[] isCorrectArray = request.getParameterValues("iscorrect");
        String[] ansstatusArray = request.getParameterValues("ansstatus");
        //convert ans id array
        int[] ansid = new int[answeridArray.length];
        for (int i = 0; i < ansid.length; i++) {
            ansid[i] = Integer.parseInt(answeridArray[i]);
        }
        //convert ans iscorrect array
        int correctAnswer = 0;
        int[] ansIsCorrect = new int[isCorrectArray.length];
        for (int i = 0; i < ansIsCorrect.length; i++) {
            ansIsCorrect[i] = Integer.parseInt(isCorrectArray[i]);
            if (ansIsCorrect[i] == 1) {
                correctAnswer++;
            }
        }
        System.out.println("Number of correct answer: " + correctAnswer);
        //convert ans status
        int[] ansStatus = new int[ansstatusArray.length];
        for (int i = 0; i < ansIsCorrect.length; i++) {
            ansStatus[i] = Integer.parseInt(ansstatusArray[i]);
        }
        PrintWriter out = response.getWriter();
        String url = "answerDetail?questid=" + id;
        //update answer detail
        if (correctAnswer > 0 && correctAnswer < 5) {
            for (int i = 0; i < ansid.length; i++) {
//            System.out.println(ansid[i] + ", "+anscontentArray[i]+", "+ansIsCorrect[i]
//                    +", "+ansstatusArray[i] + ", "+ansStatus[i]);
                adao.editAnswer(ansid[i], anscontentArray[i], ansIsCorrect[i], ansStatus[i]);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Edited successfully');");
                out.println("location='" + url + "';");
                out.println("</script>");
            }
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Number of correct answer must be at least 1 and at most 4');");
            out.println("location='" + url + "';");
            out.println("</script>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
