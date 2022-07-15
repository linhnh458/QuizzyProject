package Controllers;

import DAL.AnswerDAO;
import DAL.SettingDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminAddAnswerQuestController", urlPatterns = {"/admin/addAnswer"})
public class AdminAddAnswerQuestController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int questid = Integer.parseInt(request.getParameter("questid"));
        request.setAttribute("qid", questid);
        request.getRequestDispatcher("../AdminAddAnswer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int questid = Integer.parseInt(request.getParameter("qid"));
        AnswerDAO adao = new AnswerDAO();
        PrintWriter out = response.getWriter();

        String content = request.getParameter("content");
        request.getSession().setAttribute("tempContent", content);
        int isCorrect = Integer.parseInt(request.getParameter("iscorrect"));
        int status = Integer.parseInt(request.getParameter("status"));
        
        int numberOfAnswer = adao.countAnswerOfAQuest(questid);
        int numberCorrectAnswer = adao.countCorrectAnswerOfAQuest(questid);
        String url = "";
        String message = "";
        if (numberOfAnswer < 10) {
            if(numberCorrectAnswer == 4 && isCorrect == 1){
                url = "addAnswer?questid=" + questid;
                message = "Number of correct answer has reached the maximum (4), please change isCorrect status";          
            }else{
                url = "answerDetail?questid="+questid;
                adao.addNewAnswerToQuestion(questid, content, isCorrect, status);
                message = "Added succesfully";
                request.getSession().removeAttribute("tempContent");
            }
        } else if(numberOfAnswer >= 10) {
            url = "questiondetail?qid=" + questid;
            message = "Number of question has reached the maximum, cannot add more";
            request.getSession().removeAttribute("tempContent");
        }
        out.println("<script type=\"text/javascript\">");
        out.println("alert('" + message + "');");
        out.println("location='" + url + "';");
        out.println("</script>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
