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

@WebServlet(name = "AdminQuestionDetailController", urlPatterns = {"/admin/questiondetail"})
public class AdminQuestionDetailController extends HttpServlet {

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
        request.getRequestDispatcher("../QuestionDetail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //question info
        QuestionDAO qdao = new QuestionDAO();
        Question q = new Question();
        int qid = -1;
        int subject = -1;
        int dimension = -1;
        int lesson = -1;
        String content = "";
        String explanation = "";
        int status = -1;

        PrintWriter out = response.getWriter();
        String filename = null;
        boolean isUpload = true;
        try {
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = upload.parseRequest(request);

            qid = Integer.parseInt(items.get(0).getString());
            subject = Integer.parseInt(items.get(1).getString());
            dimension = Integer.parseInt(items.get(2).getString());
            lesson = Integer.parseInt(items.get(3).getString());
            content = items.get(4).getString();
            explanation = items.get(5).getString();
            status = Integer.parseInt(items.get(6).getString());

            HashMap<String, String> fields = new HashMap<>();
            Iterator<FileItem> iter = items.iterator();
            while (iter.hasNext()) {
                FileItem item = iter.next();
                if (item.isFormField()) {
                    fields.put(item.getFieldName(), item.getString());
                    String name = item.getFieldName();
                    String value = item.getString();
//                    System.out.println(name + " " + value);
                }
                if (item.getName().isEmpty()) {
                    isUpload = false;
                    break;
                } else {
                    filename = "upload_" + q.getQuestionId() + "_" + item.getName();
                    if (filename == null || filename.equals("")) {
                        break;
                    } else {
                        Path path = Paths.get(filename);
                        String storePath = servletContext.getRealPath("/upload");
                        File uploadFile = new File(storePath + "/" + path.getFileName());
                        if (uploadFile.canRead()) {
                            uploadFile.delete();
                        }
                        item.write(uploadFile);
                    }
                    System.out.println("file uploaded: " + filename);
                    out.println(filename);
                }
            }
            for (FileItem item : items) {
                System.out.println(item.getName());
            }
            if (isUpload == true) {
                for (FileItem item : items) {
                    qdao.insertQuestionMedia(qid, item.getName(), item.getName(), item.getName());

                }
                //qdao.insertQuestionMedia(6, filename, filename, filename);
            }
        } catch (FileUploadException ex) {
            System.out.println(ex.getStackTrace());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("id: "+qid);
        System.out.println("content: "+content);
        System.out.println("explan: "+explanation);
        qdao.updateQuestionDetail(qid, subject, dimension, lesson, content, status, explanation);
        response.sendRedirect("questiondetail?qid=6");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
