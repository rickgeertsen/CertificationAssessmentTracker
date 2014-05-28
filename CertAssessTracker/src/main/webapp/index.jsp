<!DOCTYPE html>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

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
    <style>
    </style>
  </head>
  <body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="addGoal.html">
            Get started
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="hero-unit">
        <div>
          <h1>
            Welcome to the Certification and Assessment Tracker and Reporter <sec:authentication property="name" />!
          </h1>
          <br>
          <p>
            To get started, We need to enter the Person we want to Track.
          </p>
        </div>
        <a class="btn btn-primary" href="addPerson.html">
          Add Person »
        </a>
        
        <sec:authorize ifAnyGranted="ROLE_ADMIN">
        <a class="btn btn-primary" href="editPerson.html">
          Edit Person »
        </a>
        </sec:authorize>
        
          <a class="btn btn-warning" href="j_spring_security_logout">
        	Logout >>
        </a>
        
        <br> <br>
        <p>
            Next enter all Certifications and Assessments Passed.
        </p>
        <a class="btn btn-primary" href="addCertification.html">
          Add Certification Information »
        </a>
        
         <a class="btn btn-primary" href="addAssessment.html">
          Add Assessment Information »
        </a>
        <br><br>
        <p>
            Then Get Needed Reports on All Persons.
        </p>
         <a class="btn btn-primary" href="getAllPersonReports.html">
         Person Certification and Assessment Report »
        </a>
        
         <a class="btn btn-primary" href="getPersonCertificationReports.html">
         Person Certification Report »
        </a>
        
         <a class="btn btn-primary" href="getPersonAssessmentReports.html">
         Person Assessment Report »
        </a>
        
      </div>
      <div>
      </div>
    </div>
    
    <script src="jquery-1.8.3.js">
    </script>
    
    <script src="assets/js/bootstrap.js">
    </script>
  </body>
</html>
