<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Department</title>
</head>
<body>

	<form  method="post">
	
	DeptID <input type ="number" name="depID">
	Title <input type ="text" name="depTitle"><br>
	function <input type="text" name="functions"><br>
	location <input type="text" name="location"><br>
	ManagerID <input type="text" name="depManagerID"><br><br>
	
	<input type="submit" name="action" value="Submit" formaction="add" ><br><br>
	<input type="submit" name="action" value="update" formaction="update">	
	<br><br>
	<input type="submit" name="action" value="search" formaction="getDept">
	<br><br>
	<input type="submit" name="asd" value="getAllDepartment" formaction="getAllDept">

		</form>
	
	//////////////////////////////////////////////////////////////////////////
	
	
	
	
	<h2>Insert Notice</h2>

	<form  method="POST">
	noticeName<input type="text" name="notice-name"><br>
	title<input type="text" name="noticeTitle"><br>
	content<input type="text" name="content">
	<br>
	<input type="submit" formaction="addNotice" value="Upload Notice">
	<input type="submit" formaction="updateNotice" value="Update Notice">
	<br>
	<input type="submit" formaction="viewNotice" value="view notice">
	
	</form>
	<script type="text/javascript">
	
	</script>

	/////////////////////////////////////////////////////////////
	
	
	
	
	
	<body>

---------------------------------------------------------------

<h2>Delete department</h2>
<form action="delete" method="POST">
department id<input type="number" name=remDid>
<input type ="submit" name="deleteButton" value="Delete Department">

</form>


	
	//////////////////////////////////////////////
	
	
	
	

<body></body>	

<br>

<c:forEach var="note" items="${status}">
 				${note.title}
 				${note.content}    	          	
            </c:forEach>
            
            
   
</body>





//////////////////////////////////////////////////////////////////////////




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="adlogin" method="POST">
	
		username<input type ="text" name="username"><br>
		password<input type ="text" name="password"><br><br>
	
		<input type ="submit" name="submit" value="Log-in">
		
	</form>
	
</body>
</html>






	
	
	
	
	
	
	