package herencia;

/*
 * HERENCIA:
 * Se utilizó la palabra extends para que las clases hijas
 * heredaran atributos y métodos de las clases padre.
 *
 * METODOS SOBRESCRITOS:
 * mostrar()
 * retirar()
 * descripcion()
 * calcularSalario()
 * hacerSonido()
 * mostrarInfo()
 * calcularArea()
 * calcularTotal()
 *
 * USO DE SUPER:
 * Se utilizó super para llamar constructores y métodos
 * de las clases padre.
 *
 * CASOS DE PRUEBA:
 * Docente y Estudiante.
 * CuentaCorriente.
 * ProductoPerecedero.
 * Bus.
 * Gerente.
 * Perro.
 * Moto.
 * Rectangulo y Circulo.
 * LibroDigital.
 * FacturaContado y FacturaCredito.
 */

public class Inicio {

    public static void main(String[] args) {

        System.out.println("===== EJERCICIO 1 =====");
        Docente docente = new Docente("Pedro", 40, "Programacion");
        Estudiante estudiante = new Estudiante("Maria", 20, "20250082");

        docente.mostrar();
        estudiante.mostrar();

        System.out.println("\n===== EJERCICIO 2 =====");
        CuentaCorriente cuenta = new CuentaCorriente(1000, 500);
        cuenta.retirar(1200);
        cuenta.mostrarSaldo();

        System.out.println("\n===== EJERCICIO 3 =====");
        ProductoPerecedero producto =
                new ProductoPerecedero("Leche", "01/07/2026");
        producto.estaVencido();

        System.out.println("\n===== EJERCICIO 4 =====");
        Bus bus = new Bus(50, "Ruta Centro");
        bus.descripcion();

        System.out.println("\n===== EJERCICIO 5 =====");
        Gerente gerente = new Gerente("Carlos", 5000, 1500);
        System.out.println("Salario: " + gerente.calcularSalario());

        System.out.println("\n===== EJERCICIO 6 =====");
        Perro perro = new Perro();
        perro.hacerSonido();

        System.out.println("\n===== EJERCICIO 7 =====");
        Moto moto = new Moto("Yamaha", 180, 600);
        moto.mostrarInfo();

        System.out.println("\n===== EJERCICIO 8 =====");
        Rectangulo rectangulo = new Rectangulo(10, 5);
        Circulo circulo = new Circulo(4);

        System.out.println("Area Rectangulo: " +
                rectangulo.calcularArea());

        System.out.println("Area Circulo: " +
                circulo.calcularArea());

        System.out.println("\n===== EJERCICIO 9 =====");
        LibroDigital libro =
                new LibroDigital("Java", "Deitel", 15.5);

        libro.mostrarInfo();

        System.out.println("\n===== EJERCICIO 10 =====");
        Cliente cliente =
                new Cliente("Juan Perez", "1234567");

        FacturaContado contado =
                new FacturaContado(1, cliente, 1000, 100);

        FacturaCredito credito =
                new FacturaCredito(2, cliente, 1000, 150, 6);

        System.out.println("Total contado: " +
                contado.calcularTotal());

        System.out.println("Total credito: " +
                credito.calcularTotal());

        System.out.println("Cuotas: " +
                credito.getCuotas());
    }
}