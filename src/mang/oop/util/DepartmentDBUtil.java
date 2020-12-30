package mang.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mang.oop.models.Dpartment;
import mang.oop.models.Notice;


public class DepartmentDBUtil {
	
	private static boolean status;
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet resset = null;
	
	//function to add a department to DB
	public static boolean addDepartment(int ID,String title, String description, String location, String managerID) {
		
		status = false;
		
		try {
			//check DB connection calling functions in  DBconnect 
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into department values ('"+ID+"','"+title+"','"+description+"','"+location+"','"+managerID+"');";
			
			int result = stmt.executeUpdate(sql);
			
			//check inserted operation 
			if(result > 0) {
				status = true;
			}
			
			else status = false;
		
		}catch(Exception e) {//display error if occurs
		 e.printStackTrace();
		}
	//return inserted operation status
	return status;
	}
	
	public static boolean updateDepartment(int ID,String title, String discription, String location, String managerID) {
		status = false;
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "update department set departmentTitle='"+title+"',description='"+discription+"', location='"+location+"', deptManagerID='"+managerID+"' where iddepartment='"+ID+"';";
			
			int result = stmt.executeUpdate(sql);
			
			//check updated operation
			if(result > 0) {
				status = true;
			}
			else {
				status = false;
			}
		
		}catch(Exception e) {
			e.printStackTrace();//check for any errors
		}
		
	return status;
	}
		
	public static List<Dpartment> getDepartmentlist(int id){
		
		ArrayList<Dpartment> dept = new ArrayList<>();
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * from department where iddepartment = '"+id+"';";
			
			resset = stmt.executeQuery(sql);
			
			while(resset.next()) {
				int did= resset.getInt(1);
				String dTitle = resset.getString(2);
				String description = resset.getString(3);
				String location = resset.getString(4);
				String dManagerID = resset.getString(5);
				
				Dpartment dep = new Dpartment(did,dTitle,description,location,dManagerID);
				dept.add(dep);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	//return object with data
		return dept;
	}
	
	public static List<Dpartment> getAllDepartmentlist(){
		
		ArrayList<Dpartment> dept = new ArrayList<>();
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * from department;";
			
			resset = stmt.executeQuery(sql);
			
			while(resset.next()) {
				
				int did = resset.getInt(1);
				String dTitle = resset.getString(2);
				String description = resset.getString(3);
				String location = resset.getString(4);
				String dManagerID = resset.getString(5);
				
				Dpartment dep = new Dpartment(did,dTitle,description,location,dManagerID);
				dept.add(dep);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return object with all data
		return dept;
	}

	public static boolean deleteDepartment(int id) {
		
		status = false;
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "delete from department where iddepartment = '"+id+"'";
			
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				status = true;
			}
			
			else {
				status = false;
			}
		}catch(Exception e) {
			
		}
		
		
		return status;
	}

	//loginValidate function for check username password
	public static boolean loginValidate(String user,String pass) {
		
		status = false;
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * from useradmin where userName = '"+user+"' AND password = '"+pass+"';";
			
			
			resset = stmt.executeQuery(sql);
			
			//check insert operation 
			if(resset.next()) {
				status = true;
			}
			
			else status = false;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return status; 
	}

	//function to add a notice *** can be used to add first noticce
	public static boolean addNotice(String name, String title, String content) {
		
		status = false;
		
		try {
			
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			
			
			String sql = "insert into notice values ('"+name+"','"+title+"','"+content+"')";
		
			int result = stmt.executeUpdate(sql);
			
			//check insert operation 
			if(result > 0) {
				status = true;
			}
			
			else status = false;
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}

		return status;
		
	}
	
	//function to update existing notice
	public static boolean updateNotice(String name,String title,String content) {
		
		String commName="notice";
		status = false;
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "update notice set noticeTitle='"+title+"', noticeContent='"+content+"' where idnotice='"+commName+"';";
			
			int result = stmt.executeUpdate(sql);
			
			//check update operation
			if(result > 0) {
				status = true;
			}
			else {
				status = false;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	return status;
	}
	
	//function to display the notice
	public static ArrayList<Notice> getNotice(){
		
		String id = "notice";
		ArrayList<Notice> notice = new ArrayList<>();
		
		try {
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * from notice where idnotice='"+id+"';";
			
			resset = stmt.executeQuery(sql);
			
			while(resset.next()) {
				String nid= resset.getString(1);
				String nTitle = resset.getString(2);
				String content = resset.getString(3);
			
		
			Notice not = new Notice(nid, nTitle,content);
			notice.add(not);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return notice information
		return notice;	
	
}
}