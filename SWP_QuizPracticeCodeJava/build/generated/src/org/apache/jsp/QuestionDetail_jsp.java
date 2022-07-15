package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.User;
import DAL.UserDAO;

public final class QuestionDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/template/header_new.jsp");
    _jspx_dependants.add("/template/../userprofile.jsp");
    _jspx_dependants.add("/template/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"author\" content=\"Themezhub\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Question details</title>\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"/SWP_QuizPracticeCodeJava/assets/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        select{\n");
      out.write("            margin-left: 17px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            border-color: #03b97c;\n");
      out.write("            border-width: 2px;\n");
      out.write("        }\n");
      out.write("        #image-preview, #image {\n");
      out.write("            width: 340px;\n");
      out.write("            height: 260px;\n");
      out.write("            position: relative;\n");
      out.write("            overflow: hidden;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            color: #ecf0f1;\n");
      out.write("            input {\n");
      out.write("                line-height: 200px;\n");
      out.write("                font-size: 200px;\n");
      out.write("                position: absolute;\n");
      out.write("                opacity: 0;\n");
      out.write("                z-index: 10;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main-wrapper\">\n");
      out.write("            <!-- Start Navigation -->\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--   <span style=\"    font-weight: bold;\r\n");
      out.write("                          color: #03b97c !important;\">Quizzy</span>-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!-- ============================================================== -->\r\n");
      out.write("<!-- Top header  -->\r\n");
      out.write("<!-- ============================================================== -->\r\n");
      out.write("<!-- Start Navigation -->\r\n");
      out.write("<div class=\"header header-light head-shadow\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <nav id=\"navigation\" class=\"navigation navigation-landscape\">\r\n");
      out.write("            <div class=\"nav-header\">\r\n");
      out.write("                <a style=\"font-weight: bold;\r\n");
      out.write("                   color: #03b97c !important;\" class=\"nav-brand\" href=\"home\">\r\n");
      out.write("                    Quizzy\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"nav-toggle\"></div>\r\n");
      out.write("                <div class=\"mobile_nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"javascript:void(0);\" data-toggle=\"modal\" data-target=\"#login\" class=\"crs_yuo12 w-auto text-white theme-bg\">\r\n");
      out.write("                                <span class=\"embos_45\"><i class=\"fas fa-sign-in-alt mr-1\"></i>Sign In</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav-menus-wrapper\">\r\n");
      out.write("                <ul class=\"nav-menu\">\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"active\"><a href=\"home\">Home<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                        <!--                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                    <li><a href=\"index.html\">Home 1</a></li>\r\n");
      out.write("                                                    <li><a href=\"home-2.html\">Home 2</a></li>\r\n");
      out.write("                                                    <li><a href=\"home-3.html\">Home 3</a></li>\r\n");
      out.write("                                                    <li><a href=\"home-4.html\">Home 4</a></li>\r\n");
      out.write("                                                    <li><a href=\"home-5.html\">Home 5</a></li>\r\n");
      out.write("                                                    <li><a href=\"home-6.html\">Home 6</a></li>\r\n");
      out.write("                                                    <li><a href=\"home-7.html\">Home 7</a></li>\r\n");
      out.write("                                                </ul>-->\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li><a href=\"PublicSubjectList\">Courses<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                        <!--                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Search Courses in Grid<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                                                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                            <li><a href=\"grid-layout-with-sidebar.html\">Grid Layout Style 1</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-with-sidebar-2.html\">Grid Layout Style 2</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-with-sidebar-3.html\">Grid Layout Style 3</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-with-sidebar-4.html\">Grid Layout Style 4</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-with-sidebar-5.html\">Grid Layout Style 5</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-full.html\">Grid Full Width</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-full-2.html\">Grid Full Width 2</a></li>\r\n");
      out.write("                                                            <li><a href=\"grid-layout-full-3.html\">Grid Full Width 3</a></li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li><a href=\"#\">Search Courses in List<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                                                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                            <li><a href=\"list-layout-with-sidebar.html\">List Layout Style 1</a></li>\r\n");
      out.write("                                                            <li><a href=\"list-layout-with-full.html\">List Full Width</a></li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li><a href=\"#\">Courses Detail<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                                                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                            <li><a href=\"course-detail.html\">Course Detail 01</a></li>\r\n");
      out.write("                                                            <li><a href=\"course-detail-2.html\">Course Detail 02</a></li>\r\n");
      out.write("                                                            <li><a href=\"course-detail-3.html\">Course Detail 03</a></li>\r\n");
      out.write("                                                            <li><a href=\"course-detail-4.html\">Course Detail 04</a></li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                        \r\n");
      out.write("                                                    <li><a href=\"explore-category.html\">Explore Category</a></li>\r\n");
      out.write("                                                    <li><a href=\"find-instructor.html\">Find Instructor</a></li>\r\n");
      out.write("                                                    <li><a href=\"instructor-detail.html\">Instructor Detail</a></li>\r\n");
      out.write("                                                </ul>-->\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li><a href=\"blog\">Blogs<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                        <!--                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Shop Pages<span class=\"submenu-indicator\"></span></a>\r\n");
      out.write("                                                        <ul class=\"nav-dropdown nav-submenu\">\r\n");
      out.write("                                                            <li><a href=\"shop-with-sidebar.html\">Shop Sidebar Left</a></li>\r\n");
      out.write("                                                            <li><a href=\"shop-with-right-sidebar.html\">Shop Sidebar Right</a></li>\r\n");
      out.write("                                                            <li><a href=\"list-shop-with-sidebar.html\">Shop List Style</a></li>\r\n");
      out.write("                                                            <li><a href=\"wishlist.html\">Wishlist</a></li>\r\n");
      out.write("                                                            <li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("                                                            <li><a href=\"product-detail.html\">Product Detail</a></li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                                                    <li><a href=\"contact.html\">Say Hello</a></li>\r\n");
      out.write("                                                    <li><a href=\"blogs.html\">Blog Style</a></li>\r\n");
      out.write("                                                    <li><a href=\"pricing.html\">Pricing</a></li>\r\n");
      out.write("                                                    <li><a href=\"404.html\">404 Page</a></li>\r\n");
      out.write("                                                    <li><a href=\"component.html\">Elements</a></li>\r\n");
      out.write("                                                    <li><a href=\"faq.html\">FAQs</a></li>\r\n");
      out.write("                                                    <li><a href=\"login.html\">Login</a></li>\r\n");
      out.write("                                                    <li><a href=\"signup.html\">Signup</a></li>\r\n");
      out.write("                                                    <li><a href=\"forgot.html\">Forgot</a></li>\r\n");
      out.write("                                                </ul>-->\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--                    <li><a href=\"dashboard.html\">Dashboard</a></li>-->\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav-menu nav-menu-social align-to-right\">\r\n");
      out.write("                    ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_1.setParent(null);
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                            ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\r\n");
              out.write("                            ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.4/dist/sweetalert2.min.css\">\n");
              out.write("        <style>\n");
              out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');\n");
              out.write("\n");
              out.write("            *{\n");
              out.write("                margin: 0;\n");
              out.write("                padding: 0;\n");
              out.write("                box-sizing: border-box;\n");
              out.write("            }\n");
              out.write("\n");
              out.write("            body{\n");
              out.write("                font-family: 'Poppins', sans-serif;\n");
              out.write("                background-color: aliceblue;\n");
              out.write("            }\n");
              out.write("\n");
              out.write("            .wrapper{\n");
              out.write("                padding: 30px 50px;\n");
              out.write("                border: 1px solid #ddd;\n");
              out.write("                border-radius: 15px;\n");
              out.write("                margin: 10px auto;\n");
              out.write("                max-width: 600px;\n");
              out.write("            }\n");
              out.write("            h4{\n");
              out.write("                letter-spacing: -1px;\n");
              out.write("                font-weight: 400;\n");
              out.write("            }\n");
              out.write("            .img{\n");
              out.write("                width: 70px;\n");
              out.write("                height: 70px;\n");
              out.write("                border-radius: 6px;\n");
              out.write("                object-fit: cover;\n");
              out.write("            }\n");
              out.write("            #img-section p,#deactivate p{\n");
              out.write("                font-size: 12px;\n");
              out.write("                color: #777;\n");
              out.write("                margin-bottom: 10px;\n");
              out.write("                text-align: justify;\n");
              out.write("            }\n");
              out.write("            #img-section b,#img-section button,#deactivate b{\n");
              out.write("                font-size: 14px; \n");
              out.write("            }\n");
              out.write("\n");
              out.write("            label{\n");
              out.write("                margin-bottom: 0;\n");
              out.write("                font-size: 14px;\n");
              out.write("                font-weight: 500;\n");
              out.write("                color: #777;\n");
              out.write("                padding-left: 3px;\n");
              out.write("            }\n");
              out.write("\n");
              out.write("            .form-control{\n");
              out.write("                border-radius: 10px;\n");
              out.write("            }\n");
              out.write("\n");
              out.write("            input[placeholder]{\n");
              out.write("                font-weight: 500;\n");
              out.write("            }\n");
              out.write("            .form-control:focus{\n");
              out.write("                box-shadow: none;\n");
              out.write("                border: 1.5px solid #0779e4;\n");
              out.write("            }\n");
              out.write("            select{\n");
              out.write("                display: block;\n");
              out.write("                width: 100%;\n");
              out.write("                border: 1px solid #ddd;\n");
              out.write("                border-radius: 10px;\n");
              out.write("                height: 40px;\n");
              out.write("                padding: 5px 10px;\n");
              out.write("                /* -webkit-appearance: none; */\n");
              out.write("            }\n");
              out.write("\n");
              out.write("            select:focus{\n");
              out.write("                outline: none;\n");
              out.write("            }\n");
              out.write("\n");
              out.write("\n");
              out.write("            .danger{\n");
              out.write("                background-color: #fff;\n");
              out.write("                color: #e20404;\n");
              out.write("                border: 1px solid #ddd;\n");
              out.write("            }\n");
              out.write("            .danger:hover{\n");
              out.write("                background-color: #e20404;\n");
              out.write("                color: #fff;\n");
              out.write("            }\n");
              out.write("            @media(max-width:576px){\n");
              out.write("                .wrapper{\n");
              out.write("                    padding: 25px 20px;\n");
              out.write("                }\n");
              out.write("                #deactivate{\n");
              out.write("                    line-height: 18px;\n");
              out.write("                }\n");
              out.write("            }\n");
              out.write("            .warning{\n");
              out.write("                color: red;\n");
              out.write("            }\n");
              out.write("            .modal-second {\n");
              out.write("                z-index: 1052;\n");
              out.write("            }\n");
              out.write("\n");
              out.write("            .modal-backdrop.fade {\n");
              out.write("                & + .modal-backdrop.fade {\n");
              out.write("                    z-index: 1051;\n");
              out.write("                }\n");
              out.write("            }\n");
              out.write("\n");
              out.write("        </style>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <!--        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\">\n");
              out.write("                    Enroll Now\n");
              out.write("                </button>-->\n");
              out.write("        ");
 UserDAO ud = new UserDAO();
            User u = (User) request.getSession().getAttribute("user");
            String img = ud.findImg(u.getUserId());
            boolean gender = ud.findGender(u.getUserId());
            String phone = ud.findPhone(u.getUserId());
            String name = ud.findName(u.getUserId());
        
              out.write("\n");
              out.write(" \n");
              out.write("        <li class=\"avatar avatar-xl\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\" style=\"justify-content: flex-end;margin-left: 10px\">\n");
              out.write("            <img style=\"width: 50px;height: 50px\" src=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("/upload/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getProfilePic()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" alt=\"\"/>\n");
              out.write("        </li>\n");
              out.write("   \n");
              out.write("    \n");
              out.write("    <!-- Modal -->\n");
              out.write("    <div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
              out.write("        <div class=\"modal-dialog modal-dialog-centered modal-lg\" role=\"document\">\n");
              out.write("            <div class=\"modal-content\">\n");
              out.write("                <div class=\"modal-header\">\n");
              out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">User profile</h5>\n");
              out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
              out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
              out.write("                    </button>\n");
              out.write("                </div>\n");
              out.write("                <form class=\"profileSubmit\" method=\"POST\" action=\"profile2\" enctype=\"multipart/form-data\" >\n");
              out.write("                    <div class=\"modal-body\">\n");
              out.write("                        <div class=\"wrapper bg-white mt-sm-5\">\n");
              out.write("                            <h4 class=\"pb-4 border-bottom\">Account settings</h4>\n");
              out.write("                            <div class=\"d-flex align-items-start py-3 border-bottom\">\n");
              out.write("                                <img src=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("/upload/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getProfilePic()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"\n");
              out.write("                                     class=\"img\" alt=\"\">\n");
              out.write("                                <div class=\"pl-sm-4 pl-2\" id=\"img-section\">\n");
              out.write("                                    <b>Profile Photo</b>\n");
              out.write("                                    <p>Accepted file type .png. Less than 1MB</p>\n");
              out.write("                                    <!--                                    <button class=\"btn button border\"><b>Upload</b></button>-->\n");
              out.write("\n");
              out.write("                                    <label for=\"upload\">Upload Avatar</label>\n");
              out.write("                                    <input class=\"form-control upload_img\" type=\"file\" name=\"file\" id=\"upload\" /><br/>\n");
              out.write("\n");
              out.write("                                </div>\n");
              out.write("                            </div>\n");
              out.write("                            <div class=\"py-2\">\n");
              out.write("                                <div class=\"row py-2\">\n");
              out.write("                                    <div class=\"col-md-6\">\n");
              out.write("                                        <label for=\"firstname\">Name</label>\n");
              out.write("                                        <input type=\"text\" class=\"bg-light form-control fullName\" placeholder=\"");
              out.print(name);
              out.write("\" value=\"");
              out.print(name);
              out.write("\" name=\"name\">\n");
              out.write("                                        <div style=\"display: none;\" class=\"warning warning_name bg-light\">Name is empty</div>\n");
              out.write("                                    </div>\n");
              out.write("\n");
              out.write("\n");
              out.write("                                    <div class=\"col-md-6 pt-md-0 pt-3\">\n");
              out.write("                                        <label for=\"gender\" style=\"display: block;\">Gender</label>\n");
              out.write("                                        <label for=\"male\" style=\"\">Male</label>\n");
              out.write("                                        <input id=\"male\" ");
if (gender) {
              out.write("checked=\"\"");
}
              out.write(" type=\"radio\" name=\"gender\" value=\"Male\" />\n");
              out.write("                                        <label for=\"female\"  style=\"\">Female</label>\n");
              out.write("\n");
              out.write("                                        <input id=\"female\" ");
if (!gender) {
              out.write("checked=\"\"");
}
              out.write(" type=\"radio\" name=\"gender\" value=\"Female\" />\n");
              out.write("                                    </div>\n");
              out.write("                                </div>\n");
              out.write("                                <div class=\"row py-2\">\n");
              out.write("                                    <div class=\"col-md-6\">\n");
              out.write("                                        <label for=\"email\">Email Address</label>\n");
              out.write("                                        <input readonly type=\"text\" class=\"bg-light form-control\" placeholder=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\">\n");
              out.write("                                    </div>\n");
              out.write("                                    <div class=\"col-md-6 pt-md-0 pt-3\">\n");
              out.write("                                        <label for=\"phone\">Phone Number</label>\n");
              out.write("                                        <input name=\"phone\" value=\"");
              out.print(phone);
              out.write("\" type=\"tel\" class=\"bg-light form-control phone\" placeholder=\"");
              out.print(phone);
              out.write("\">\n");
              out.write("                                        <div style=\"display: none;\" class=\"warning warning_phone\">Phone is empty</div>\n");
              out.write("                                    </div>\n");
              out.write("\n");
              out.write("                                </div>\n");
              out.write("\n");
              out.write("                                <div class=\"py-3 pb-4 border-bottom\">\n");
              out.write("                                    <button type=\"button\" class=\"btn btn-primary mr-3\" onclick=\"sendData()\">Save Changes</button>\n");
              out.write("                                </div>\n");
              out.write("\n");
              out.write("                                <!--                                    <div class=\"py-3 pb-4 border-bottom\">\n");
              out.write("                                                                        <a href=\"changePassword?uid=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.getUserId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\">\n");
              out.write("                                                                            <button type=\"button\" class=\"btn btn-primary mr-3\">Change password</button>\n");
              out.write("                                                                        </a>\n");
              out.write("                                                                    </div>-->\n");
              out.write("                                <button data-toggle=\"modal\" data-target=\"#modalChangePassword\" type=\"button\" class=\"btn btn-primary mr-3\">Change password</button>\n");
              out.write("\n");
              out.write("                                <div class=\"d-sm-flex align-items-center pt-3\" id=\"deactivate\">\n");
              out.write("                                    <!--                                        <div>\n");
              out.write("                                                                                <b>Deactivate your account</b>\n");
              out.write("                                                                                <p>Details about your company account and password</p>\n");
              out.write("                                                                            </div>\n");
              out.write("                                                                            <div class=\"ml-auto\">\n");
              out.write("                                                                                <button class=\"btn danger\">Deactivate</button>\n");
              out.write("                                                                            </div>-->\n");
              out.write("                                </div>\n");
              out.write("                            </div>\n");
              out.write("                        </div>\n");
              out.write("                    </div>\n");
              out.write("                </form>\n");
              out.write("\n");
              out.write("                <form action=\"changePassword\" method=\"POST\">\n");
              out.write("                    <div class=\"modal fade modal-second\" id=\"modalChangePassword\" tabindex=\"-1\" role=\"dialog\"\n");
              out.write("                         aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
              out.write("                        <div class=\"modal-dialog modal-dialog-centered modal-md\" role=\"document\">\n");
              out.write("                            <div class=\"modal-content\" style=\"background-color: lightgrey\">\n");
              out.write("                                <div class=\"modal-header text-center\">\n");
              out.write("                                    <h3 class=\"modal-title w-100 font-weight-bold\">Change Password</h3>\n");
              out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
              out.write("                                        <span aria-hidden=\"true\">&times;</span>\n");
              out.write("                                    </button>\n");
              out.write("                                </div>\n");
              out.write("                                <div class=\"modal-body mx-3\">\n");
              out.write("                                    <div class=\"md-form mb-4\">\n");
              out.write("                                        <p class=\"text-danger\" role=\"alert\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</p>\n");
              out.write("                                        <input type=\"password\"\n");
              out.write("                                               id=\"defaultForm-email\" class=\"form-control validate\"\n");
              out.write("                                               placeholder=\"Enter your current password\" name=\"oldPass\" required >\n");
              out.write("                                    </div>\n");
              out.write("                                    <div class=\"md-form mb-4\">\n");
              out.write("                                        <input  type=\"password\"\n");
              out.write("                                                id=\"defaultForm-pass\" class=\"form-control validate\"\n");
              out.write("                                                placeholder=\"Enter your new password\" name=\"newPass\" required>\n");
              out.write("                                    </div>\n");
              out.write("                                    <div class=\"md-form mb-4\">\n");
              out.write("                                        <input  type=\"password\"\n");
              out.write("                                                id=\"defaultForm-pass\" class=\"form-control validate\"\n");
              out.write("                                                placeholder=\"Confirm new password\" name=\"confirmPass\" required>\n");
              out.write("                                    </div>\n");
              out.write("                                </div>\n");
              out.write("                                <div class=\"modal-footer d-flex justify-content-center\">\n");
              out.write("                                    <button class=\"btn btn-default\" type=\"submit\">Submit</button>\n");
              out.write("                                </div>\n");
              out.write("                            </div>\n");
              out.write("                        </div>\n");
              out.write("                    </div>\n");
              out.write("                </form>\n");
              out.write("                <!--                    <div class=\"modal-footer\">\n");
              out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
              out.write("                                        <button type=\"button\" class=\"btn btn-primary\">Continue</button>\n");
              out.write("                                    </div>-->\n");
              out.write("            </div>\n");
              out.write("\n");
              out.write("        </div>\n");
              out.write("    </div>\n");
              out.write("\n");
              out.write("    <script>\n");
              out.write("\n");
              out.write("        var form = document.querySelector(\".profileSubmit\");\n");
              out.write("        var name_msg = document.querySelector(\".warning_name\");\n");
              out.write("        var phone_msg = document.querySelector(\".warning_phone\");\n");
              out.write("\n");
              out.write("        var arr = [];\n");
              out.write("\n");
              out.write("        function sendData() {\n");
              out.write("            var name = document.querySelector(\".fullName\").value;\n");
              out.write("            var phone = document.querySelector(\".phone\").value;\n");
              out.write("            var male = document.querySelector(\"#male\");\n");
              out.write("            var gender;\n");
              out.write("            if (male.checked)\n");
              out.write("                gender = 'male';\n");
              out.write("            else\n");
              out.write("                gender = 'female'\n");
              out.write("            $.ajax({\n");
              out.write("                url: \"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("/profile\",\n");
              out.write("                type: \"post\", //send it through get method\n");
              out.write("                data: {\n");
              out.write("                    name: name,\n");
              out.write("                    phone: phone,\n");
              out.write("                    gender: gender\n");
              out.write("                },\n");
              out.write("                success: function (data) {\n");
              out.write("                    arr = data.split('|');\n");
              out.write("                    if (arr[0] !== \"\") {\n");
              out.write("                        name_msg.innerHTML = arr[0];\n");
              out.write("                        name_msg.style.display = \"block\";\n");
              out.write("                    } else {\n");
              out.write("                        name_msg.innerHTML = \"\";\n");
              out.write("                        name_msg.style.display = \"none\";\n");
              out.write("                    }\n");
              out.write("                    if (arr[1] !== \"\") {\n");
              out.write("                        phone_msg.innerHTML = arr[1];\n");
              out.write("                        phone_msg.style.display = \"block\";\n");
              out.write("                    } else {\n");
              out.write("                        phone_msg.innerHTML = \"\";\n");
              out.write("                        phone_msg.style.display = \"none\";\n");
              out.write("                    }\n");
              out.write("                    if (arr[0] == \"\" && arr[1] == \"\")\n");
              out.write("                        form.submit();\n");
              out.write("                },\n");
              out.write("                error: function () {\n");
              out.write("                    //Do Something to handle error\n");
              out.write("                }\n");
              out.write("            });\n");
              out.write("        }\n");
              out.write("\n");
              out.write("\n");
              out.write("    </script>\n");
              out.write("\n");
              out.write("</body>\n");
              out.write("</html>\n");
              out.write("\r\n");
              out.write("                            <li class=\"add-listing theme-bg\">\r\n");
              out.write("                                <a href=\"logout\" class=\"text-white\">Log out</a>\r\n");
              out.write("                            </li>\r\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Navigation -->\r\n");
      out.write("<div class=\"clearfix\"></div>\r\n");
      out.write("<!-- ============================================================== -->\r\n");
      out.write("<!-- Top header  -->\r\n");
      out.write("<!-- ============================================================== -->\r\n");
      out.write("<!-- Log In Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"login\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"loginmodal\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl login-pop-form\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content overli\" id=\"loginmodal\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\">Login Your Account</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\"><i class=\"fas fa-times-circle\"></i></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"login-form\">\r\n");
      out.write("                    <form action=\"login\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>User Name</label>\r\n");
      out.write("                            <div class=\"input-with-icon\">\r\n");
      out.write("                                <input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"User or email\">\r\n");
      out.write("                                <i class=\"ti-user\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Password</label>\r\n");
      out.write("                            <div class=\"input-with-icon\">\r\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"*****\">\r\n");
      out.write("                                <i class=\"ti-unlock\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input id=\"l4\" class=\"checkbox-custom\" name=\"remember\" type=\"checkbox\">\r\n");
      out.write("                        <label for=\"l4\" class=\"checkbox-custom-label\">Remember me</label>\r\n");
      out.write("                        <!--                        <div class=\"form-group row\">\r\n");
      out.write("                                                    <div class=\"col-xl-4 col-lg-4 col-4\">\r\n");
      out.write("                                                        <input id=\"admin\" class=\"checkbox-custom\" name=\"admin\" type=\"checkbox\">\r\n");
      out.write("                                                        <label for=\"admin\" class=\"checkbox-custom-label\">Admin</label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-xl-4 col-lg-4 col-4\">\r\n");
      out.write("                                                        <input id=\"student\" class=\"checkbox-custom\" name=\"student\" type=\"checkbox\" checked>\r\n");
      out.write("                                                        <label for=\"student\" class=\"checkbox-custom-label\">Student</label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-xl-4 col-lg-4 col-4\">\r\n");
      out.write("                                                        <input id=\"instructor\" class=\"checkbox-custom\" name=\"instructor\" type=\"checkbox\">\r\n");
      out.write("                                                        <label for=\"instructor\" class=\"checkbox-custom-label\">Tutors</label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\" style=\"margin-top: 30px\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-md full-width theme-bg text-white\">Login</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"crs_log__footer d-flex justify-content-between mt-0\">\r\n");
      out.write("                <div class=\"fhg_45\"><p class=\"musrt\">Don't have account? <a href=\"signup.html\" class=\"theme-cl\">SignUp</a></p></div>\r\n");
      out.write("                <div class=\"fhg_45\"><p class=\"musrt\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/forgetPassword\" class=\"text-danger\">Forgot Password?</a></p></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Modal -->");
      out.write("\n");
      out.write("            <!-- End Navigation -->\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <!-- ============================ Dashboard: Dashboard Start ================================== -->\n");
      out.write("            <section class=\"gray pt-4\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!--admin navbar-->\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("<div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("    <div class=\"dashboard-navbar\">\r\n");
      out.write("        <div class=\"d-user-avater\">\r\n");
      out.write("            <img src=\"https://via.placeholder.com/500x500\" class=\"img-fluid avater\" alt=\"\">\r\n");
      out.write("            <h4>Admin</h4>\r\n");
      out.write("            <span>Senior Designer</span>\r\n");
      out.write("            <div class=\"elso_syu89\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"elso_syu77\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"d-navigation\">\r\n");
      out.write("            <ul id=\"side-menu\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"javascript:void(0);\"><i class=\"fas fa-user\"></i>Users<span class=\"ti-angle-left\"></span></a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li><a href=\"admin/listUsers\">List users</a></li>\r\n");
      out.write("                        <li><a href=\"addUser\">Add user</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"javascript:void(0);\"><i class=\"fas fa-cog\"></i>Settings<span class=\"ti-angle-left\"></span></a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li><a href=\"setting\">List Settings</a></li>\r\n");
      out.write("                        <li><a href=\"addSetting\">Add Settings</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"practicelist?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&subjectID=-1\"><i class=\"fas fa-layer-group\"></i> Pratice List</a></li>\r\n");
      out.write("                <li><a href=\"registration?search=&page=1&name=regId&type=ASC&subName=&status=&from=&to=\"><i class=\"fas fa-layer-group\"></i> Registration List</a></li>\r\n");
      out.write("                <li><a href=\"postlist\"><i class=\"fas fa-layer-group\"></i>Post List</a></li>\r\n");
      out.write("                <li><a href=\"sliderlist?keyword=&page=1&status=\"><i class=\"fas fa-layer-group\"></i> Slider List</a></li>\r\n");
      out.write("                <li><a href=\"lesson?status=2\"><i class=\"fas fa-layer-group\"></i> Lesson List</a></li>\r\n");
      out.write("                <li><a href=\"AdminSubjectList\"><i class=\"fas fa-layer-group\"></i> Subject List</a></li>\r\n");
      out.write("                <li><a href=\"questionlist?subject=0&lesson=0&dimension=0&status=-1\"><i class=\"fas fa-layer-group\"></i> Question List</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"javascript:void(0);\"><i class=\"fas fa-gem\"></i>Dimension<span class=\"ti-angle-left\"></span></a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li><a href=\"subjectdimension\">Dimension Manage</a></li>\r\n");
      out.write("                        <li><a href=\"dimensionadd\">Add New Dimension</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("                        <div class=\"col-lg-9 col-md-9 col-sm-12\">\n");
      out.write("\n");
      out.write("                            <!-- Row -->\n");
      out.write("                            <div class=\"row justify-content-between\">\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 pb-4\">\n");
      out.write("                                    <div class=\"dashboard_wrap d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <div class=\"arion\">\n");
      out.write("                                            <nav class=\"transparent\">\n");
      out.write("                                                <ol class=\"breadcrumb\">\n");
      out.write("                                                    <li class=\"breadcrumb-item\" aria-current=\"page\">Edit setting</li>\n");
      out.write("                                                </ol>\n");
      out.write("                                            </nav>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /Row -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xl-12 col-lg-12 col-md-12\">\n");
      out.write("                                    <div class=\"dashboard_wrap\">\n");
      out.write("                                        <form action=\"testUploadController\" method=\"post\">\n");
      out.write("                                            <div class=\"row justify-content-between\">\n");
      out.write("                                                <div class=\"col-xl-9 col-lg-8 col-md-7 col-sm-12\">\n");
      out.write("                                                    <div class=\"tab-content\" id=\"v-pills-tabContent\">\n");
      out.write("                                                        <div class=\"tab-pane fade show active\" id=\"v-pills-basic\" role=\"tabpanel\" aria-labelledby=\"v-pills-basic-tab\">\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>QUESTION ID</strong></label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control\" name=\"qid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.questionId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>QUESTION SUBJECT</strong></label>\n");
      out.write("                                                                <select name=\"qsubject\" class=\"form-control\">\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>DIMENSION</strong></label>\n");
      out.write("                                                                <select name=\"qdimension\" class=\"form-control\">\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>LESSON</strong></label>\n");
      out.write("                                                                <select name=\"qlesson\" class=\"form-control\">\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>CONTENT</strong></label>\n");
      out.write("                                                                <input name=\"qcontent\" type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.questionContent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>EXPLANATION</strong></label>\n");
      out.write("                                                                <input name=\"qexplain\" type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.explanation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>IMAGE</strong></label> <br>\n");
      out.write("                                                                <!--<img id=\"image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/logo/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br> <br>-->\n");
      out.write("                                                                <input type=\"file\" name=\"file\" accept=\"image/*\" id=\"image-upload\" />\n");
      out.write("                                                                <br>\n");
      out.write("                                                                <label>Preview here</label>\n");
      out.write("                                                                <div id=\"image-preview\">\n");
      out.write("                                                                    <label for=\"image-upload\" id=\"image-label\"></label>\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                <label><strong>AUDIO</strong></label> <br>\n");
      out.write("                                                                <!--<input name=\"qaudio\" type=\"url\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.audio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>-->\n");
      out.write("                                                                <!--                                                                <audio controls>\n");
      out.write("                                                                                                                                    <source src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/logo/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.audio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                                                                                                </audio>-->\n");
      out.write("                                                                <br>\n");
      out.write("                                                                <input type=\"file\" name=\"file2\" id=\"audio-upload\" accept=\"audio/*\"/><br>\n");
      out.write("                                                                Preview here<br>\n");
      out.write("                                                                <div id=\"audio-preview\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <!--                                                            <div class=\"form-group smalls\">\n");
      out.write("                                                                                                                            <label><strong>VIDEO</strong></label>\n");
      out.write("                                                                                                                            <input type='file' id='videoUpload' name=\"file3\"/>\n");
      out.write("                                                                                                                            <video width=\"320\" height=\"240\" controls>\n");
      out.write("                                                                                                                                <source src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/logo/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.video}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                                                                                            </video>\n");
      out.write("                                                                                                                        </div>-->\n");
      out.write("                                                            <br>\n");
      out.write("                                                            <div class=\"col-xl-12 col-lg-12 col-md-12 mb-2\">\n");
      out.write("                                                                <h5>ANSWERS</h5>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                <div class=\"table-responsive\">\n");
      out.write("                                                                    <table class=\"table dash_list\">\n");
      out.write("                                                                        <thead>\n");
      out.write("                                                                            <tr>\n");
      out.write("                                                                                <th scope=\"col\">AnswerID</th>\n");
      out.write("                                                                                <th scope=\"col\">Content</th>\n");
      out.write("                                                                                <th scope=\"col\">IsCorrect</th>\n");
      out.write("                                                                                <th scope=\"col\">Status</th>\n");
      out.write("                                                                            </tr>\n");
      out.write("                                                                        </thead>\n");
      out.write("                                                                        <tbody>\n");
      out.write("                                                                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                        </tbody>\n");
      out.write("                                                                    </table>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div>   \n");
      out.write("                                                                    <div class=\"form-group smalls\">\n");
      out.write("                                                                        <label><strong>QUESTION STATUS</strong></label>\n");
      out.write("                                                                        <select name=\"qstatus\" class=\"form-select form-select-lg mb-3\" aria-label=\".form-select-lg example\">\n");
      out.write("                                                                            <option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status==1 ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Active</option>\n");
      out.write("                                                                            <option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status==0 ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Deactive</option>\n");
      out.write("                                                                        </select>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"justify-content-between\">\n");
      out.write("                                                                        <input type=\"submit\" class=\"btn text-white full-width theme-bg\" value=\"Save changes\">\n");
      out.write("                                                                    </div>    \n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    </form>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </section>\n");
      out.write("                        <!-- ============================ Dashboard: Dashboard End ================================== -->\n");
      out.write("\n");
      out.write("                        <!-- ============================ Footer Start ================================== -->\n");
      out.write("                        <footer class=\"dark-footer skin-dark-footer style-2\">\n");
      out.write("                            <div class=\"footer-middle\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                                        <div class=\"col-lg-5 col-md-5\">\n");
      out.write("                                            <div class=\"footer_widget\">\n");
      out.write("                                                <img src=\"assets/img/logo-light.png\" class=\"img-footer small mb-2\" alt=\"\" />\n");
      out.write("                                                <h4 class=\"extream mb-3\">Do you need help with<br>anything?</h4>\n");
      out.write("                                                <p>Receive updates, hot deals, tutorials, discounts sent straignt in your inbox every month</p>\n");
      out.write("                                                <div class=\"foot-news-last\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" placeholder=\"Email Address\">\n");
      out.write("                                                        <div class=\"input-group-append\">\n");
      out.write("                                                            <button type=\"button\" class=\"input-group-text theme-bg b-0 text-light\">Subscribe</button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-lg-6 col-md-7 ml-auto\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                                <div class=\"col-lg-4 col-md-4\">\n");
      out.write("                                                    <div class=\"footer_widget\">\n");
      out.write("                                                        <h4 class=\"widget_title\">Layouts</h4>\n");
      out.write("                                                        <ul class=\"footer-menu\">\n");
      out.write("                                                            <li><a href=\"#\">Home Page</a></li>\n");
      out.write("                                                            <li><a href=\"#\">About Page</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Service Page</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Property Page</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Contact Page</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Single Blog</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"col-lg-4 col-md-4\">\n");
      out.write("                                                    <div class=\"footer_widget\">\n");
      out.write("                                                        <h4 class=\"widget_title\">All Sections</h4>\n");
      out.write("                                                        <ul class=\"footer-menu\">\n");
      out.write("                                                            <li><a href=\"#\">Headers<span class=\"new\">New</span></a></li>\n");
      out.write("                                                            <li><a href=\"#\">Features</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Attractive<span class=\"new\">New</span></a></li>\n");
      out.write("                                                            <li><a href=\"#\">Testimonials</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Videos</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Footers</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"col-lg-4 col-md-4\">\n");
      out.write("                                                    <div class=\"footer_widget\">\n");
      out.write("                                                        <h4 class=\"widget_title\">Company</h4>\n");
      out.write("                                                        <ul class=\"footer-menu\">\n");
      out.write("                                                            <li><a href=\"#\">About</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Blog</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Pricing</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Affiliate</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Login</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Changelog<span class=\"update\">Update</span></a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"footer-bottom\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row align-items-center\">\n");
      out.write("                                        <div class=\"col-lg-12 col-md-12 text-center\">\n");
      out.write("                                            <p class=\"mb-0\">© 2021 SkillUp. Designd By <a href=\"https://themezhub.com\">ThemezHub</a>.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </footer>\n");
      out.write("                        <!-- ============================ Footer End ================================== -->\n");
      out.write("                        <a id=\"back2Top\" class=\"top-scroll\" title=\"Back to top\" href=\"#\"><i class=\"ti-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- End Wrapper -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- All Jquery -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/jquery.min.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/popper.min.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/bootstrap.min.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/select2.min.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/slick.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/moment.min.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/daterangepicker.js\"></script> \n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/summernote.min.js\"></script>\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/metisMenu.min.js\"></script>\t\n");
      out.write("                    <script src=\"/SWP_QuizPracticeCodeJava/assets/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- This page plugins -->\n");
      out.write("                    <!--<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>-->\n");
      out.write("                    <script type=\"text/javascript\" src=\"/SWP_QuizPracticeCodeJava/assets/js/jquery.uploadPreview.min.js\"></script>\n");
      out.write("                    <!-- ============================================================== -->\t\t\n");
      out.write("\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
      out.write("\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            $.uploadPreview({\n");
      out.write("                                input_field: \"#image-upload\",\n");
      out.write("                                preview_box: \"#image-preview\",\n");
      out.write("                                label_field: \"#image-label\"\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            $.uploadPreview({\n");
      out.write("                                input_field: \"#audio-upload\",\n");
      out.write("                                preview_box: \"#audio-preview\",\n");
      out.write("                                no_label: true\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("                    <script>\n");
      out.write("                        document.getElementById(\"videoUpload\")\n");
      out.write("                                .onchange = function (event) {\n");
      out.write("                                    let file = event.target.files[0];\n");
      out.write("                                    let blobURL = URL.createObjectURL(file);\n");
      out.write("                                    document.querySelector(\"video\").src = blobURL;\n");
      out.write("                                }\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li class=\"active\"><a>List</a><span class=\"submenu-indicator\"></span>\r\n");
        out.write("                            <ul class=\"nav-dropdown nav-submenu\">\r\n");
        out.write("                                <li><a href=\"practicelist?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&subjectID=-1\">Practice List</a></li>\r\n");
        out.write("                                <li><a href=\"registration?search=&page=1&name=regId&type=ASC&subName=&status=&from=&to=\">Registration List</a></li>\r\n");
        out.write("                                <li><a href=\"postlist\">Post List</a></li>\r\n");
        out.write("                                <li><a href=\"sliderlist?keyword=&page=1&status=\">Slider List</a></li>\r\n");
        out.write("                                <li><a href=\"lesson?status=2\">Lesson List</a></li>\r\n");
        out.write("                                <li><a href=\"AdminSubjectList\">Subject List</a></li>\r\n");
        out.write("                            </ul>\r\n");
        out.write("                        </li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li><a href=\"userregistration\">My Registration</a></li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"#\" class=\"alio_green\" data-toggle=\"modal\" data-target=\"#login\">\r\n");
        out.write("                                    <i class=\"fas fa-sign-in-alt mr-1\"></i><span class=\"dn-lg\">Sign In</span>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li class=\"add-listing theme-bg\">\r\n");
        out.write("                                <a href=\"#\" class=\"text-white\">Get Started</a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSub}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("sub");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sub.subjectId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qsub==sub.subjectId ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sub.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDimen}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("dimen");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dimen.dimensionId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qdimen==dimen.dimensionId ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dimen.dimensionName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listLesson}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("lesson");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lesson.lessonId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qlesson==lesson.lessonId ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lesson.getLessonName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ansNumber < 10}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                        <div class=\"elkios\">\n");
        out.write("                                                                            <a href=\"addAnswer?questid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.questionId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"add_new_btn\"><i class=\"fas fa-plus-circle mr-1\"></i>Add answer</a>\n");
        out.write("                                                                        </div>\n");
        out.write("                                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAns}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("ans");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                                <tr>\n");
          out.write("                                                                                    <td hidden><input name=\"ansid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.answerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required></td>\n");
          out.write("                                                                                    <td><span class=\"smalls lg\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.answerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></td>\n");
          out.write("                                                                                    <td>\n");
          out.write("                                                                                        <input type=\"text\" name=\"content\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.answerContent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\n");
          out.write("                                                                                    </td>\n");
          out.write("                                                                                    <td>\n");
          out.write("                                                                                        <select name=\"iscorrect\">\n");
          out.write("                                                                                            <option value=\"1\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.isCorrect==true ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">True</option>\n");
          out.write("                                                                                            <option value=\"0\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.isCorrect==false ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">False</option>\n");
          out.write("                                                                                        </select>\n");
          out.write("                                                                                    </td>   \n");
          out.write("                                                                                    <td>\n");
          out.write("                                                                                        <select name=\"ansstatus\">\n");
          out.write("                                                                                            <option value=\"1\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.status==true ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">True</option>\n");
          out.write("                                                                                            <option value=\"0\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ans.status==false ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">False</option>\n");
          out.write("                                                                                        </select>\n");
          out.write("                                                                                    </td>\n");
          out.write("                                                                                </tr>\n");
          out.write("                                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
