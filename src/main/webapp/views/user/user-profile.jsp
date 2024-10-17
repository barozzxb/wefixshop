<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!-- BEGIN CONTENT -->
<div class="col-md-9 col-sm-9">
	<h1>Create an account</h1>
	<div class="content-form-page">
		<div class="row">
			<div class="col-md-7 col-sm-7">
				<form class="form-horizontal" action=>
					<fieldset>
						<legend>Your personal details</legend>
						<div class="form-group">
						
							<label for="userid" class="col-lg-4 control-label">User ID <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="userid" name="userid" value="${sessionScope.account.userId }" disabled>
							</div>
							
							<label for="name" class="col-lg-4 control-label">Full
								Name <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="name" name="name">
							</div>
						</div>
						
						<div class="form-group">
							<label for="dob" class="col-lg-4 control-label">Date of birth <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="date" class="form-control" id="dob" name="dob">
							</div>
						</div>
						
						<div class="form-group">
							<label for="gender" class="col-lg-4 control-label">Gender <span class="require">*</span>
							</label>
							<input type="radio" id="ston" name="gender" value="1"> 
								<label for="css"> Male</label>
								<br>
							<input type="radio" id="stoff" name="gender" value="0"> 
							<label for="javascript"> Female</label>
							
						</div>
						
						<div class="form-group">
							<h1>Contact information</h1>
							
							<label for="email" class="col-lg-4 control-label">Email <span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="email">
							</div>
							
							<label for="phonenum" class="col-lg-4 control-label">Phone number <span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="phonenum" name="phonenum">
							</div>
							
							<label for="address" class="col-lg-4 control-label">Address <span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="address" name="address">
							</div>
						</div>
							<label for="isDeactivated" class="col-lg-4 control-label">Account Status 
							<strong>${sessiongScope.account.isDeactivated }</strong><span
								class="require">*</span></label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="isDeactivated" name="isDeactivated">
							</div>
						<div>
							
						</div>
					</fieldset>
					<fieldset>
						<legend>Your password</legend>
						<div class="form-group">
							<label for="password" class="col-lg-4 control-label">Password
								<span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="password">
							</div>
						</div>
						<div class="form-group">
							<label for="confirm-password" class="col-lg-4 control-label">Confirm
								password <span class="require">*</span>
							</label>
							<div class="col-lg-8">
								<input type="text" class="form-control" id="confirm-password">
							</div>
						</div>
					</fieldset>
					<fieldset>
						<legend>Newsletter</legend>
						<div class="checkbox form-group">
							<label>
								<div class="col-lg-4 col-sm-4">Singup for Newsletter</div>
								<div class="col-lg-8 col-sm-8">
									<input type="checkbox">
								</div>
							</label>
						</div>
					</fieldset>
					<div class="row">
						<div
							class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-20">
							<button type="submit" class="btn btn-primary">Create an
								account</button>
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
<!-- END CONTENT --></html>