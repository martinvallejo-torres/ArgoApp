package Modelo;

import java.time.LocalDate;

public class Fumigacion extends Actividad{
    private String producto;
    private double dosis;

    public Fumigacion(int id, LocalDate fecha, String descripcion, Usuario usuarioResponsable, String producto, double dosis) {
        super(id, fecha, descripcion, usuarioResponsable);
        this.producto = producto;
        this.dosis = dosis;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Fumigacion{" +
                super.toString() +
                "producto='" + producto + '\'' +
                ", dosis=" + dosis +
                '}';
    }
}
