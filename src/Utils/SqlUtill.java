package Utils;

import java.sql.ResultSet;
import time_table_management_system.DBConnect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DILIP
 */
public class SqlUtill {

    private static ResultSet res;

    /**
     * Search data
     *
     * @param qyr
     * @return
     */
    public static ResultSet Search(String qyr) {

        try {
            res = DBConnect.connect().prepareStatement(qyr).executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.Show_info(e.getMessage());
        }

        return res;
    }

    public static void InsertData(String qyr) {
        try {
            DBConnect.connect().prepareStatement(qyr).execute();
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.Show_info(e.getMessage());
        }

    }

    public static void UpdateData(String qyr) {
        try {
            DBConnect.connect().prepareStatement(qyr).execute();
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.Show_info(e.getMessage());
        }

    }
    
    public static void DeleteData(String qyr) {

        try {

            DBConnect.connect().prepareStatement(qyr).execute();
        } catch (Exception e) {
        }

    }

    public static ResultSet GetData(String gyr) {
        try {
            res = DBConnect.connect().prepareStatement(gyr).executeQuery();
            //pst = con.prepareStatement(sql);
            //res = pst.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.Show_info(e.getMessage());
        }

        return res;
    }

}
