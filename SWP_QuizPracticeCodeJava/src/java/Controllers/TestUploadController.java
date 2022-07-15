
package Controllers;

import DAL.AnswerDAO;
import DAL.DimensionDAO;
import DAL.LessonDAO;
import DAL.QuestionDAO;
import DAL.SettingDAO;
import DAL.SubjectDAO;
import Models.Answer;
import Models.Dimension;
import Models.Lesson;
import Models.Question;
import Models.Subject;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(name = "TestUploadController", urlPatterns = {"/testUploadController"})
@MultipartConfig
    
public class TestUploadController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int questid = Integer.parseInt(request.getParameter("qid"));
        QuestionDAO qdao = new QuestionDAO();
        DimensionDAO dimensiondao = new DimensionDAO();
        SubjectDAO sdao = new SubjectDAO();
        AnswerDAO adao = new AnswerDAO();
        SettingDAO settindao = new SettingDAO();

        int numberOfAnsPerQues = adao.countAnswerOfAQuest(questid);
        ArrayList<Answer> listAnswer = adao.getAnswerByQuesID(questid);
        ArrayList<Subject> listSub = sdao.getAllSubjects();
        Question q = qdao.getQuestionByQuesID(questid);
        int qsub = q.getSubjectId();
        int qlesson = q.getLessonId();
        int qdimen = q.getDimensionId();
        ArrayList<Dimension> listDimension = dimensiondao.getAllDimension();
        LessonDAO ld = new LessonDAO();
        ArrayList<Lesson> listLesson = ld.getAllLesson();
        
        request.setAttribute("question", q);
        request.setAttribute("ansNumber", numberOfAnsPerQues);
        request.setAttribute("qsub", qsub);
        request.setAttribute("qlesson", qlesson);
        request.setAttribute("qdimen", qdimen);
        request.setAttribute("listSub", listSub);
        request.setAttribute("listDimen", listDimension);
        request.setAttribute("listLesson", listLesson);
        request.setAttribute("listAns", listAnswer);
        request.getRequestDispatcher("QuestionDetail.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String explain = request.getParameter("qexplain");
        System.out.println(explain);
        response.sendRedirect("testUploadController?qid=6");
       
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
