/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anhnguyen
 */
public class DAO {

    public static Connection con;

    public DAO() {
        if (con == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/duaxef1?autoReconnect=true&useSSL=false";
            String dbClass = "com.mysql.cj.jdbc.Driver";

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
