public class Embarcacion {
    protected double precioBase;
    protected double valorAdicional;
    protected int anioFabricacion;
    protected double eslora;
    protected Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }
    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anioFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }
}

