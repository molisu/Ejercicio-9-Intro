public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(30, "Firulais", 374562565, 30000);
        System.out.println("Cliente Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador(40, "Daniela", 13467843, 5000000);
        System.out.println("Trabajador Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}
