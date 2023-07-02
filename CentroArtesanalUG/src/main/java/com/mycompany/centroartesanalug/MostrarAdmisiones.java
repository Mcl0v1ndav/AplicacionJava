
package com.mycompany.centroartesanalug;

import java.sql.CallableStatement;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarAdmisiones {
    private Connection connection;
    
    public MostrarAdmisiones(Connection connection) {
        this.connection = connection;
    }
    
    public void MostrarAdmisiones(MetodosMostrarAdmision metodosMostrarAdmision) throws SQLException {
     
        String sqlSP = "{EXECUTE MostrarAdmision}";
        String tabla[] = new String[0];
        DefaultTableModel tm = new DefaultTableModel();
        Statement rStatement = connection.createStatement();
        ResultSet rs = rStatement.executeQuery(sqlSP);
        
        while (rs.next()) {
            tabla[0] = rs.getString("IdPersona");       
            tm.addRow(tabla);
                       
        }
    }               
}
