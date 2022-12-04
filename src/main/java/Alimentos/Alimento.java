/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentos;

import java.util.Date;

/**
 *
 * @author corre
 */
public class Alimento {
    private String nombre;
    private double calorias;
    private String fecha;
    private String usuario;
    private String contrasena;

    public Alimento(String nombre, double calorias, String fecha, String usuario, String contrasena) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String toCSV(){
        return nombre+","+calorias+","+fecha+","+usuario+","+contrasena;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
