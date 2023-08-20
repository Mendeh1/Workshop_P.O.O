class Yate extends Embarcacion {
    private int cantidadCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int cantidadCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean sePuedeComprar() {
        return cantidadCamarotes > 7;
    }
}