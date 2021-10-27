package Taimoorsql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


	public class drop_T {

		public static void main(String[] args) throws Exception{
			
			
			getConnection();
			

		}

		 public static Connection getConnection () throws Exception{
			   	try {
			   		String driver="com.mysql.cj.jdbc.Driver";
			   		String url= "jdbc:mysql://127.0.0.1:3306/asi";
			   		String username="root";
			   		String password="";
			   		Class.forName(driver);
			   		
			   		Connection conn=DriverManager.getConnection(url,username,password);
			   		//System.out.print("Connected");
			   		Statement s=conn.createStatement();
			   		 s.execute("Drop table tabled");
			   		//while(st.next())
			   			//System.out.println(st.getInt(1)+" "+st.getString(2)+" "+st.getString(3)+st.getString(4)+" "+st.getString(5));
			   		conn.close();		
			   	    return conn;
			   	}
			      catch(Exception e)
			   	{
			   	   System.out.println(e); 
			   	}
			   	
			   	return null;
			 
	}
		 }



