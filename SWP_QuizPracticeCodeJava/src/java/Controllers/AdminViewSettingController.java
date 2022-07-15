
package Controllers;

import DAL.QuizDAO;
import DAL.SettingDAO;
import Models.Quiz;
import Models.Setting;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminViewSettingController", urlPatterns = {"/admin/viewSetting"})
public class AdminViewSettingController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int settingid = Integer.parseInt(request.getParameter("sid"));
        SettingDAO sdao = new SettingDAO();
        Setting s = sdao.getSettingByID(settingid);
        int quizid = s.getQuizid();
        QuizDAO dao = new QuizDAO();
        Quiz q = dao.getQuizById(quizid);
        
        request.setAttribute("setting", s);
        request.setAttribute("quiz", q);
        request.getRequestDispatcher("../AdminViewSetting.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
