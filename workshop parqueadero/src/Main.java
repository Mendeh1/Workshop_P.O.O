public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 5.0);

        Carro carro1 = new Carro("ABC123", "Toyota", "Camry");
        Carro carro2 = new Carro("XYZ789", "Honda", "Civic");

        if (parqueadero.parquearCarro(carro1, 2, 3)) {
            System.out.println("Carro 1 estacionado exitosamente.");
        } else {
            System.out.println("No se pudo estacionar el carro 1.");
        }

        if (parqueadero.parquearCarro(carro2, 2, 3)) {
            System.out.println("Carro 2 estacionado exitosamente.");
        } else {
            System.out.println("No se pudo estacionar el carro 2.");
        }

        double costoCarro1 = parqueadero.calcularCostoEstacionamiento(carro1, 3);
        double costoCarro2 = parqueadero.calcularCostoEstacionamiento(carro2, 5);

        System.out.println("Costo de estacionamiento para el carro 1: $" + costoCarro1);
        System.out.println("Costo de estacionamiento para el carro 2: $" + costoCarro2);

        System.out.println("Estado del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
    }
}