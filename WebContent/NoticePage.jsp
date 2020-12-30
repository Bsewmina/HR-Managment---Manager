<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="assests/css/bootstrap.css">
    <style>
        #mainDiv {
            position: absolute;
            width: 50%;
            height: 80%;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
        }
		
		.bg{
            position: absolute;
            width: 60%;
            height: 100%;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
        }
        
        .name_bar{
		position: relative;
		height: 150px;
		width: 100%;
		border: none;
		background-color: #31de70;
	}

		.logout{
		text-align: right;
		padding-right: 55px;
		padding-top: 10px;
	
	}

	.btn_logout{
		color: white;
		border: none;
		background: #056663;
		text-align: center;
		border-radius: 60px;
		padding: 10px 15px; /*add space */
		margin-left:90%;
		margin-top: 60px;
	
	
	}

	.pro_pic{
		position: absolute;
		height: 120px;
		width: 300px;

	
		background-color: transparent;
		background-image: url("assests/images/logo.png");
		background-size:cover;  
		top: 5px;
		left: 30px;
	}
		
    </style>
</head>
<body>
<div class="name_bar"> 
	
	<div class="logout">
	<a href="Home.jsp">
	<button class="btn_logout" >Home Page
	</button>
	</a>
	</div>
	 
	<!--Adding the profile photo-->
	 <div class="pro_pic">
	
	 </div>
	 
</div>
<div id="mainDiv">
    <div class="card bg" style="width: 30;">  
        <div class="card-header">
 	<!-- display nortice information -->
        	 <c:forEach var="note" items="${status}">
            <h5 class="card-title">${note.title}</h5>
        </div>
        <div class="card-body">
            <p class="card-text">${note.content}</p>
              </c:forEach>
           
        </div>
    </div>
</div>
</body>
</html>