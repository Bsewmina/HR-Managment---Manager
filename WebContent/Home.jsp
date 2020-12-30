<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="assests/css/bootstrap.css">
    <style>
        #mainDiv {
            position: absolute;
            width: 90%;
            height: 50%;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
            background-image: url("assests/images/6a0105360968fe970b012877202a2b970c-600wi.jpg");
        }

        .secondDiv {
            position: relative;
            top: 0%;
            height:100px;
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
	 
	<!--Adding the profile photo-->
	 <div class="pro_pic">
	</div>
</div>
<div id="mainDiv">
    <div class="row secondDiv">
        <div class="col-lg-5">
			<form method="POST">
				<!-- Redirect to the notice page -->
				<button class="btn btn-info btn-lg col-lg-4" type="submit"  formaction="viewNotice" value="Notice">Notice
				</button>
				<!-- Redirect to the Login page -->
				<a href="AdminLogin.jsp">
					<button class="btn btn-warning float-right btn-lg col-lg-4" type="button"  value="Login">Admin Login
				</button>
				</a>
			</form>
		</div>
	</div>			
</div>


</body>
</html>