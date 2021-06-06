
package itpm_project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_mgmt","root","root");
            
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
                          
        return conn;     
    }
    
}
