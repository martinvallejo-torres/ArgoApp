package Modelo;

import java.time.LocalDate;

public class Fertilizacion extends Actividad{
    private int cantidad;
    private String fertilizante;

    public Fertilizacion(int id, LocalDate fecha, String descripcion, Usuario usuarioResponsable, int cantidad, String fertilizante) {
        super(id, fecha, descripcion, usuarioResponsable);
        this.cantidad = cantidad;
        this.fertilizante = fertilizante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFertilizante() {
        return fertilizante;
    }

    public void setFertilizante(String fertilizante) {
        this.fertilizante = fertilizante;
    }

    @Override
    public void ejecutar() {

    }

    @Override
    public String toString() {
        return "Fertilizacion{" +
                super.toString() +
                "cantidad=" + cantidad +
                ", fertilizante='" + fertilizante + '\'' +
                '}';
    }
}
