package herencia;

public class Cuenta {

    protected double saldo;

    public Cuenta(double saldo2) {
		// TODO Auto-generated constructor stub
	}

	public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}