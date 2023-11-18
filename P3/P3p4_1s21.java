import java.util.Scanner;

public class P3p4_1s21{
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int valor =2;
		System.out.println("Ingrese la repeticion");
		int b=teclado.nextInt();
		
			System.out.println("La elevacion es " + valor);
			valor = valor;
		}
    public static void elevacion(int a, int contador){
		System.out.println("El valor es " + a);
		if(!(contador == 5)) elevacion(a*2,contador+1);
	}