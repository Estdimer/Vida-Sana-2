/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author corre
 */
public class Perfil {
    private String usuario;
    private String nombre;
    private String correo;
    private String contrasena;
    private double altura;
    private double peso;
    private String estado;
    private int id;
    private String fono;
    private String rut;
    private String tipo;
    private int edad;

    public Perfil(String usuario, String nombre, String correo, String contrasena, double altura, double peso, String estado,String tipo,int edad) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.altura = altura;
        this.peso = peso;
        this.estado = estado;
        this.tipo = tipo;
        this.edad=edad;
    }

    public Perfil(String usuario, String nombre, String correo, String contrasena, int id, String fono, String rut,String tipo,int edad) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.id = id;
        this.fono = fono;
        this.rut = rut;
        this.tipo = tipo;
        this.edad=edad;        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
