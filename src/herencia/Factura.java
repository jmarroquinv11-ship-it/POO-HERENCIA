package herencia;

public class Factura {

    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {

        this.numero = numero;
        this.cliente = cliente;

        if (total >= 0) {
            this.total = total;
        } else {
            this.total = 0;
        }
    }

    public double calcularTotal() {
        return total;
    }
}