/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expocision.miguel_khristopher;

/**
 *
 * @author khris
 */
public class Dueño {
    private String nombre;
    private String telefono;
    private String correo;
    private String identidad;
    private int edad;
    public Dueño(String nombre, String telefono, String correo, String identidad, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.identidad = identidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono ) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
     public String getId() {
        return identidad;
    }
    public void setId(String id) {
        this.identidad = id;
    } 
     public String toString() {
        return "Dueño{"+
               "Nombre='" + nombre+ '\'' +
               ", Edad='" + edad + '\'' +
               ", Telefono='" + telefono + '\'' +
               ", Correo=" + correo +
               ", Id=" + identidad + 
               '}';
                
    }
}
