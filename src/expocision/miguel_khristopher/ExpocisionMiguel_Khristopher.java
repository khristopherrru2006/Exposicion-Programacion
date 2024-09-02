/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expocision.miguel_khristopher;

import java.util.Scanner;

/**
 *
 * @author khris
 */
public class ExpocisionMiguel_Khristopher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner (System.in);
        System.out.println("------------BIENVENIDO-------------");
        System.out.println("Ingrese la información de la mascota:");
        System.out.print("Especie de la mascota: ");
        String especieMascota = lea.nextLine();
        System.out.print("Raza de la mascota: ");
        String razaMascota = lea.nextLine();
        System.out.print("Nombre de la mascota: ");
        String nombreMascota = lea.nextLine();
        System.out.print("Edad de la mascota en Años: ");
        int edadMascota = lea.nextInt();
        System.out.print("Peso de la mascota (en kg): ");
        double pesoMascota = lea.nextDouble();
        System.out.println("");
        // Instancia de la clase Mascota 
        Mascota mascota = new Mascota(especieMascota, razaMascota, nombreMascota, edadMascota, pesoMascota);
        //Instancia de la clase Veterinaria donde sale informacion del local
        Veterinaria veterinaria = new Veterinaria ("Pet Plaza,","Col. Las minitas, Calle Venezia #2467,, Av. Juan Lindo, Tegucigalpa", "9695-1456","Abierto las 24 horas", "****");
        //Impresion del metodo toString utilizado en la clase Mascota 
        System.out.println(mascota.toString());
        //Imprimimos el metodo Informacion utilizado en la clase Veterinaria 
        veterinaria.Informacion();
        
        
    } 
}

