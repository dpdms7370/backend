/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-07-22 08:48:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/member/../inc/header.jsp", Long.valueOf(1658209198584L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655111724464L));
    _jspx_dependants.put("/WEB-INF/views/member/../inc/head.jsp", Long.valueOf(1657702791434L));
    _jspx_dependants.put("/WEB-INF/views/member/../inc/footer.jsp", Long.valueOf(1657699159009L));
    _jspx_dependants.put("jar:file:/D:/kimyen/jsp3/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/web05/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/kimyen/jsp3/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/web05/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("<title>로그인을 하세요.</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();

      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("<!-- 메타 데이터 -->\r\n");
      out.write("<!-- 파비콘 -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"https://papago.naver.com/favicon.ico\" />\r\n");
      out.write("<!-- 오픈그래프 -->\r\n");
      out.write("<!-- 폰트 -->\r\n");
      out.write("<!-- 필수 플러그인 -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/inc/jquery-latest.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- Bootstrap icons-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- Core theme JS-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/inc/scripts.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- 외부 스타일 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/styles.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/datatables.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".col-lg-6{width:300px;}\r\n");
      out.write("form:label { display:inline-block; }\r\n");
      out.write(".login{margin: 10rem auto; }\r\n");
      out.write(".tit{text-align:center;}\r\n");
      out.write(".contents{margin:10rem 0;}\r\n");
      out.write(".form-control {display: block;\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    padding: 0.375rem 0.75rem;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("    color: #212529;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    background-clip: padding-box;\r\n");
      out.write("    border: 1px solid #ced4da;\r\n");
      out.write("    -webkit-appearance: none;\r\n");
      out.write("    -moz-appearance: none;\r\n");
      out.write("    appearance: none;\r\n");
      out.write("    border-radius: 0.25rem;\r\n");
      out.write("    transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("input:first-child{margin-bottom:1rem;}\r\n");
      out.write(".text-right{\r\n");
      out.write("	 margin: 0 auto;\r\n");
      out.write("	 width: 12%;\r\n");
      out.write("	 padding: 0.375rem 2rem;} // 작게 만들었을 때 이걸 없애면 화면에서 버튼 란이 움직임\r\n");
      out.write(".msg{text-align: center;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	String path_hd = request.getContextPath();

      out.write("\r\n");
      out.write("<header id=\"header\" class=\"header\">\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("	    <div class=\"container px-4 px-lg-5\">\r\n");
      out.write("	        <a class=\"navbar-brand\" href=\"");
      out.print(path_hd );
      out.write("/\">Hang on own taste<i class=\"xi-emoticon-cool\"></i></a>\r\n");
      out.write("	        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("	        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("	            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4\">\r\n");
      out.write("	                <!-- <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"#!\">Home</a></li> -->\r\n");
      out.write("	                <li class=\"nav-item dropdown\">\r\n");
      out.write("	                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown1\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">About</a>\r\n");
      out.write("	                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown1\">\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/\">Yen Shop</a></li>\r\n");
      out.write("	                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/cart/cartList.do\">Get your Cart<i class=\"xi-basket\"></i></a></li>\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/board/list.do\">Board</a></li> \r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/board/pageList.do?curPage=1\">Notice2</a></li>\r\n");
      out.write("	                    </ul>\r\n");
      out.write("	                </li>\r\n");
      out.write("	                <li class=\"nav-item dropdown\">\r\n");
      out.write("	                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown2\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Shop</a>\r\n");
      out.write("	                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown2\">\r\n");
      out.write("	                         <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/product/productList.do\">All Products</a></li>\r\n");
      out.write("	                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/product/productList.do\">Popular Items</a></li>\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"#!\">New Arrivals</a></li>\r\n");
      out.write("	                    </ul>\r\n");
      out.write("	                </li>\r\n");
      out.write("	            </ul>\r\n");
      out.write("	            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4\">\r\n");
      out.write("	            	");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /WEB-INF/views/member/../inc/header.jsp(38,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("	                <li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/member/loginForm.do\"><strong>Login</strong></a></li>\r\n");
            out.write("	                <li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/member/joinForm.do\"><strong>join</strong></a></li>\r\n");
            out.write("	                ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("	               	");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f1_reused = false;
      try {
        _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f1.setParent(null);
        // /WEB-INF/views/member/../inc/header.jsp(42,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
        if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/member/logout.do\"><strong>Logout</strong></a></li>\r\n");
            out.write("	                <li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/member/mypage.do\"><strong>mypage</strong></a></li>\r\n");
            out.write("	                <li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/service/sendEmail.do\"><strong>Contact</strong></a></li>\r\n");
            out.write("	                ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
        _jspx_th_c_005fif_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
      }
      out.write("\r\n");
      out.write("	               	");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f2_reused = false;
      try {
        _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f2.setParent(null);
        // /WEB-INF/views/member/../inc/header.jsp(47,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.cid == 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
        if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/admin/admin.do\"><strong>관리자 페이지로<i class=\"xi-piggy-bank\"></i></strong></a></li>\r\n");
            out.write("	                ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
        _jspx_th_c_005fif_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
      }
      out.write("\r\n");
      out.write("	            </ul>\r\n");
      out.write("	            <form class=\"d-flex\">\r\n");
      out.write("	                <button class=\"btn btn-outline-dark\" type=\"submit\">\r\n");
      out.write("	                    <i class=\"bi-cart-fill me-1\"></i>\r\n");
      out.write("	                    <a id=\"need\"  href=\"");
      out.print(path_hd );
      out.write("/cart/cartList.do\">Cart</a>\r\n");
      out.write("	                    <span class=\"badge bg-dark text-white ms-1 rounded-pill\">0</span>\r\n");
      out.write("	                </button>\r\n");
      out.write("	            </form>\r\n");
      out.write("	        </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div id=\"contents\" class=\"contents\">\r\n");
      out.write("		<h2 class=\"tit\"><strong>로그인</strong></h2>\r\n");
      out.write("		<div class=\"panel-body\">\r\n");
      out.write("		    <div class=\"row\">\r\n");
      out.write("		        <div class=\"col-lg-6\" id=\"fr1\">\r\n");
      out.write("					<form action=\"loginPro.do\" method=\"post\" id=\"frm1\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("						<!-- 	<label for=\"cid\" class=\"form-con\">아이디</label> -->\r\n");
      out.write("							<input type=\"text\" name=\"cid\" id=\"cid\" class=\"form-control\" placeholder=\"아이디를 입력하세요.\" required/>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("						<!-- 	<label for=\"cpw\" class=\"form-con\" >비밀번호</label> -->\r\n");
      out.write("							<input type=\"password\" name=\"cpw\" id=\"cpw\" class=\"form-control\" placeholder=\"비밀번호를 입력하세요.\" required/>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<div class=\"text-right\">\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-primary\">로그인</button>\r\n");
      out.write("								<button type=\"reset\" class=\"btn btn-primary\">취소</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("					</script>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>	\r\n");
      out.write("	</div>	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<footer class=\"py-5 bg-dark\">\r\n");
      out.write("    <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright ©KYYSHOP 2022.07.07</p></div>\r\n");
      out.write("</footer>");
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/views/member/loginForm.jsp(66,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg == false }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<div class=\"msg\" id=\"msg\">아이디 또는 비밀번호 입력이 잘못되어 로그인이 실패되었습니다.</div>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/member/../inc/footer.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path_ft");
      // /WEB-INF/views/member/../inc/footer.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/member/../inc/footer.jsp(5,0) '{pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression("{pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
