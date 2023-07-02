/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centroartesanalug;

/**
 *
 * @author User
 */
public class MetodosMostrarAdmision {
    
    
    String tablaString[] = new String[0];  
    int IdPersona;
    
    public MetodosMostrarAdmision(int IdPersona) {
        
        this.IdPersona = IdPersona;
        tablaString[0] = String.valueOf(this.IdPersona);
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }
}
