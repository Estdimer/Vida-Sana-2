/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author corre
 */
public abstract class Persona {
    private String usuario;
    private String nombre;
    private String correo;
    private String contrasena;
    private int edad;

    public abstract String imprimirTipo();  
    public abstract String toCSV();

    public Persona(String usuario, String nombre, String correo, String contrasena, int edad) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.edad= edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
