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
        System.out.println("Ingrese su imformacion personal:");
        System.out.println("Ingrese su nombre: ");
        String nombre =lea.next();
        System.out.println("Ingrese su numero de telefono: ");
        String numero = lea.next();
        System.out.println("Ingrese su correo para que le lleguen notificaciones de nuevas ofertas y servicios: ");
        String correo = lea.next();
        System.out.println("Ingrese su numero de identidad: ");
        String identidad = lea.next();
        System.out.println("Ingrese su edad: ");
        int edad = lea.nextInt();
        
        // Menú de selección de motivo de consulta con su costo
        System.out.println("-------Motivo de la consulta y su costo------");
        System.out.println("1) Vacunación - 300 Lempiras");
        System.out.println("2) Baño - 500 Lempiras");
        System.out.println("3) Desparasitación - 700 Lempiras");
        System.out.println("4) Chequeo - 1000 Lempiras");
        int seleccion = lea.nextInt();
        String motivo = "";
        int costo = 0;

        switch (seleccion) {
            case 1:
                motivo = "Vacunación";
                costo = 300;
                break;
            case 2:
                motivo = "Baño";
                costo = 500;
                break;
            case 3:
                motivo = "Desparasitación";
                costo = 700;
                break;
            case 4:
                motivo = "Chequeo";
                costo = 1000;
                break;
        }
        
    } 
}

