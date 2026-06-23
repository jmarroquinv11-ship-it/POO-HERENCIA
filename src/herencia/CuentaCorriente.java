package herencia;

public class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {

        if (saldo - monto >= -limiteSobregiro) {
            saldo -= monto;
        } else {
            System.out.println("Sobregiro excedido");
        }
    }
}