public class Biblitecario {

    private String nombre, rut, direccion, id;

    Biblitecario(){

        this.nombre = "nombre";
        this.rut = "rut";
        this.direccion = "direccion";
        this.id = "id";
    }

    Biblitecario(String nombre, String rut, String direccion, String id ){

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.id = id;
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

    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
    }
}
