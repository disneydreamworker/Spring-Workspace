/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-06 03:54:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reviewForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/top.jsp", Long.valueOf(1693802891757L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1693808333540L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>|CottageStay| Reviews</title>\r\n");
      out.write("<style>\r\n");
      out.write("    #reviewText {\r\n");
      out.write("        max-height: 150px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title>menu header//bootstrap applied</title>\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<!--    Favicons-->\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/favicons/apple-touch-icon.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/favicons/favicon-32x32.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/favicons/favicon-16x16.png\">\r\n");
      out.write("	<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/favicons/favicon.ico\">\r\n");
      out.write("	<link rel=\"manifest\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/favicons/manifest.json\">\r\n");
      out.write("	<meta name=\"msapplication-TileImage\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/favicons/mstile-150x150.png\">\r\n");
      out.write("	<meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<!--    Favicons-->\r\n");
      out.write("	<!-- ===============================================-->	\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- 	<link rel=\"manifest\" href=\"/manifest.json\">  -->\r\n");
      out.write("<!-- 	<meta name=\"msapplication-TileColor\" content=\"#ffffff\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 	<meta name=\"theme-color\" content=\"#ffffff\"> -->\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<!--    Stylesheets-->\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/css/theme.css\" rel=\"stylesheet\" />\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<!--    Stylesheets-->\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css?family=Volkhov:400i\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/animate.css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/components-font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/et-line-font/et-line-font.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/flexslider/flexslider.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/owl.carousel/dist/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/magnific-popup/dist/magnific-popup.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/simple-text-rotator/simpletextrotator.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/css/style.css\" rel=\"stylesheet\"> \r\n");
      out.write("	<link id=\"color-scheme\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/css/colors/default.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<!--    JavaScripts-->\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/vendors/@popperjs/popper.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/vendors/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/vendors/is/is.min.js\"></script>\r\n");
      out.write("	<script	src=\"https://polyfill.io/v3/polyfill.min.js?features=window.scroll\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/vendors/feather-icons/feather.min.js\"></script>\r\n");
      out.write("	<script>feather.replace();</script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/js/theme.js\"></script>\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css2?family=Jost:wght@200;300;400;500;600;700;800;900&amp;display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("	<!--   NAV-->\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("		<nav\r\n");
      out.write("			class=\"navbar navbar-expand-lg navbar-light fixed-top py-3 d-block\"\r\n");
      out.write("			data-navbar-on-scroll=\"data-navbar-on-scroll\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<a class=\"navbar-brand d-inline-flex\"\r\n");
      out.write("					href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/main'><img\r\n");
      out.write("					class=\"d-inline-block\"\r\n");
      out.write("					src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/img/gallery/logo.png\"\r\n");
      out.write("					alt=\"logo\" /><span class=\"text-1000 fs-0 fw-bold ms-2\">Majestic</span></a>\r\n");
      out.write("				<button class=\"navbar-toggler collapsed\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("					aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("					aria-label=\"Toggle navigation\">\r\n");
      out.write("					<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0\"\r\n");
      out.write("					id=\"navbarSupportedContent\">\r\n");
      out.write("					<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("						<li class=\"nav-item px-2\"><a\r\n");
      out.write("							class=\"nav-link fw-medium active\" aria-current=\"page\"\r\n");
      out.write("							href=\"#categoryWomen\">About</a></li>\r\n");
      out.write("						<li class=\"nav-item px-2\"><a class=\"nav-link fw-medium\"\r\n");
      out.write("							href=\"#header\">Visits</a></li>\r\n");
      out.write("						<li class=\"nav-item px-2\"><a class=\"nav-link fw-medium\"\r\n");
      out.write("							href=\"#collection\">Events</a></li>\r\n");
      out.write("						<li class=\"nav-item px-2\"><a class=\"nav-link fw-medium\"\r\n");
      out.write("							href=\"#outlet\">More</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("	            <form class=\"d-flex\"><a class=\"text-1000\" href=\"#!\">\r\n");
      out.write("	                <svg class=\"feather feather-phone me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("	                  <path d=\"M22 16.92v3a2 2 0 0 1-2.18 2 19.79 19.79 0 0 1-8.63-3.07 19.5 19.5 0 0 1-6-6 19.79 19.79 0 0 1-3.07-8.67A2 2 0 0 1 4.11 2h3a2 2 0 0 1 2 1.72 12.84 12.84 0 0 0 .7 2.81 2 2 0 0 1-.45 2.11L8.09 9.91a16 16 0 0 0 6 6l1.27-1.27a2 2 0 0 1 2.11-.45 12.84 12.84 0 0 0 2.81.7A2 2 0 0 1 22 16.92z\"></path>\r\n");
      out.write("	                </svg></a><a class=\"text-1000\" href=\"#!\">\r\n");
      out.write("	                <svg class=\"feather feather-shopping-cart me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("	                  <circle cx=\"9\" cy=\"21\" r=\"1\"></circle>\r\n");
      out.write("	                  <circle cx=\"20\" cy=\"21\" r=\"1\"></circle>\r\n");
      out.write("	                  <path d=\"M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6\"></path>\r\n");
      out.write("	                </svg></a><a class=\"text-1000\" href=\"#!\">\r\n");
      out.write("	                <svg class=\"feather feather-search me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("	                  <circle cx=\"11\" cy=\"11\" r=\"8\"></circle>\r\n");
      out.write("	                  <line x1=\"21\" y1=\"21\" x2=\"16.65\" y2=\"16.65\"></line>\r\n");
      out.write("	                </svg></a><a class=\"text-1000\" href=\"#!\">\r\n");
      out.write("	                <svg class=\"feather feather-user me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("	                  <path d=\"M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2\"></path>\r\n");
      out.write("	                  <circle cx=\"12\" cy=\"7\" r=\"4\"></circle>\r\n");
      out.write("	                </svg></a><a class=\"text-1000\" href=\"#!\">\r\n");
      out.write("	                <svg class=\"feather feather-heart me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("	                  <path d=\"M20.84 4.61a5.5 5.5 0 0 0-7.78 0L12 5.67l-1.06-1.06a5.5 5.5 0 0 0-7.78 7.78l1.06 1.06L12 21.23l7.78-7.78 1.06-1.06a5.5 5.5 0 0 0 0-7.78z\"></path>\r\n");
      out.write("	                </svg></a></form>\r\n");
      out.write("	          </div>\r\n");
      out.write("	        </div>\r\n");
      out.write("	      </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- ===============================================-->\r\n");
      out.write("    <!--    JavaScripts-->\r\n");
      out.write("    <!-- ===============================================-->\r\n");
      out.write("    <script src=\"vendors/@popperjs/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"vendors/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"vendors/is/is.min.js\"></script>\r\n");
      out.write("    <script src=\"https://polyfill.io/v3/polyfill.min.js?features=window.scroll\"></script>\r\n");
      out.write("    <script src=\"vendors/feather-icons/feather.min.js\"></script>\r\n");
      out.write("    <script>feather.replace();</script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/majestic/assets/js/theme.js\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Jost:wght@200;300;400;500;600;700;800;900&amp;display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- ===============================================-->\r\n");
      out.write("    <!--    JavaScripts-->\r\n");
      out.write("    <!-- ===============================================-->\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/jquery/dist/jquery.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/wow/dist/wow.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/isotope/dist/isotope.pkgd.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/imagesloaded/imagesloaded.pkgd.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/flexslider/jquery.flexslider.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/owl.carousel/dist/owl.carousel.min.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/smoothscroll.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/magnific-popup/dist/jquery.magnific-popup.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/lib/simple-text-rotator/jquery.simple-text-rotator.min.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/js/plugins.js\"></script>\r\n");
      out.write("	<script	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/titan/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<section class=\"module-small\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"comment-form\">\r\n");
      out.write("					<h4 class=\"comment-form-title font-alt\">Add your review</h4>\r\n");
      out.write("					\r\n");
      out.write("					<form method=\"post\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label class=\"sr-only\" for=\"reservationId\">Reservation Id</label>\r\n");
      out.write("							<input class=\"form-control\" id=\"reservationId\" type=\"text\"\r\n");
      out.write("								name=\"reservationId\" placeholder=\"Reservation Id\" required\r\n");
      out.write("								pattern=\"[0-9]+\" maxlength=\"10\" />\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label class=\"sr-only\" for=\"email\">Email</label> <input\r\n");
      out.write("								class=\"form-control\" id=\"reviewEmail\" type=\"text\"\r\n");
      out.write("								name=\"reviewEmail\" placeholder=\"E-mail\" required\r\n");
      out.write("								pattern=\"[A-Za-z가-힣0-9]+@[A-Za-z가-힣0-9]+\\.[A-Za-z가-힣0-9]+\"\r\n");
      out.write("								maxlength=\"30\" />\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<textarea class=\"form-control\" id=\"reviewText\" name=\"reviewText\"\r\n");
      out.write("								placeholder=\"Review\" required pattern=\"[A-Za-z가-힣0-9]+\"\r\n");
      out.write("								maxlength=\"100000\"></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button class=\"btn btn-round btn-d\" type=\"submit\">Post\r\n");
      out.write("							review</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>하단 메뉴</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("      <section class=\"py-0 pt-7\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-6 col-lg-2 mb-3\">\r\n");
      out.write("              <h5 class=\"lh-lg fw-bold text-1000\">Company Info</h5>\r\n");
      out.write("              <ul class=\"list-unstyled mb-md-4 mb-lg-0\">\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">About Us</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Affiliate</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Fashion Blogger</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-6 col-lg-2 mb-3\">\r\n");
      out.write("              <h5 class=\"lh-lg fw-bold text-1000\">Help &amp; Support</h5>\r\n");
      out.write("              <ul class=\"list-unstyled mb-md-4 mb-lg-0\">\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Shipping Info</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Refunds</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">How to Order</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">How to Track</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Size Guides</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-6 col-lg-2 mb-3\">\r\n");
      out.write("              <h5 class=\"lh-lg fw-bold text-1000\">Customer Care</h5>\r\n");
      out.write("              <ul class=\"list-unstyled mb-md-4 mb-lg-0\">\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Contact Us</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Payment Methods</a></li>\r\n");
      out.write("                <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none\" href=\"#!\">Bonus Point</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-6 col-lg-auto ms-auto\">\r\n");
      out.write("              <h5 class=\"lh-lg fw-bold text-1000\">Signup For The Latest News</h5>\r\n");
      out.write("              <div class=\"row input-group-icon mb-5\">\r\n");
      out.write("                <div class=\"col-12\">\r\n");
      out.write("                  <input class=\"form-control input-box\" type=\"email\" placeholder=\"Enter Email\" aria-label=\"email\" />\r\n");
      out.write("                  <svg class=\"bi bi-arrow-right-short input-box-icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"23\" height=\"23\" fill=\"#424242\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M4 8a.5.5 0 0 1 .5-.5h5.793L8.146 5.354a.5.5 0 1 1 .708-.708l3 3a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708-.708L10.293 8.5H4.5A.5.5 0 0 1 4 8z\"> </path>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <p class=\"text-800\">\r\n");
      out.write("                <svg class=\"feather feather-phone me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                  <path d=\"M22 16.92v3a2 2 0 0 1-2.18 2 19.79 19.79 0 0 1-8.63-3.07 19.5 19.5 0 0 1-6-6 19.79 19.79 0 0 1-3.07-8.67A2 2 0 0 1 4.11 2h3a2 2 0 0 1 2 1.72 12.84 12.84 0 0 0 .7 2.81 2 2 0 0 1-.45 2.11L8.09 9.91a16 16 0 0 0 6 6l1.27-1.27a2 2 0 0 1 2.11-.45 12.84 12.84 0 0 0 2.81.7A2 2 0 0 1 22 16.92z\"></path>\r\n");
      out.write("                </svg><span class=\"text-800\">+3930219390</span>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p class=\"text-800\">\r\n");
      out.write("                <svg class=\"feather feather-mail me-3\" xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                  <path d=\"M4 4h16c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2z\"></path>\r\n");
      out.write("                  <polyline points=\"22,6 12,13 2,6\"></polyline>\r\n");
      out.write("                </svg><span class=\"text-800\">something@gmail.com</span>\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"border-bottom border-3\"></div>\r\n");
      out.write("          <div class=\"row flex-center my-3\">\r\n");
      out.write("            <div class=\"col-md-6 order-1 order-md-0\">\r\n");
      out.write("              <p class=\"my-2 text-1000 text-center text-md-start\"> Made with&nbsp;\r\n");
      out.write("                <svg class=\"bi bi-suit-heart-fill\" xmlns=\"http://www.w3.org/2000/svg\" width=\"15\" height=\"15\" fill=\"#EB6453\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                  <path d=\"M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z\"></path>\r\n");
      out.write("                </svg>&nbsp;by&nbsp;<a class=\"text-800\" href=\"https://themewagon.com/\" target=\"_blank\">ThemeWagon </a>\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("              <div class=\"text-center text-md-end\"><a href=\"#!\"><span class=\"me-4\" data-feather=\"facebook\"></span></a><a href=\"#!\"> <span class=\"me-4\" data-feather=\"instagram\"></span></a><a href=\"#!\"> <span class=\"me-4\" data-feather=\"youtube\"></span></a><a href=\"#!\"> <span class=\"me-4\" data-feather=\"twitter\"></span></a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end of .container-->\r\n");
      out.write("      </section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
