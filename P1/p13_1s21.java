import java.util.Scanner;

public class p13_1s21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese el valor de 'n': ");
        int n = scanner.nextInt();

        // Calculamos el factorial de n
        long factorial = calcularFactorial(n);

        // Calculamos la sumatoria cúbica del factorial
        long sumatoriaCubica = calcularSumatoriaCubica(factorial);

        // Mostramos el resultado
        System.out.println("El factorial de " + n + " es: " + factorial);
        System.out.println("La sumatoria cúbica del factorial de " + n + " es: " + sumatoriaCubica);

        // Cerramos el Scanner
        scanner.close();
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    // Método para calcular la sumatoria cúbica
    public static long calcularSumatoriaCubica(long numero) {
        long sumatoriaCubica = 0;
        for (long i = 1; i <= numero; i++) {
            sumatoriaCubica += i * i * i;
        }
        return sumatoriaCubica;
    }
}
