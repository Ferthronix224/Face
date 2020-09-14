package mx.com.ferthronix.face;

public class Usuario {
    private int imagen;
    private String usuario;
    private String hora;
    private String descripcion;

    public Usuario(int imagen, String nombre, String hora, String descripcion) {
        this.imagen = imagen;
        this.usuario = nombre;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
