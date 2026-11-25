package Modelo;

import java.time.LocalDate;

public class Cocecha extends Actividad{

    private int cantidadObtenida;
    private String humedad;

    public Cocecha(int id, LocalDate fecha, String descripcion, Usuario usuarioResponsable, int cantidadObtenida, String humedad) {
        super(id, fecha, descripcion, usuarioResponsable);
        this.cantidadObtenida = cantidadObtenida;
        this.humedad = humedad;
    }

    public int getCantidadObtenida() {
        return cantidadObtenida;
    }

    public void setCantidadObtenida(int cantidadObtenida) {
        this.cantidadObtenida = cantidadObtenida;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }


    @Override
    public void ejecutar() {

    }
    public void calcularRendimiento(){

    }

    @Override
    public String toString() {
        return "Cocecha{" +
                super.toString() +
                "cantidadObtenida=" + cantidadObtenida +
                ", humedad='" + humedad + '\'' +
                '}';
    }
}
