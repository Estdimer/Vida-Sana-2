/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author corre
 */
public class Administrador extends Persona{
    private int id;
    private String fono;
    private String rut;   
    
    public String imprimirTipo(){
        return "Cuenta Administrador";
    };

    public String toCSV(){
        return this.id+","+this.fono+ ","+this.rut+","+this.getUsuario()+","+this.getNombre()+","+this.getCorreo()+","+this.getContrasena()+","+this.getEdad();
    }    
    
    public Administrador(int id, String fono, String rut, String usuario, String nombre, String correo, String contrasena, int edad) {
        super(usuario, nombre, correo, contrasena,edad);
        this.id = id;
        this.fono = fono;
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    
}
