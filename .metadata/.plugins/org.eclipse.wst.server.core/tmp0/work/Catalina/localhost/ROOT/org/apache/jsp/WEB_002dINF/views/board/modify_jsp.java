/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.43
 * Generated at: 2017-08-01 10:53:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css\">\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-1.10.2.js\"></script> \n");
      out.write("\t<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- 스프링 시큐리티 ajax csrf설정 403에러  -->\n");
      out.write("\t<meta name=\"_csrf\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t<!-- default header name is X-CSRF-TOKEN -->\n");
      out.write("\t<meta name=\"_csrf_header\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t<!-- 스프링 시큐리티 ajax csrf설정 403에러  -->\n");
      out.write("\t\t\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<h1>modify Page</h1>\n");
      out.write("\t<form method=\"post\">\n");
      out.write("\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t<label>제목</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-11 \">\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardVO.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t<label>내용</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-11\">\n");
      out.write("\t\t\t\t<textarea rows=\"20\" cols=\"50\" id=\"content\" name=\"content\"></textarea>\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"contentVal\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardVO.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t<label for=\"file\">사진</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-11\">\n");
      out.write("\t\t\t\t<input type='file' name=\"file\" id=\"file\" >\n");
      out.write("\t\t\t\t<p class=\"help-block\">수정하고싶은 사진을 올려주세요</p>\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"photo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardVO.photo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"imageBox\"> \n");
      out.write("\t\t\t<img src='/displayFile?fileName=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardVO.photo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'class='boardImage'/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<a href=\"#\" id=\"modifyBtn\">수정완료</a>\n");
      out.write("\t\t<a href=\"#\" id=\"modifyCancle\">수정취소</a>\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t\n");
      out.write("\t\t<input type=\"hidden\" id=\"firstphoto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardVO.photo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"boardno\" id=\"boardno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardVO.boardno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t<input type=\"hidden\" id=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t\n");
      out.write("\t\t$(function () {\n");
      out.write("\t\t\tvar token = $(\"meta[name='_csrf']\").attr(\"content\");\n");
      out.write("\t\t\tvar header = $(\"meta[name='_csrf_header']\").attr(\"content\");\n");
      out.write("\t\t\t$(document).ajaxSend(function(e, xhr, options) {\n");
      out.write("\t\t\t\txhr.setRequestHeader(header, token);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write(" \t\t var firstImageUrl = $(\"#firstphoto\").val();\n");
      out.write("\t\t var check =false;\n");
      out.write("\t\t var preUrl = \"\";\n");
      out.write("\t\t \n");
      out.write("\t\t var contentText =$(\"#contentVal\").val().replace(/<s>/g,\" \").replace(/<e>/g,\"\\n\"); //텍스트 엔터,띄어쓰기 처리 부분\n");
      out.write("\t\t $(\"#content\").text(contentText);\n");
      out.write("\t\t \n");
      out.write("\t     $(\"#file\").change(function(){\n");
      out.write("\t    \t console.log(\"sss\");\n");
      out.write("\t    \t var formData = new FormData();\n");
      out.write("\t         formData.append(\"file\", $(\"input[name=file]\")[0].files[0]);//파일의 정보를 formData에 삽입 \n");
      out.write("\t        \n");
      out.write("\t         $.ajax({ //image 파일 폴더에 생성\n");
      out.write("\t             type : \"post\",\n");
      out.write("\t             url : \"/imageUpload\",\n");
      out.write("\t             dataType : \"text\",\n");
      out.write("\t             data : formData,\n");
      out.write("\t             processData : false,\n");
      out.write("\t             contentType : false,\n");
      out.write("\t             success : function(imgPath) {\n");
      out.write("\t                if(imgPath) {\n");
      out.write("\t                \tif(check){\n");
      out.write("\t                \t\timageDelete(preUrl,imgPath);\n");
      out.write("\t                \t \t$(\"input[name=photo]\").val(imgPath);\n");
      out.write("\t                     \tpreUrl = imgPath;\n");
      out.write("\t                \t}else{\n");
      out.write("\t                \t\tcheck = true;\n");
      out.write("\t                \t \tpreUrl = imgPath;\n");
      out.write("\t\t                \tvar str = \"<img src='/displayFile?fileName=\"+imgPath+\"'class='boardImage'/>\";\n");
      out.write("\t\t                \t$(\"input[name=photo]\").val(imgPath);\n");
      out.write("\t\t                \t$(\"#imageBox\").empty(); //imageBox 안에 태그 비우기 \n");
      out.write("\t\t                \t$(\"#imageBox\").append(str);\n");
      out.write("\t                \t}\n");
      out.write("\t                } else {\n");
      out.write("\t                   alert(\"Image File please\");\n");
      out.write("\t                }\n");
      out.write("\t             }\n");
      out.write("\t          });\n");
      out.write("\t    });\n");
      out.write("\t    function imageDelete(preUrl,imgPath) {\n");
      out.write("\t\t\tconsole.log(\"imgPath\"+imgPath);\n");
      out.write("\t\t\tconsole.log(\"preUrl\"+preUrl);\n");
      out.write("\t         $.ajax({\n");
      out.write("\t            url : \"/deleteFile\",\n");
      out.write("\t            type : \"post\",\n");
      out.write("\t            data : {\n");
      out.write("\t               fileName : preUrl\n");
      out.write("\t            },\n");
      out.write("\t            dataType : \"text\",\n");
      out.write("\t            success : function(result) {\n");
      out.write("\t               $(\"#imageBox\").empty(); //imageBox 안에 태그 비우기 \n");
      out.write("                \tvar str = \"<img src='/displayFile?fileName=\"+imgPath+\"'class='boardImage'/>\";\n");
      out.write("                \t$(\"#imageBox\").append(str);\n");
      out.write("\t            }\n");
      out.write("\t         });\n");
      out.write("\t      };\n");
      out.write("\t      $(\"#modifyBtn\").click(function(event){ //수정완료시\n");
      out.write("\t  \t\tevent.preventDefault(); //화면 링크 방지 \n");
      out.write("\t  \t\t//기존 사진 삭제 \n");
      out.write("\t  \t\t$.ajax({\n");
      out.write("\t              url : \"/deleteFile\",\n");
      out.write("\t              type : \"post\",\n");
      out.write("\t              data : {\n");
      out.write("\t                 fileName : firstImageUrl\n");
      out.write("\t              },\n");
      out.write("\t              dataType : \"text\",\n");
      out.write("\t              success : function(result) {\n");
      out.write("\t             \tif(result){\n");
      out.write("\t             \t\t$(\"form\").attr(\"action\",\"/board/modifyComplete\");\n");
      out.write("\t          \t\t\t$(\"form\").submit();\t\n");
      out.write("\t             \t}\n");
      out.write("\t              }\n");
      out.write("\t           });\n");
      out.write("\t  \t});\n");
      out.write("\t  \t$(\"#modifyCancle\").click(function(event){ //수정취소시\n");
      out.write("\t  \t\tevent.preventDefault(); //화면 링크 방지 \n");
      out.write("\t  \t\tif(check){ //기존 사진 변화가 있으면\n");
      out.write("\t  \t \t\t$.ajax({\n");
      out.write("\t\t              url : \"/deleteFile\",\n");
      out.write("\t\t              type : \"post\",\n");
      out.write("\t\t              data : {\n");
      out.write("\t\t                 fileName : preUrl\n");
      out.write("\t\t              },\n");
      out.write("\t\t              dataType : \"text\",\n");
      out.write("\t\t              success : function(result) {\n");
      out.write("\t\t             \tif(result){\n");
      out.write("\t\t             \t\t var url = \"/\";\n");
      out.write("\t\t                     $(location).attr('href', url);\n");
      out.write("\t\t             \t}\n");
      out.write("\t\t              }\n");
      out.write("\t\t           });\n");
      out.write("\t  \t\t}else{//기존 사진 변화가 없으면 \n");
      out.write("\t  \t\t\t var url = \"/\";\n");
      out.write("                 $(location).attr('href', url);\n");
      out.write("\t  \t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
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
