package Modelo;

import java.time.LocalDate;

public abstract class Actividad {
    private int id;
    private LocalDate fecha;
    private String descripcion;
    private Usuario usuarioResponsable;

    public Actividad(int id, LocalDate fecha, String descripcion, Usuario usuarioResponsable) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.usuarioResponsable = usuarioResponsable;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuarioResponsable() {
        return usuarioResponsable;
    }

    public void setUsuarioResponsable(Usuario usuarioResponsable) {
        this.usuarioResponsable = usuarioResponsable;
    }

    public abstract void ejecutar();

    @Override
    public String toString() {
        return "Actividad{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", usuarioResponsable=" + usuarioResponsable +
                '}';
    }
}
