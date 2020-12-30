<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Department</title>
    <link rel="stylesheet" href="assests/css/bootstrap.css">
    <style>
        main {
            position: relative;
            width: 100%;
            height: 100%;
        }

        section {
            position: relative;
            width: 100%;
            height: 100%;
            padding-top: 50px;
        } 
        
        body { margin:0; } 



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
	<!--button to logout-->
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
<main class="row container-fluid">
    <div class="col-lg-12 text-center">
    	<br><br>
        <h1>Department Management</h1>
    </div>
    <section class="col-lg-6">
        <div class="row container-fluid">
            <div class="col-lg-12">
                <form id="formD" method="POST">
                    <div class="form-row">
                        <div class="form-group col-md-6" id="idRow">
                            <label for="id">Id</label>
                            <input type="number" class="form-control" id="id" name="depID">
                            	
                            		<input type="submit" class="btn btn-light" 
                                    style="position: absolute;top: 32px;right: -140px;" value="search by ID" formaction="getDept">
                                    
                            		<button type="submit" class="btn btn-info"
                                    style="position: absolute;top: 32px;right: -350px;" value="List all department" formaction="getAllDept">List all departments
                                    </button>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="depTitle">Department Title</label>
                            <input type="text" class="form-control" id="depTitle" name="depTitle">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="functions">Description</label>
                            <input type="text" class="form-control" id="functions" name="functions">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="location">Location</label>
                            <input type="text" class="form-control" id="location" name="location">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="depManagerID">Department Manager ID</label>
                            <input type="text" class="form-control" id="depManagerID" name="depManagerID">
                        </div>
                        
                        
                       <div class="form-group col-md-6">
                        <div class="form-row pt-5">
                            <div class="form-group col-md-4">
                                	<button type="submit" class="btn btn-success" formaction="addDept"> Register
                                	</button>
                            </div>
                            <div class="form-group col-md-4">
                                	<button type="submit" class="btn btn-primary" formaction="update"> Update
                                	</button>
                            </div>
                            <div class="form-group col-md-4">
                                <a href="DepartmentRemove.jsp">	
                                	<button type="button" class="btn btn-danger" > Delete
                                	</button>
                                </a>
                            </div>
                            <div class="form-group col-md-1">
                            <a href="ManageNotice.jsp">
                            	<button type="button" class="btn btn-link" formaction="delete"> Manage NoticeBoard
                                </button>
                            </a>
                            </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>
    <section class="col-lg-6">
    <!--Table for display all the deparment elements  -->
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Description</th>
                <th scope="col">Location</th>
                <th scope="col">Department Manager ID</th>
            </tr>
            </thead>
            <tbody id="tableBody">
            
            <!-- get data from entity class -->
            <c:forEach var="dep" items="${deptDetail}">
           <tr>
            	<td>${dep.did}</td>
            	<td>${dep.depTitle}</td>
            	<td>${dep.description}</td>
            	<td>${dep.location}</td>
            	<td>${dep.depManagerID}</td>
            	
            </tr>	
            </c:forEach>
            
           
            </tbody>
        </table>
    </section>
</main>

</body>
</html>