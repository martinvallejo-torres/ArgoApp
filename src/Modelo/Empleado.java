package Modelo;

public class Empleado extends Usuario {
    public Empleado(int id, String nombreUsuario, String contrasenia, boolean activo) {
        super(id, nombreUsuario, contrasenia, activo);
    }

    @Override
    public void iniciarSesion() {

    }



}
