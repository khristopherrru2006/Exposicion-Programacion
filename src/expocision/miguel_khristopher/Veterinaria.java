/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expocision.miguel_khristopher;

/**
 *
 * @author khris
 */
public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario; 
    private String valoracion; 
    
    public Veterinaria (String nombre, String direccion, String telefono, String horario, String valoracion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.valoracion = valoracion;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
     public String toString() {
        return "Dueño{"+
               "Nombre='" + nombre+ '\'' +
               ", Direccion='" + direccion + '\'' +
               ", Telefono='" + telefono + '\'' +
               ", Horario=" + horario +
               ", Valoracion=" + valoracion + 
               '}';
                
    }

}
