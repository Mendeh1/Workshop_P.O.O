class Parqueadero {
    private Carro[][] espaciosEstacionamiento;
    private double tarifaPorHora;

    public Parqueadero(int numRows, int numColumns, double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
        espaciosEstacionamiento = new Carro[numRows][numColumns];
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espaciosEstacionamiento.length || columna < 0 || columna >= espaciosEstacionamiento[0].length) {
            return false; // Posición inválida
        }

        if (espaciosEstacionamiento[fila][columna] == null) {
            espaciosEstacionamiento[fila][columna] = carro;
            return true;
        } else {
            return false; // Espacio ya ocupado
        }
    }

    public double calcularCostoEstacionamiento(Carro carro, int horas) {
        return tarifaPorHora * horas;
    }

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < espaciosEstacionamiento.length; i++) {
            for (int j = 0; j < espaciosEstacionamiento[i].length; j++) {
                if (espaciosEstacionamiento[i][j] == null) {
                    System.out.print("  ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
