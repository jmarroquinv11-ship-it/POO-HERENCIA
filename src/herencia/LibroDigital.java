package herencia;

public class LibroDigital extends Libro {

    private double tamanoMB;

    public LibroDigital(String titulo, String autor, double tamanoMB) {
        super(titulo, autor);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño MB: " + tamanoMB);
    }
}