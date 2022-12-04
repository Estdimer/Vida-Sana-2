/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author corre
 */
public class Usuario extends Persona{
    private double altura;
    private double peso;
    private String estado;
    
    public String imprimirTipo(){
        return "Cuenta Usuario";
    };

    public Usuario(double altura, double peso, String estado, String usuario, String nombre, String correo, String contrasena, int edad) {
        super(usuario, nombre, correo, contrasena, edad);
        this.altura = altura;
        this.peso = peso;
        this.estado = estado;
    }
    
    public String toCSV(){
        return this.altura+","+this.peso+ ","+this.estado+","+this.getUsuario()+","+this.getNombre()+","+this.getCorreo()+","+this.getContrasena()+","+this.getEdad();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
