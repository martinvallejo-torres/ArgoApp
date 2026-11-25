package Modelo;

public class Administrador extends Usuario {


    public Administrador(int id, String nombreUsuario, String contrasenia, boolean activo) {
        super(id, nombreUsuario, contrasenia, activo);
    }

    @Override
    public void iniciarSesion() {

    }
}
