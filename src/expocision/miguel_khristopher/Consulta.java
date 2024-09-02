/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expocision.miguel_khristopher;

/**
 *
 * @author khris
 */
public class Consulta {
    private String fecha;
    private String motivo; 
    private int costo;
    private String veterinario;
    private String comentario;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
        
    }
    public void InformacionConsulta() {
        System.out.println("Informacion sobre la consulta:");
        System.out.println("Fecha de la consulta: " + fecha);
        System.out.println("Motivo de la consulta: " + motivo);
        System.out.println("Costo: " + costo);
        System.out.println("Nombre de quien lo va a atender: " + veterinario);
        System.out.println("Tu experiencia sobre la consulta: " + comentario);
    }
}
