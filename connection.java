//connection.java
import java.sql.*;
Class connection1{
public static void main(String args[])throws Exception {
	try{
	// stape 1 load the derive 
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//stape 2 connection establish 
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kundan");
	//stape create the statement 
	Statement st=con.createStatement();
	//stape 4 excuse the queary 
	ResultSet rs=st.executeQuery("select * from student ");
	while(rs.next()){
	
	System.out.println();
	}//end of the while
	
	//connect close 
	con.close();
	
	}catch(Exception e){
	e.pirintStackTrace();

	}//end of the catch





}//end of the main method 
}//end of the class