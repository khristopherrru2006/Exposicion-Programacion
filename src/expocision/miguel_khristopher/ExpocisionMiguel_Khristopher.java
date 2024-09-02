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
        System.out.println("");
        Dueño dueno = new Dueño( nombre,numero, correo, identidad, edad);
        System.out.println("Ingrese la informacion sobre la cita:");
        lea.nextLine();
        System.out.println("Ingrese la fecha en la que quieres la cita: ");
        String fecha = lea.nextLine();
         // Menú de selección de motivo de consulta con su costo
        System.out.println("-------Motivo de la consulta y su costo------");
        System.out.println("1) Vacunación - 300 Lempiras");
        System.out.println("2) Baño - 500 Lempiras");
        System.out.println("3) Desparasitación - 700 Lempiras");
        System.out.println("4) Chequeo - 1000 Lempiras");
        System.out.println("Que desea hacer con su mascota: ");
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
        lea.nextLine();
        System.out.println("A que horas quiere su cita: ");
        String hora = lea.nextLine();
        Consulta consulta = new Consulta(fecha, motivo, costo, "Dr. Juan Pérez", hora);
        int seleccion2;
        do{
            System.out.println("<-----Servicios Disponibles----->");
            System.out.println("1) Ver informacion personal");
            System.out.println("2) Ver informacion de la mascota");
            System.out.println("3) Ver informacion de la cita");
            System.out.println("4) Ver informacion de la veterinaria ");
            System.out.println("5) Salir");
            System.out.println("Que desea hacer: ");
            seleccion2 = lea.nextInt();
            switch(seleccion2){
                case 1:
                    System.out.println(dueno.toString());
                    break;
                case 2:
                    System.out.println(mascota.toString());
                    break;
                case 3:
                    System.out.println(consulta.toString());
                    break;
                case 4:
                    System.out.println(veterinaria.toString());
                    break;
                case 5:
                    System.out.println("Gracias por visitarnos vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }                  
        }while(seleccion2 !=5);
        
        
    } 
}


