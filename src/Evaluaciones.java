import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darías a la película The Matrix");
            nota = teclado.nextDouble();

            // si se ingresa -1, no se toma en cuenta para la suma|nota
            if (nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para The Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}
