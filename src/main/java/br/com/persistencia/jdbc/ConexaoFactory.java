
package br.com.persistencia.jdbc;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoFactory {
    
    public static Connection getConnection () {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb","postgres","postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    
        
    
    }
    
}
