package bank.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBank {
	static  Connection conn=null;
    static final String URL="jdbc:mysql://localhost:3307/mybank";
    static final String UN="root";
    static final String PASS="root";
    static String DB="com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnection() {
    	try {
    		//load the driver
    		Class.forName(DB);
    		conn = DriverManager.getConnection(URL, UN, PASS);
    		
    		if(conn!=null) {
    			System.out.println("Connected");
    		}else {
    			System.out.println("Not connected");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
  
    	return conn;

}
}
