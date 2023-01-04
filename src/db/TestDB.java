package db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getConnection(Url, username, psw)
		Connection dbObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		
		/* ================= insert sql===========================*/
		
//		String sql = "insert into user(user_name,password) values('meter', '3223')";
//		
//        Statement stm = dbObject.createStatement();
//		  stm.execute(sql);
//         dbObject.close();
//		
//		System.out.println("added success");
//		
//		
		
		/*================ select sql =========================== */
//		  //1. write sql		
//	    	String sql ="select * from user where id =4";
		
		 //#Search query
		 // String sql = "select * from user where user_name like '%a%' order by user_name desc ";  //contains
		  
		 //String sql = "select * from user where user_name like 'a%'";  //start from
		 //String sql = "select * from user where user_name like '%a'";  //end with
		
		//#Count sql
		   String sql = "select COUNT(id) as total_user from user where user_name like '%a%' ";
		  
		  //2. create statement 
	    	Statement stm = dbObject.createStatement();
		  //3. execute sql(for write sql) / executeQuery (for read sql)
	    	ResultSet rs = stm.executeQuery(sql);
	    	rs.next();
	    	
	    	System.out.println("Total Users = "+rs.getInt("total_user"));
	    	
//	    	while(rs.next()) {
//	    		//id|username|password|
//	    		System.out.println("Id = "+rs.getInt("id"));
//	    		//System.out.println("UserName = "+rs.getString("user_name"));
//	    		System.out.println("UserName = "+rs.getString(2));
//	    		System.out.println("Password = "+rs.getString("password"));
//	    		System.out.println("=============================");
//	    	}
		  //4. db close
		    dbObject.close();
		
		/* ==================== update sql===================== */
		    
//		    String newPsw = "YYYY90";
//		    int uid =3;
//		
//		
//		    String sql ="update user set password = '"+newPsw+"' where id = '"+uid+"'";
//		    Statement stm = dbObject.createStatement();
//		    stm.execute(sql);
//		    
//		    
//		    dbObject.close();
//		    System.out.println("update success");
		
/*================== delete sql =========================*/
		
//	    String delsql ="delete from user where id='2'";
//		Statement st =dbObject.createStatement();
//	    st.execute(delsql);
	}
}
