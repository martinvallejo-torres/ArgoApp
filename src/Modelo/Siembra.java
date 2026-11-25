package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Siembra {
    private LocalDate fecha;
    private int cantidadSemillas;
    private double superficieUtilizada;
    private Lote lote;
    private Cultivo cultivo;
    private ArrayList<Actividad> actividades;

    public Siembra(LocalDate fecha, int cantidadSemillas, double superficieUtilizada, Lote lote, Cultivo cultivo) {
        this.fecha = fecha;
        this.cantidadSemillas = cantidadSemillas;
        this.superficieUtilizada = superficieUtilizada;
        this.lote = lote;
        this.cultivo = cultivo;
        this.actividades = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidadSemillas() {
        return cantidadSemillas;
    }

    public void setCantidadSemillas(int cantidadSemillas) {
        this.cantidadSemillas = cantidadSemillas;
    }

    public double getSuperficieUtilizada() {
        return superficieUtilizada;
    }

    public void setSuperficieUtilizada(double superficieUtilizada) {
        this.superficieUtilizada = superficieUtilizada;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public String toString() {
        return "Siembra{" +
                "fecha=" + fecha +
                ", cantidadSemillas=" + cantidadSemillas +
                ", superficieUtilizada=" + superficieUtilizada +
                ", lote=" + lote +
                ", cultivo=" + cultivo +
                ", actividades=" + actividades +
                '}';
    }
}
