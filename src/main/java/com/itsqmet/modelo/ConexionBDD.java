
package com.itsqmet.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionBDD {
    
    private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private Connection cnx;
    private static final String DB_URL="jdbc:mysql://localhost:3306/agenda?useSSL=false&serverTimezone=UTC";
    private static final String USER="root";
    private static final String PASS="1234";
    
    public Connection conectar(){
        try{
            cnx = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch (SQLException e){
            e.printStackTrace(System.out);   
        }
        return cnx;
    }
   
}
