import java.util.Scanner;

public class P2p7_1s21{
	public static void main(String[] args) {
		char opc;
		Scanner teclado = new Scanner(System.in);
		boolean estado = true;

		do{
			System.out.println(" M e n u D e O p c i o n e s");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicaion");
			System.out.println("4.- Divicion");
			System.out.println("S.- Salir");
			System.out.println("¿Que opcion deseas? ");
			opc = teclado.nextLine(). charAt(0);
			switch(opc){
			case '1': System.out.println("aqui va la suma"); break;
			case '2': System.out.println("aqui va la resta"); break;
			case '3': System.out.println("aqui va la multiplicacion"); break;
			case '4': System.out.println("aqui va la Divicion"); break;
			case 'S':
			case 's': 
				System.out.println("aqui va la opcion salir");
				estado=false;
				break;
			}
		}while(estado);
	}
}