package Modelo;

import java.time.LocalDate;

public class Riego extends Actividad{
    private double cantidadAgua;
    private double duracion;

    public Riego(int id, LocalDate fecha, String descripcion, Usuario usuarioResponsable, double cantidadAgua, double duracion) {
        super(id, fecha, descripcion, usuarioResponsable);
        this.cantidadAgua = cantidadAgua;
        this.duracion = duracion;
    }

    public double getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(double cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Riego{" +
                super.toString() +
                "cantidadAgua=" + cantidadAgua +
                ", duracion=" + duracion +
                '}';
    }
}
