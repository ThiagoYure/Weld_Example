/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo_weld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.enterprise.inject.Produces;

/**
 *
 * @author ThigoYure
 */
public class ConFactory {
    @Produces
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/WeldCDI";
        String usuario = "postgres";
        String senha = "kabuto123456";

        return DriverManager.getConnection(url, usuario, senha);
    }
}
