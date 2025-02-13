package entidad;

public class Usuario {
    
    private String idUsuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasena;
    private String tipo;
    private String ultimaCnn;
    
    public Usuario() {}

    public Usuario(String idUsuario, String nombre, String apellidos, String correo, String contrasena, String tipo, String ultimaCnn) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.ultimaCnn = ultimaCnn;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUltimaCnn() {
        return ultimaCnn;
    }

    public void setUltimaCnn(String ultimaCnn) {
        this.ultimaCnn = ultimaCnn;
    }
}
