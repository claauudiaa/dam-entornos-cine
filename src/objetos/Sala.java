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