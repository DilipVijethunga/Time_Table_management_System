/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_table_management_system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DILIP
 */
public class DBConnect {
    
    
    
    public static Connection connect(){
        Connection con = null;
        
        try {
            Class.forName("con.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_mgmt","root","1234");
        } 
        catch (Exception e) {
               System.out.println(e);
        }
        return con;
    
    }
    
}
