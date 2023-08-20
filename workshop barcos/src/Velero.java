class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande() {
        return cantidadMastiles > 4;
    }

}
