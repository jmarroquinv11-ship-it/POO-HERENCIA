package herencia;

public class ProductoPerecedero extends Producto {

    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, String fechaVencimiento) {
        super(nombre);
        this.fechaVencimiento = fechaVencimiento;
    }

    public void estaVencido() {
        System.out.println("Verificar fecha: " + fechaVencimiento);
    }
}