/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centroartesanalug;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;


public class Conexion {
    Connection conectar = null;
    boolean estadoConexion;
    
    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=CentroArtesanalUG;user=sa;password=Sql2019;encrypt=true;trustServerCertificate=true;";
        
        public Connection abriConnection(){
        try {         
            conectar = DriverManager.getConnection(connectionUrl);
            estadoConexion = true;
            JOptionPane.showMessageDialog(null, "Conexión exitosa");            
        } catch (SQLException e) {
            estadoConexion = false;
            JOptionPane.showMessageDialog(null,"Error al abrir conexión:"+e.toString());
        }
        return conectar; 
    }      
    public void cerrarConnection()
    {       
        if (estadoConexion = true) {
            try {
                conectar.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
