/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-30 00:50:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpServletRequest;

public final class sightB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/top.jsp", Long.valueOf(1693311877947L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpServletRequest");
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
      out.write("<title>|CottageStay| Sights</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메뉴 베너</title>\r\n");
      out.write("<style>\r\n");
      out.write("#bodiv {\r\n");
      out.write("	background-color : #222d1c;\r\n");
      out.write("	width : 100%;\r\n");
      out.write("	height : 20%;\r\n");
      out.write("}\r\n");
      out.write("td { \r\n");
      out.write("	font-size:12; \r\n");
      out.write("	text-align:center;\r\n");
      out.write("	color:white;\r\n");
      out.write("}\r\n");
      out.write("a:link {text-decoration:none; color:white;}\r\n");
      out.write("a:visited {text-decoration:none; color:white;}\r\n");
      out.write("a:hover {text-decoration:none; color:white;}\r\n");
      out.write("a:active {text-decoration:none; color:white;}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("var muCnt = 5;\r\n");
      out.write("\r\n");
      out.write("function fncShow( pos ) {\r\n");
      out.write("	var i = 0;\r\n");
      out.write("	for(i; i < muCnt; i++) {\r\n");
      out.write("		var obj = document.getElementById(\"menu\" + i);\r\n");
      out.write("		var obj2 = document.getElementById(\"m\" + i);\r\n");
      out.write("		if(i == pos) {\r\n");
      out.write("			obj.style.display = '';\r\n");
      out.write("			obj2.style.color = \"#b4823d\";\r\n");
      out.write("		} else {\r\n");
      out.write("			obj.style.display = 'none';\r\n");
      out.write("			obj2.style.color = \"#ffffff\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function fncHide( pos ) {\r\n");
      out.write("	var obj = document.getElementById(\"menu\" + pos);\r\n");
      out.write("	obj.style.display = 'none';\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"bodiv\">\r\n");
      out.write("<table style=\"width : 750px; margin : auto;\">\r\n");
      out.write("<td width='150'><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/main\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/logo.jpg\" width='150' height='120' border='0'></a>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<table cellpadding='0' cellspacing='1' border='0' width='600' height='60'>\r\n");
      out.write("	<tr style=\"height:30px; margin-top:80px;\">\r\n");
      out.write("		<td width='100' onmouseover='fncShow(0);' id='m0' style=\"cursor:pointer\"><b>리조트소개</b></td>\r\n");
      out.write("		<td width='100' onmouseover='fncShow(1);' id='m1' style=\"cursor:pointer\"><b>찾아오기</b></td>\r\n");
      out.write("		<td width='100' onmouseover='fncShow(2);' id='m2' style=\"cursor:pointer\"><b>주변여행지</b></td>\r\n");
      out.write("		<td width='100' onmouseover='fncShow(3);' id='m3' style=\"cursor:pointer\"><b>예약하기</b></td>\r\n");
      out.write("		<td width='100' onmouseover='fncShow(4);' id='m4' style=\"cursor:pointer\"><b>리조트소식</b></td>\r\n");
      out.write("		<td width='100'></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr height='30'>\r\n");
      out.write("		<td colspan='6'>\r\n");
      out.write("			<table id='menu0' style=\"display:none; border:0px; width:600px; height:30px;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td width='0'></td>\r\n");
      out.write("					<td width='600' style='text-align:left;'>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/main'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d'; onmouseout=this.style.color='#ffffff';>| Home </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cabinA'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d'; onmouseout=this.style.color='#ffffff';>| Cabin A </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cabinB'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d'; onmouseout=this.style.color='#ffffff';>| Cabin B </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cabinC'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d'; onmouseout=this.style.color='#ffffff';>| Cabin C |</span>\r\n");
      out.write("						</a>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<table id='menu1' style=\"display:none; border:0px; width:600px; height:30px;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td width='100'></td>\r\n");
      out.write("					<td width='500' style=\"text-align:left;\">\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/location'>\r\n");
      out.write("						<span onmouseover=this.style.color=\"#b4823d\"; onmouseout=this.style.color='#ffffff'>| 찾아오는길 </span>\r\n");
      out.write("						</a>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<table id='menu2' style=\"display:none; border:0px; width:600px; height:30px;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td width='200'></td>\r\n");
      out.write("					<td width='400' style='text-align:left;'>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sightA'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| Hardscrabble Mountain </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sightB'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| White River </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sightC'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| Dewey Park | </span>\r\n");
      out.write("						</a>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<table id='menu3' style=\"display:none; border:0px; width:600px; height:30px;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td width='100'></td>\r\n");
      out.write("					<td width='600' style='text-align:left;'>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/d_01' >\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 예약상황 </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resv'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 예약하기 </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/d_03'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 예약변경 </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/adm_allview'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 관리자페이지 </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/adm_logout'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 관리자로그아웃 | </span>\r\n");
      out.write("						</a>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<table id='menu4' style=\"display:none; border:0px; width:600px; height:30px;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td width='350'></td>\r\n");
      out.write("					<td width='250' style='text-align:left;'>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/e_01'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 리조트 소식 </span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/e_02'>\r\n");
      out.write("						<span onmouseover=this.style.color='#b4823d' onmouseout=this.style.color='#ffffff'>| 이용후기 | </span>\r\n");
      out.write("						</a>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<center>\r\n");
      out.write("		<h2>주변 관광지로 White River 국립공원을 추천드립니다!</h2>\r\n");
      out.write("		<br> <img\r\n");
      out.write("			src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/MaroonBells.HeatherRousseau1_1.jpg\"\r\n");
      out.write("			width=100%>\r\n");
      out.write("	</center>\r\n");
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
