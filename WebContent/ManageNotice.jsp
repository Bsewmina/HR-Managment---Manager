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
            width: 50%;
            height: 50%;
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
	<button class="btn_logout" >Logout here
	</button>
	</a>
	</div>
	<!--Adding the profile photo-->
	 <div class="pro_pic">
	 </div> 
</div>

<div id="mainDiv">
<br><br>
    <form method="POST">
        <div class="row">
            <div class="col">
                <input type="text" class="form-control" name="notice-name" placeholder="Notice name">
            </div>
            <div class="col">
                <input type="text" class="form-control" name="noticeTitle" placeholder="Title name">
            </div>
            
        </div>
		<div class="row pt-2">
            <div class="col">
                <textarea class="form-control" name="content" placeholder="content"></textarea>>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col">
                <input type="submit" class="form-control btn btn-warning" value="Upload Notice" formaction="addNotice">
            </div>
            <div class="col">
                <input type="submit" class="form-control btn btn-warning" value="Update Notice" formaction="updateNotice">
            </div>
        </div>
    </form>
</div>
</body>
</html>