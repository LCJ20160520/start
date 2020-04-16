<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>

<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>李四</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/user-main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>我的差旅</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<%--<li id="system-login"><a--%>
							<%--href="${pageContext.request.contextPath}/login.jsp"> <i--%>
							<%--class="fa fa-circle-o"></i> 登录--%>
					<%--</a></li>--%>
					<li id="system-regist"><a
						href="${pageContext.request.contextPath}/pages/user-apply-add.jsp"> <i
							class="fa fa-circle-o"></i> 申请出差
					</a></li>


					<li id="system-settingeqw"><a
						href="${pageContext.request.contextPath}/pages/user-inreview-list.jsp">
							<i class="fa fa-circle-o"></i> 待审核
					</a></li>
						<li id="system-setting3"><a
						href="${pageContext.request.contextPath}/permission/findAll.do">
							<i class="fa fa-circle-o"></i> 未通过
					</a></li>
					<li id="system-setting4"><a
						href="${pageContext.request.contextPath}/sysLog/findAll.do"> <i
							class="fa fa-circle-o"></i> 已完成
					</a></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>基础数据</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting5"><a
						href="${pageContext.request.contextPath}/Product/findAll">
							<i class="fa fa-circle-o"></i> 产品管理
					</a></li>
					<li id="system-setting6"><a
						href="${pageContext.request.contextPath}/Product/findAll"> <i
							class="fa fa-circle-o"></i> 申请管理
					</a></li>

				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>