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
            width: 30%;
            height: 50%;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
        }
    </style>
</head>
<body>
<div id="mainDiv">
	<!-- call AdminLogin servlet -->
    <form action="adlogin" method="POST">
        <div class="form-group">
            <label for="userName">User Name</label>
            <input type="text" class="form-control" id="userName" name="username" aria-describedby="emailHelp">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <br><br>
        <button type="submit" class="btn btn-primary btn-lg col-lg-12" name="submit">Login
        </button>
    </form>
</div>
</body>
</html>