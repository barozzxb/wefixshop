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
					<li><i class="fa fa-phone"></i><span>- Phonenum -</span></li>
				</ul>
			</div>
			<!-- END TOP BAR LEFT PART -->
			<!-- BEGIN TOP BAR MENU -->
			<div class="col-md-6 col-sm-6 additional-nav">
				<ul class="list-unstyled list-inline pull-right">
					<li><a href="shop-account.html">My Account</a></li>
					<li><a href="shop-wishlist.html">My Wishlist</a></li>
					<li><c:choose>
							<c:when test="${sessionScope.account == null}">
								<a href="${pageContext.request.contextPath }/login">Đăng nhập</a>
								<a href="${pageContext.request.contextPath }/signup">Đăng ký</a>
							</c:when>
							<c:otherwise>
								<a href="${pageContext.request.contextPath}/myaccount">
								
								<c:if test="empty ${sessionScope.account.name}">${sessionScope.account.userid}</c:if>
								<c:if test="not empty ${sessionScope.account.name}">${sessionScope.account.name}></c:if></a>
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

<!-- Header END -->