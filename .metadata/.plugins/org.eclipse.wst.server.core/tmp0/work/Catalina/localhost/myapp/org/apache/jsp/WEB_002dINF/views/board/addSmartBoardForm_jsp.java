/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-07-14 05:34:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addSmartBoardForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/board/../inc/head.jsp", Long.valueOf(1657702791434L));
    _jspx_dependants.put("/WEB-INF/views/board/../inc/footer.jsp", Long.valueOf(1657699159009L));
    _jspx_dependants.put("/WEB-INF/views/board/../inc/header.jsp", Long.valueOf(1657776202598L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655111724464L));
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
      out.write("<title>공지사항 글쓰기</title>\r\n");
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
      out.write("<script src=\"../ckeditor/ckeditor.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("	                <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"#!\">Home</a></li>\r\n");
      out.write("	                <li class=\"nav-item dropdown\">\r\n");
      out.write("	                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown1\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">About</a>\r\n");
      out.write("	                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown1\">\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path_hd );
      out.write("/\">Yen Shop</a></li>\r\n");
      out.write("	                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("	                        <li><a class=\"dropdown-item\" href=\"#!\">Popular Items</a></li>\r\n");
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
        // /WEB-INF/views/board/../inc/header.jsp(38,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        // /WEB-INF/views/board/../inc/header.jsp(42,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        // /WEB-INF/views/board/../inc/header.jsp(47,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.cid == 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
        if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
            out.print(path_hd );
            out.write("/admin/admin.do\"><strong>관리자 페이지로</strong></a></li>\r\n");
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
      out.write("	                    Cart\r\n");
      out.write("	                    <span class=\"badge bg-dark text-white ms-1 rounded-pill\">0</span>\r\n");
      out.write("	                </button>\r\n");
      out.write("	            </form>\r\n");
      out.write("	        </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("<div id=\"contents\" class=\"contents\">\r\n");
      out.write("	<div class=\"container px-4 px-lg-5 mt-5\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<br><br>		\r\n");
      out.write("			<h2 class=\"tit\">공지사항 등록</h2>\r\n");
      out.write("			<div class=\"example\">\r\n");
      out.write("				<div class=\"mb-3\" style=\"width:80%; margin:0 auto;\">\r\n");
      out.write("					<form action=\"addSmartBoard.do\" method=\"post\">\r\n");
      out.write("						<table class=\"table\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th><label for=\"btitle\">제목</label></th>\r\n");
      out.write("									<td><input type=\"text\" name=\"btitle\" id=\"btitle\" size=\"100\" class=\"single100\" placeholder=\"글제목 입력\" required></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th><label for=\"exampleTextarea1\" class=\"form-label\">글 내용</label></th>\r\n");
      out.write("									<td><textarea class=\"form-control\" name=\"content\" id=\"ckeditor\" rows=\"6\"></textarea></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th><label for=\"nickname\">작성자</label></th>\r\n");
      out.write("									<td><input type=\"text\" name=\"bwriter\" id=\"bwriter\" size=\"40\" class=\"single40\" value=\"admin\" readonly></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td colspan=\"2\">\r\n");
      out.write("										<input type=\"submit\" class=\"btn btn-primary\" value=\"글 등록\">\r\n");
      out.write("										<input type=\"reset\" class=\"btn btn-primary\" value=\"취소\">\r\n");
      out.write("									</td>\r\n");
      out.write("								</tr>	\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</form>	\r\n");
      out.write("					<script>\r\n");
      out.write("					$(function(){\r\n");
      out.write("						CKEDITOR.replace('ckeditor', {width:\"100%\", height:\"400px\", filebrowserUploadUrl:\"fileupload.do\"});\r\n");
      out.write("					});\r\n");
      out.write("					</script>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>		\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<footer class=\"py-5 bg-dark\">\r\n");
      out.write("    <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright ©KYYSHOP 2022.07.07</p></div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
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
      // /WEB-INF/views/board/../inc/footer.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path_ft");
      // /WEB-INF/views/board/../inc/footer.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/board/../inc/footer.jsp(5,0) '{pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression("{pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
