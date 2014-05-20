<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person Certifications and Assessments Report</title>
</head>
<body>

	<table>
		<tr>
			<th>Person Name</th><th>Name</th><th>Date</th><th>Category</th><th>Type</th>
		
		</tr>
		<c:forEach items="${personReports}" var="personReport">
		
			<tr>
				<td>${personReport.lastName}, ${personReport.firstName} ${personReport.middleName}</td><td>${personReport.certAssessName}</td><td>${personReport.certAssessDate}</td><td>${personReport.certAssessCategory}</td><td>${personReport.type}</td>
			</tr>
		
		</c:forEach>
	</table>

</body>
</html>