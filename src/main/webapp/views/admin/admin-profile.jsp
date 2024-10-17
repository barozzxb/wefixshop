<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!-- BEGIN CONTENT -->
<div class="col-md-9 col-sm-9">
	<h1>Create an account</h1>
	<div class="content-form-page">
		<div class="row">
			<div class="col-md-7 col-sm-7">
				<form class="form-horizontal" action="${pageContext.request.contextPath }/admin/profile" method="post">
					<fieldset>
						<legend>Your personal details</legend>
						<div class="form-group">
						
							<label for="userid" class="col-lg-4 control-label">User ID <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="userid" name="userid" value="${sessionScope.account.userid }" disabled>
							</div>
							
							<label for="name" class="col-lg-4 control-label">Full
								Name <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="name" name="name" value="${sessionScope.account.name }">
							</div>
						</div>
						
						<div class="form-group">
							<label for="dob" class="col-lg-4 control-label">Date of birth <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="date" class="form-control" id="dob" name="dob" value="${sessionScope.account.dob }">
							</div>
						</div>
						
						<div class="form-group">
							<label for="gender" class="col-lg-4 control-label">Gender <span class="require">*</span>
							</label>
							<input type="radio" id="ston" name="gender" value="Male" <c:if test="${sessionScope.account.gender == 'Male' }">checked</c:if>> 
								<label for="css"> Male</label>
								<br>
							<input type="radio" id="stoff" name="gender" value="Female" <c:if test="${sessionScope.account.gender == 'Female' }">checked</c:if>> 
							<label for="javascript"> Female</label>
							
						</div>
						
						<div class="form-group">
							<h1>Contact information</h1>
							
							<label for="email" class="col-lg-4 control-label">Email <span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="email" name="email" value="${sessionScope.account.email }">
							</div>
							
							<label for="phonenum" class="col-lg-4 control-label">Phone number <span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="phonenum" name="phonenum" value="${sessionScope.account.phonenum }">
							</div>
							
							<label for="address" class="col-lg-4 control-label">Address <span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="address" name="address" value="${sessionScope.account.address }">
							</div>
					</fieldset>
					
					<div class="row">
						<div
							class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-20">
							<button type="submit" class="btn btn-primary">Update infomation</button>
							<button type="button" class="btn btn-default">Cancel</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-4 col-sm-4 pull-right">
				<div class="form-info">
					<h2>
						<em>Important</em> Information
					</h2>
					<p>Lorem ipsum dolor ut sit ame dolore adipiscing elit, sed sit
						nonumy nibh sed euismod ut laoreet dolore magna aliquarm erat sit
						volutpat. Nostrud exerci tation ullamcorper suscipit lobortis nisl
						aliquip commodo quat.</p>

					<p>Duis autem vel eum iriure at dolor vulputate velit esse vel
						molestie at dolore.</p>

					<button type="button" class="btn btn-default">More details</button>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END CONTENT -->