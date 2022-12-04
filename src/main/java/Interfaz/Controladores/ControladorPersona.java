/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz.Controladores;

import Interfaz.IMC;
import Interfaz.Perfil;
import Personas.Administrador;
import Personas.Persona;
import Personas.Usuario;
import java.util.ArrayList;

/**
 *
 * @author corre
 */
public class ControladorPersona implements IMC {
    public static ArrayList<Usuario> uss =new ArrayList<>();
    public static ArrayList<Administrador> adm =new ArrayList<>();
    
    public static boolean validacionRegistro(String usuario, String contrasena){
        for(Persona p:uss)
            if(usuario.equals(p.getUsuario()) || contrasena.equals(p.getContrasena()))
                return true;
        return false;
    }
    
    public static boolean validacion(String usuario, String contrasena){
        for(Persona p:uss)
            if(usuario.equals(p.getUsuario()) && contrasena.equals(p.getContrasena()))
                return true;
        return false;
    }
    
    public static boolean validacion(String usuario, String contrasena,int id){
        int idAdmin = 12345;
        for(Persona p:adm)
            if(usuario.equals(p.getUsuario()) && contrasena.equals(p.getContrasena()) && idAdmin == id)
                return true;
        return false;
    }
    

    public static String getEstado(double peso, double altura){
        if(peso/(altura*altura) < BP)
            return "Bajo peso";
        if(peso/(altura*altura) < S)
            return "Saludable";
        if(peso/(altura*altura) < SP)
            return "Sobre peso";
        if(peso/(altura*altura) < O1)
            return "Obesidad clase 1";
        if(peso/(altura*altura) < O2)
            return "Obesidad clase 2";
        return "Obesidad clase 3";
    }
    
    public static Perfil getPerfil(String usser,String pass){
        Perfil perfil;
        for(Usuario p:uss)
            if(usser.equals(p.getUsuario()) || pass.equals(p.getContrasena())){
                perfil = new Perfil(p.getUsuario(),p.getNombre(),p.getCorreo(),p.getContrasena(),p.getAltura(),p.getPeso(),p.getEstado(),p.imprimirTipo(),p.getEdad());
                return perfil;
            }        
        return null;
    }
    
        public static Perfil getPerfil(String usser,String pass,int id){
        Perfil perfil;
        for(Administrador p:adm)
            if(usser.equals(p.getUsuario()) || pass.equals(p.getContrasena())){
                perfil = new Perfil(p.getUsuario(),p.getNombre(),p.getCorreo(),p.getContrasena(),id,p.getFono(),p.getRut(),p.imprimirTipo(),p.getEdad());
                return perfil;
            }        
        return null;
    }
        public static void EliminarUsuario(Perfil perfil){
            uss.remove(perfil);
        }
}
