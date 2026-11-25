package Modelo;

public class Cultivo {
    private int id;
    private String especie;
    private String variedad;
    private double dimensiones;
    private String caracteristicas;
    private String ciclo;

    public Cultivo(int id, String especie, String variedad, double dimensiones, String caracteristicas, String ciclo) {
        this.especie = especie;
        this.variedad = variedad;
        this.dimensiones = dimensiones;
        this.caracteristicas = caracteristicas;
        this.ciclo = ciclo;
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }


    @Override
    public String toString() {
        return "Cultivo{" +
                "id=" + id +
                ", especie='" + especie + '\'' +
                ", variedad='" + variedad + '\'' +
                ", dimensiones=" + dimensiones +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", ciclo='" + ciclo + '\'' +
                '}';
    }
}
