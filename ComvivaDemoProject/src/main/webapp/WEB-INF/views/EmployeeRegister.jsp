<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body style="background: lightgreen">
	<br>
	<br>

	<div class="container">
		<div class="card">
			<div class="card-header bg-info text-white">
				<h2>
					<center>WELCOME TO EMPLOYEE REGISTER PAGE</center>
				</h2>
			</div>
			<div class="card-body">

				<form:form action="save" method="get" modelAttribute="emp">

					<div class="row">
						<div class="col-3"></div>
						<div class="col-2">
							<label for="empName">Employee Name</label>
						</div>
						<div class="col-3">
							<form:input path="empName" cssClass="form-control" />
						</div>
					</div>
					
					
					<div class="row">
						<div class="col-3"></div>
						<div class="col-2">
							<label for="empSal">Employee Salary</label>
						</div>
						<div class="col-3">
							<form:input path="empSal" cssClass="form-control" />
						</div>
					</div>


					<div class="row">
						<div class="col-2"></div>

						<div class="col-4">
							<label for="projects" class="controle-label">Select Project</label>
						</div>
						<div class="col-6">
							<form:select path="project.projName">
								<form:option value="">-SELECT-</form:option>
								<form:options items="${projects}" itemLabel="Project Id"
									itemValue="project.projId"></form:options>
							</form:select>
						</div>
					</div>
					
				

					<br>
					<br>
					<div class="row">
						<div class="col-5"></div>
						<div class="col-3">
							<input type="submit" value="Employee Register" class="btn btn-primary" />
						</div>
					</div>
				</form:form>
			</div>

			<c:if test="${message !=null}">
				<div class="card-footer bg-info text-white">
					<center>${message}</center>
				</div>
			</c:if>
		</div>
	</div>
	<br>
</body>
</html>