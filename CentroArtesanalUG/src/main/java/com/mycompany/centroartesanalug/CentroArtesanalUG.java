/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centroartesanalug;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.JFrame;

public class CentroArtesanalUG {
    
    public static void main(String[] args) {
        
        PanelInsertarEstudiantes panel = new PanelInsertarEstudiantes();

        // Crear el marco principal de la aplicación
        JFrame frame = new JFrame("Registro Estudiantil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
}
