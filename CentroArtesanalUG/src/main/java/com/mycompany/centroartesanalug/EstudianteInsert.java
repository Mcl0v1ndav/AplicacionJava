package com.mycompany.centroartesanalug;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class EstudianteInsert {
    
    private Connection connection;
    
    public EstudianteInsert(Connection connection) {
        this.connection = connection;
    }
    
    public void insertarEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "{call InsertarPersona(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setString(1, estudiante.getPrimerNombre());
            cstmt.setString(2, estudiante.getSegundoNombre());
            cstmt.setString(3, estudiante.getPrimerApellido());
            cstmt.setString(4, estudiante.getSegundoApellido());
            cstmt.setInt(5, estudiante.getEdad());
            cstmt.setString(6, estudiante.getCedula());
            cstmt.setString(7, estudiante.getCorreoElectronico());
            cstmt.setString(8, estudiante.getTelefono());
            cstmt.setString(9, estudiante.getNivelEducacion());
            cstmt.setString(10, estudiante.getDireccion());

            cstmt.executeUpdate();
            System.out.println("Usuario insertado correctamente.");
        }
    }
    
    
    
}
