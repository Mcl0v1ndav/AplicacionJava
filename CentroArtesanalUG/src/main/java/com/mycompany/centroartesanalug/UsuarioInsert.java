/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centroartesanalug;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioInsert {
    private Connection connection;
    
    public UsuarioInsert(Connection connection) {
        this.connection = connection;
    }
    
    public void insertarUsuario(Usuario usuario) throws SQLException {
        String sql = "{call InsertarUsuario(?, ?)}";

        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setString(1, usuario.getUsuario());
            cstmt.setString(2, usuario.getContraseña());

            cstmt.executeUpdate();
            System.out.println("Usuario insertado correctamente.");
        }
    }
}
