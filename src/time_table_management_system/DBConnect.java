/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_table_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DILIP
 */
public class DBConnect {

    private static Connection conn;

    public static Connection connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            if (conn == null) {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_mgmt", "root", "1234");
                return conn;
            } else {
                return conn;
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return conn;
    }
}
