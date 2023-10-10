import java.util.Scanner;

public class P2p6_1s21{
	public static void main(String[] args) {
		Scanner taclado = new Scanner(System.in);
		char opc;
		int a=1;
		do{
			System.out.println("Aqui nos repetimos");
			a++;
		}while(a<10);

		a=10;
		do{
			System.out.println("Acaso no se ejecutara esta linea");
			a++;
		}while(a<10);
		do{
			System.out.println("Presiona s para salir ");
			opc = teclado.next().charAt(0);
		}while (opc != 's');	
	}
}