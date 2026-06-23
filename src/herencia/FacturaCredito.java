package herencia;

public class FacturaCredito extends Factura {

    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente,
            double total, double recargo, int cuotas) {

        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        return total + recargo;
    }

    public int getCuotas() {
        return cuotas;
    }
}