public class Prestamo {

    private String bibliotecario, usuario, libro, fechaInicio, fechatermino;

    public Prestamo(String bibliotecario, String usuario, String libro, String fechaInicio, String fechatermino) {
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechatermino = fechatermino;
    }

    Prestamo(){

    }

    public String getBibliotecario() {
        return bibliotecario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getLibro() {
        return libro;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechatermino() {
        return fechatermino;
    }

    public void setBibliotecario(String bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechatermino(String fechatermino) {
        this.fechatermino = fechatermino;
    }
}
