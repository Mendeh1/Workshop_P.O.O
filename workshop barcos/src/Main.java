public class Main {

    public static void main(String[] args) {
        //Crear un capitan
        Capitan capitan = new Capitan("Juan", "Perez", "123456");

        //Crear una embarcación velero
        Velero velero = new Velero(1000, 0, 2022, 15, capitan, 5);

        //Crear una embarcación yate
        Yate yate = new Yate(2000, 0, 2023, 20, capitan, 8);

        //Calcular montos de alquiler
        double montoVelero = velero.calcularMontoAlquiler();
        double montoYate = yate.calcularMontoAlquiler();

        //Imprimir resultados
        System.out.println("Monto de alquiler del velero: $" + montoVelero);
        System.out.println("Monto de alquiler del yate: $" + montoYate);

        //Verificar si el velero es grande y si el yate se puede comprar
        System.out.println("¿El velero es grande? " + velero.esGrande());
        System.out.println("¿El yate se puede comprar? " + yate.sePuedeComprar());
    }
}
