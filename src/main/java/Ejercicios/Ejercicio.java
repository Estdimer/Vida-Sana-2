/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Date;

/**
 *
 * @author corre
 */
public class Ejercicio {
    private String nombre;
    private double repeticiones;
    private String fecha;
    private String usuario;
    private String contrasena;

    public Ejercicio(String nombre, double repeticiones, String fecha, String usuario, String contrasena) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String toCSV(){
        return nombre+","+repeticiones+","+fecha+","+usuario+","+contrasena;
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

    public double getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(double calorias) {
        this.repeticiones = repeticiones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
