package Modelo;

import java.util.ArrayList;

public class Lote {
    private int id;
    private String nombreLote;
    private double superficie;
    private String tipoSuelo;
    private boolean disponible;
    private ArrayList<Siembra> siembras;

    public Lote(int id, String nombreLote, double superficie, String tipoSuelo) {
        this.id = id;
        this.nombreLote = nombreLote;
        this.superficie = superficie;
        this.tipoSuelo = tipoSuelo;
        this.disponible = false;
        this.siembras = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLote() {
        return nombreLote;
    }

    public void setNombreLote(String nombreLote) {
        this.nombreLote = nombreLote;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", nombreLote='" + nombreLote + '\'' +
                ", superficie=" + superficie +
                ", tipoSuelo='" + tipoSuelo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
