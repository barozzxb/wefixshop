<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!-- BEGIN TOP BAR -->
<div class="pre-header">
	<div class="container">
		<div class="row">
			<!-- BEGIN TOP BAR LEFT PART -->
			<div class="col-md-6 col-sm-6 additional-shop-info">
				<ul class="list-unstyled list-inline">
					<li><i class="fa fa-phone"></i><span>+1 456 6717</span></li>
					<!-- BEGIN CURRENCIES -->
					<li class="shop-currencies"><a href="javascript:void(0);">€</a>
						<a href="javascript:void(0);">£</a> <a href="javascript:void(0);"
						class="current">$</a></li>
					<!-- END CURRENCIES -->
					<!-- BEGIN LANGS -->
					<li class="langs-block"><a href="javascript:void(0);"
						class="current">English </a>
						<div class="langs-block-others-wrapper">
							<div class="langs-block-others">
								<a href="javascript:void(0);">French</a> <a
									href="javascript:void(0);">Germany</a> <a
									href="javascript:void(0);">Turkish</a>
							</div>
						</div></li>
					<!-- END LANGS -->
				</ul>
			</div>
			<!-- END TOP BAR LEFT PART -->
			<!-- BEGIN TOP BAR MENU -->
			<div class="col-md-6 col-sm-6 additional-nav">
				<ul class="list-unstyled list-inline pull-right">
					<li><a href="${pageContext.request.contextPath }/admin/setting">Setting</a></li>
					<li><c:choose>
							<c:when test="${sessionScope.account == null}">
								<a href="${pageContext.request.contextPath }/login">Đăng nhập</a>
								<a href="${pageContext.request.contextPath }/signup">Đăng ký</a>
							</c:when>
							<c:otherwise>
								<a href="${pageContext.request.contextPath}/setting">
								<c:choose>
									<c:when test="${sessionScope.account.name == null}">
										${sessionScope.account.userid}
									</c:when>
									<c:otherwise>
										${sessionScope.account.name}
									</c:otherwise>
								</c:choose>
								</a>
								<a href="${pageContext.request.contextPath }/logout">Đăng Xuất</a>
							</c:otherwise>
						</c:choose></li>
				</ul>
			</div>
			<!-- END TOP BAR MENU -->
		</div>
	</div>
</div>
<!-- END TOP BAR -->

<!-- BEGIN HEADER -->
<div class="header">
	<div class="container">
		<a class="site-logo" href="shop-index.html"><img
			src="${URL}assets/frontend/layout/img/logos/logo-shop-red.png"
			alt="Metronic Shop UI"></a> <a href="javascript:void(0);"
			class="mobi-toggler"><i class="fa fa-bars"></i></a>
	</div>
</div>
<!-- Header END -->