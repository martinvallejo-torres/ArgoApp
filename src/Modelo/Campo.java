package Modelo;

import java.util.ArrayList;

public class Campo {
    private int id;
    private String nombreCampo;
    private String ubicacion;
    private double superficieTotal;
    private ArrayList<Lote> lotes;

    public Campo(int id, String nombreCampo, String ubicacion, double superficieTotal) {
        this.id = id;
        this.nombreCampo = nombreCampo;
        this.ubicacion = ubicacion;
        this.superficieTotal = superficieTotal;
        this.lotes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    @Override
    public String toString() {
        return "Campo{" +
                "id=" + id +
                ", nombreCampo='" + nombreCampo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", superficieTotal=" + superficieTotal +
                '}';
    }
}
