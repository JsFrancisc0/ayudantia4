import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;
    private String nombreBiblioteca, direccion;


    Biblioteca(){

    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void agregarLibro(String libro){

    }

    public String buscarLibro(String Libro){

        return Libro;

    }

    public ArrayList<Libro> obtenerLibroPorAutor(String autor){

        ArrayList<Libro> LibrosPorAutor = new ArrayList<>();

        return LibrosPorAutor;
    }

    private boolean LibroExiste(Libro libro){
        
        boolean existe = false;
        return existe;
    }

}
