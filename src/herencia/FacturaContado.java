package herencia;

public class FacturaContado extends Factura {

    private double descuento;

    public FacturaContado(int numero, Cliente cliente,
            double total, double descuento) {

        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        return total - descuento;
    }
}