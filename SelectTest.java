//SelectTest.java
package com.bce.JSP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.io.*;
import java.sql.Statement;
public class SelectTest {

	public static void main(String[] args)throws Exception , ClassNotFoundException{
		//create basic variable 
		Connection con=null;
		ResultSet rs=null;
		Statement st=null;
		//locd driverManager class
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection 
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saka");
		if(con!=null)
		//create jdbc Ststement 
		st=con.createStatement();
		//Exceuse queary 
		if(st!=null)
			rs=st.executeQuery("select * from s");
		//print database table 
		if(rs!=null)
			while(rs.next()!=false) {
				System.out.println(rs.getInt(1));
			}//end of the while block
		}//end try block
		catch(Exception e) {
			e.printStackTrace();
		}//end of the catch 
		//close jdbc object 
		finally {
			try {
				if(rs!=null)
					rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}//end of teh catch block
			try {
				if(st!=null)
					st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}//end 
			try {
				if(con!=null)
					con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}//end of the 
			
		}//end of the finally block
		
	}//end of the main method 
}//end of the class
