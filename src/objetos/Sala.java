package objetos;

public class Sala {

    private int numSala;
    private Pelicula pelicula;
    private int[][] butacas;

    public Sala(int numSala, Pelicula pelicula, int filas, int columnas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.butacas = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.butacas[i][j] = 0; // 0 representa libre
            }
        }
    }

    /**
     * Este método se encarga de mostrar la información de la sala usando el número
     * y los dos atributos con los que cuenta la clase Pelicula.
     */
    public void mostrarInformacion() {
        System.out.println("\nNúmero de Sala: " + numSala);
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
    }

    /**
     * Este método reserva la butaca según el número de sala.
     * Primero muestra la matriz, después permite escoger el sitio, por último
     * vuelve a mostrar la matriz indicando donde está el asiento.
     * Si el asiento es 0, significa que no está reservado, en cambio, si el asiento
     * es 1, indica que está reservado.
     * Si se intenta reservar un asiento marcado con 1, no será permitido y permitirá
     * elegir otra opción.
     */
    public void reservarButaca() {

        Scanner entrada = new Scanner(System.in);
        int fila;
        int columna;
        System.out.println("\n");
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nSelecciona una fila: ");
        fila = entrada.nextInt();
        System.out.print("Selecciona una columna: ");
        columna = entrada.nextInt();

        // Esta parte impide que se reserve una butaca ocupada

        if (butacas[fila][columna] == 1) {
            System.out.println("\nAsiento ocupado, por favor, seleccione otro asiento\n");
        } else {
            butacas[fila][columna] = 1; // El 1 representa una butaca ocupada
            System.out.println("\nAsiento reservado con éxito\n");
        }

        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int[][] getButacas() {
        return butacas;
    }

    public void setButacas(int[][] butacas) {
        this.butacas = butacas;
    }

}