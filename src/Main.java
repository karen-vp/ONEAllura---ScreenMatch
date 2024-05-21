import com.aluracursos.screenmatch.modelos.Pelicula;

public class Main {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Harry Potter");
        miPelicula.setFechaDeLanzamiento(2012);
        miPelicula.setDuracionEnMinutos(90);

        miPelicula.evaluaPelicula(7.8);
        miPelicula.evaluaPelicula(10);
        miPelicula.evaluaPelicula(7.8);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media: " + miPelicula.calculaMedia());






    }
}