/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2020-04-08 12:02:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_002daside_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<aside class=\"main-sidebar\">\r\n");
      out.write("\t<!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("\t<section class=\"sidebar\">\r\n");
      out.write("\t\t<!-- Sidebar user panel -->\r\n");
      out.write("\t\t<div class=\"user-panel\">\r\n");
      out.write("\t\t\t<div class=\"pull-left image\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/user2-160x160.jpg\"\r\n");
      out.write("\t\t\t\t\tclass=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"pull-left info\">\r\n");
      out.write("\t\t\t\t<p>xxx</p>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-circle text-success\"></i> 在线</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("\t\t<ul class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t<li class=\"header\">菜单</li>\r\n");
      out.write("\t\t\t<li id=\"admin-index\"><a\r\n");
      out.write("\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/accountant-main.jsp><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-dashboard\"></i> <span>首页</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cogs\"></i>\r\n");
      out.write("\t\t\t\t\t<span>申请管理</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li id=\"system-login\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Apply/findAudit\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 待审核\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-login\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/User/findAll\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 未通过\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-login\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/User/findAll\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 已完成\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting4\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sysLog/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 访问日志\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cube\"></i>\r\n");
      out.write("\t\t\t\t\t<span>基础数据</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting5\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Product/findAll\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 产品管理\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting6\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Product/findAll\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 申请管理\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- /.sidebar -->\r\n");
      out.write("</aside>");
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
