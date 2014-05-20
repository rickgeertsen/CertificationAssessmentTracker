<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
  
  <head>
    <meta charset="utf-8">
    <title>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Le styles -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <style>
      body { padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */ }
    </style>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
    
	<script type="text/javascript" src="jquery-1.8.3.js"></script>

	<style>
		.error {
			color: #ff0000;
		}
		
		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}
	</style>
  </head>
  <body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">
            <spring:message code="assessment.passed"/>
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div>
        <h1>
          <spring:message code="assessment.passed"/>
        </h1>
      </div>
      <a class="btn" href="?language=en">
        English
      </a>
      <a class="btn" href="?language=es">
        Spanish
      </a>
      <br/>
      <br/>
      <form:form commandName="assessment">
      	<form:errors path="*" cssClass="errorblock" element="div" />
      	<div class="control-group">
          <label for="textinput1">
            <spring:message code="assessment.name"/>
          </label>
          <form:input path="assessName"/>
          <form:errors path="assessName" cssClass="error" />
        </div>
        <div class="control-group">
          <label for="textinput2">
            <spring:message code="assessment.date"/>
          </label>
          <form:input path="assessDate"/>
          <form:errors path="assessDate" cssClass="error" />
        </div>
        <div class="control-group">
          <label for="textinput3">
            <spring:message code="assessment.category"/>
          </label>
          <form:input path="assessCategory"/>
          <form:errors path="assessCategory" cssClass="error" />
        </div>
		
		<input type="submit" class="btn" value="<spring:message code="assessment.button.enter"/>"/>
		
	</form:form>
      
      <span class="label">
        <spring:message code="assessment.person"/> ${person.lastName}, ${person.firstName} ${person.middleName} 
      </span>
    </div>

    <script src="assets/js/bootstrap.js">
    </script>
  </body>
</html>
