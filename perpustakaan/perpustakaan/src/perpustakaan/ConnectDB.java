/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */
public class ConnectDB {
    Connection con;
    
    public static Connection connect() {
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jvlibrary","root","");
            return con;
        } catch(Exception e) {
            return null;
        }
    }
}
