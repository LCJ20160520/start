/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2020-04-08 12:02:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountant_002dmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/changjiang/.IntelliJIdea2017.3/travel/travel_web/target/travel_web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1585840926450L));
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- 页面meta -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>数据 - AdminLTE2定制版</title>\r\n");
      out.write("    <meta name=\"description\" content=\"AdminLTE2定制版\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"AdminLTE2定制版\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <!-- Ionicons -->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <!-- Morris chart -->\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <!-- Date Picker -->\r\n");
      out.write("    <!-- Daterange picker -->\r\n");
      out.write("    <!-- Bootstrap time Picker -->\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"../../../plugins/timepicker/bootstrap-timepicker.min.css\">-->\r\n");
      out.write("    <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("    <!--数据表格-->\r\n");
      out.write("    <!-- 表格树 -->\r\n");
      out.write("    <!-- select2 -->\r\n");
      out.write("    <!-- Bootstrap Color Picker -->\r\n");
      out.write("    <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("    <!--bootstrap-markdown-->\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("    <!-- Ion Slider -->\r\n");
      out.write("    <!-- ion slider Nice -->\r\n");
      out.write("    <!-- bootstrap slider -->\r\n");
      out.write("    <!-- bootstrap-datetimepicker -->\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery 2.2.3 -->\r\n");
      out.write("    <!-- jQuery UI 1.11.4 -->\r\n");
      out.write("    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <!-- jQuery Knob Chart -->\r\n");
      out.write("    <!-- daterangepicker -->\r\n");
      out.write("    <!-- datepicker -->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <!-- Slimscroll -->\r\n");
      out.write("    <!-- FastClick -->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <!-- AdminLTE App -->\r\n");
      out.write("    <!-- 表格树 -->\r\n");
      out.write("    <!-- select2 -->\r\n");
      out.write("    <!-- bootstrap color picker -->\r\n");
      out.write("    <!-- bootstrap time picker -->\r\n");
      out.write("    <!--<script src=\"../../../plugins/timepicker/bootstrap-timepicker.min.js\"></script>-->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <!--bootstrap-markdown-->\r\n");
      out.write("    <!-- CK Editor -->\r\n");
      out.write("    <!-- InputMask -->\r\n");
      out.write("    <!-- DataTables -->\r\n");
      out.write("    <!-- ChartJS 1.0.1 -->\r\n");
      out.write("    <!-- FLOT CHARTS -->\r\n");
      out.write("    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->\r\n");
      out.write("    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->\r\n");
      out.write("    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->\r\n");
      out.write("    <!-- jQuery Knob -->\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <!-- Ion Slider -->\r\n");
      out.write("    <!-- Bootstrap slider -->\r\n");
      out.write("    <!-- bootstrap-datetimepicker -->\r\n");
      out.write("    <!-- 页面meta /-->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionicons/css/ionicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/iCheck/square/blue.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/morris/morris.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/datepicker/datepicker3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/treeTable/jquery.treetable.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/treeTable/jquery.treetable.theme.default.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/select2/select2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/colorpicker/bootstrap-colorpicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/adminLTE/css/AdminLTE.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/adminLTE/css/skins/_all-skins.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionslider/ion.rangeSlider.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionslider/ion.rangeSlider.skinNice.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-slider/slider.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition skin-purple sidebar-mini\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <!-- 页面头部 -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- 页面头部 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 导航侧栏 -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "account-aside.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- 导航侧栏 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 内容区域 -->\r\n");
      out.write("    <!-- @@master = admin-layout.html-->\r\n");
      out.write("    <!-- @@block = content -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <img src=\"/img/back.jpg\" alt=\"sdf\" width=\"100%\" height=\"100%\">\r\n");
      out.write("        <!-- 内容头部 -->\r\n");
      out.write("        <!--<section class=\"content-header\">-->\r\n");
      out.write("        <!--<h1>-->\r\n");
      out.write("        <!--模块名称-->\r\n");
      out.write("        <!--<small>模块功能</small>-->\r\n");
      out.write("        <!--</h1>-->\r\n");
      out.write("        <!--<ol class=\"breadcrumb\">-->\r\n");
      out.write("        <!--<li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> 首页</a></li>-->\r\n");
      out.write("        <!--<li><a href=\"#\">模块名称</a></li>-->\r\n");
      out.write("        <!--<li class=\"active\">模块功能</li>-->\r\n");
      out.write("        <!--</ol>-->\r\n");
      out.write("        <!--</section>-->\r\n");
      out.write("        <!--&lt;!&ndash; 内容头部 /&ndash;&gt;-->\r\n");
      out.write("\r\n");
      out.write("        <!--&lt;!&ndash; 正文区域 &ndash;&gt;-->\r\n");
      out.write("        <!--<section class=\"content\">-->\r\n");
      out.write("\r\n");
      out.write("        <!--<div class=\"box box-primary\">-->\r\n");
      out.write("        <!--<div class=\"box-header with-border\">-->\r\n");
      out.write("        <!--<h3 class=\"box-title\">模块操作</h3>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("        <!--<div class=\"box-body\">-->\r\n");
      out.write("\r\n");
      out.write("        <!--如果你要新建一个模块页，你可以复制本文件 admin-blank.html ，不用重新搭建框架代码。<br> 本页元素有：模块主标题、模块子标题、导航位置、模块操作区域-->\r\n");
      out.write("\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("        <!--</section>-->\r\n");
      out.write("        <!--&lt;!&ndash; 正文区域 /&ndash;&gt;-->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- @@close -->\r\n");
      out.write("    <!-- 内容区域 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 底部导航 -->\r\n");
      out.write("    <!--<footer class=\"main-footer\">-->\r\n");
      out.write("    <!--<div class=\"pull-right hidden-xs\">-->\r\n");
      out.write("    <!--<b>Version</b> 1.0.8-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("    <!--<strong>Copyright &copy; 2014-2017 <a href=\"http://www.itcast.cn\">研究院研发部</a>.</strong> All rights reserved.-->\r\n");
      out.write("    <!--</footer>-->\r\n");
      out.write("    <!-- 底部导航 /-->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/raphael/raphael-min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/morris/morris.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("<script src=\"../plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("<script src=\"../plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/adminLTE/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/treeTable/jquery.treetable.js\"></script>\r\n");
      out.write("<script src=\"../plugins/select2/select2.full.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/to-markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.extensions.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/chartjs/Chart.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.pie.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.categories.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/ionslider/ion.rangeSlider.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-slider/bootstrap-slider.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // 选择框\r\n");
      out.write("        $(\".select2\").select2();\r\n");
      out.write("\r\n");
      out.write("        // WYSIHTML5编辑器\r\n");
      out.write("        $(\".textarea\").wysihtml5({\r\n");
      out.write("            locale: 'zh-CN'\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 设置激活菜单\r\n");
      out.write("    function setSidebarActive(tagUri) {\r\n");
      out.write("        var liObj = $(\"#\" + tagUri);\r\n");
      out.write("        if (liObj.length > 0) {\r\n");
      out.write("            liObj.parent().parent().addClass(\"active\");\r\n");
      out.write("            liObj.addClass(\"active\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        setSidebarActive(\"admin-blank\");\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
