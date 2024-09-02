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
    private String hora;
    public Consulta(String fecha, String motivo, int costo, String veterinario, String comentario) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.costo = costo;
        this.veterinario = veterinario;
        this.hora = comentario;
    }

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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
        
    }
    // Para imprimir los datos de la consulta
    public String toString() {
        return "Dueño{"+
               "Fecha='" + fecha+ '\'' +
               ", Motivo='" + motivo + '\'' +
               ", Costo='" + costo + '\'' +
               ", Veterinario=" + veterinario +
               ", Hora=" + hora + 
               '}';
                
    }
}
