//db connection  on oracle data base 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Public {

	public static void main(String[] args)throws Exception {
		//register typ1 JDBC deriver 
		Class.forName("oracle.jdbc.deriver.OracleDriver");
		//stablish the connection 
		connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kundan");
		//create JDBC Statement object 
		Statement st =con.createStatement();
		//Result set 
		ResultSet rs=st.executeQuery("select *from student");
		//print database table record 
		while(rs.next()!=false){
		System.out.println("record fount ");
		}
	//close all jdbc object 
	rs.close();
	st.close();
	con.close();


		System.out.println("Hello Satyajeet ");
	}//end of the main method 
}//end of the class
