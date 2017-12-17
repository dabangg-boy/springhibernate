<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
		<!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="../css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="../css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
	</head>
	<body>
		<h3 style="text-align:center">Add Employee Data</h3>
	<div class="container">
		<div class="row">
		
	   		<form:form class="col s8 offset-m4" method="post" action="../user/add" modelAttribute="user">
	   		
					<form:input path="userid" hidden="hidden" />
					<div class="row">
					    
						  <div class="input-field col s6">
						    
						    <form:input type="text" path="firstname"/>
			          		<form:label path="firstname">First Name</form:label>
			          		
						 </div>
				   </div>
				   
				   <div class="row">
						   
						   <div class="input-field col s6">
						    
						    <form:input type="text" path="lastname"/>
			          		<form:label path="lastname">Last Name</form:label>
			          		
						   </div>
				   </div>
						   
				   <div class="row">
						   
						     <div class="input-field col s6">
						    
						    <form:input type="text" path="dob"/>
			          		
						     </div>
			       </div>
						   
				   <div class="row">
						   
						     <div class="input-field col s6">
						    
						    	<form:input type="email" path="email"/>
			          			<form:label path="email">Email</form:label>
			          		
						     </div>
				   </div>
						         
				   <div class="row">
						   
						     <div class="input-field col s6">
						    		    
								<button class="btn waves-effect waves-light" type="submit" name="action">Submit
								    <i class="material-icons right">send</i>
								  </button>	
			  				</div>
			 	   </div>		  
			 	     
		     
		</form:form>
		
		
			
		</div>
	</div>	
  
<!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="../js/materialize.js"></script>
  <script src="../js/init.js"></script>
	</body>
</html>