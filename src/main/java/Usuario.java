public class Usuario {

    private String nombre, rut, direccion;
    private int numeroTelefono;

    Usuario(){

        this.nombre = "nombre";
        this.rut = "rut";
        this.direccion = "direccion";
        this.numeroTelefono = 0;
    }

    Usuario(String nombre, String rut, String direccion, int numeroTelefono){

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getnumeroTelefono() {
        return numeroTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setnumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
