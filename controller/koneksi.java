/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Noval
 */
public class koneksi {
    static Connection kon;  
    
    public static Connection connection() {
        if (kon == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("toko");
            data.setUser("root");
            data.setPassword("");
            try {
                kon = data.getConnection();
                System.out.println("Sudah Terkoneksi");
            }catch (Exception e) {
                System.out.println("Belum Terkoneksi");
            }
        }
        return kon;
    }

    public static com.mysql.jdbc.Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
