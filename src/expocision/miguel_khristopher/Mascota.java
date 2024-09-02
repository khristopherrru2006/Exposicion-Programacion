/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expocision.miguel_khristopher;

/**
 *
 * @author khris
 */
public class Mascota {
    private String mascota;
    private String raza;
    private String nombre;
    private int edad;
    private double peso;
    
    public Mascota(String mascota, String raza, String nombre, int edad, double peso) {
         this.mascota = mascota;
         this.raza = raza;
         this.nombre = nombre;
         this.edad = edad;
         this.peso = peso;
    }
    public String getMascota (){
        return mascota;
    }
    public void setMascota(String mascota){
        this.mascota = mascota;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0)
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Mascota{" +
                "Especie='" + mascota+ '\'' +
                ", Raza='" + raza + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Edad=" + edad + " años" +
                ", Peso=" + peso + " kg" +
                '}';
    }

}
