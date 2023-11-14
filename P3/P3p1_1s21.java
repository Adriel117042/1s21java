import java.util.Scanner;

public class P3p1_1s21{
	static Scanner teclado= new Scanner(System.in);
	public static void suma(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo Numero");
		int b=teclado.nextInt();
		int c=a+b;
		System.out.println("La suma fue" +c);
	}

public static void Resta(){
	System.out.println("Resta de 2 numeros");
	System.out.println("ingrese el primer numero");
	int a=teclado.nextInt();
	System.out.println("ingrese el segundo numero");
	int b=teclado.nextInt();
	int c=a-b;
	System.out.println("La resta fue" +c);
   }

public static void menu(){
	System.out.println("Operaciones Basicas");
	System.out.println("\n A)Suma");
	System.out.println("   B)Resta");
	System.out.println("   C)Divicion");
	System.out.println("   D)Multiplicacion");
	System.out.println("\n Que Operacion Desas");
   }
public static void main(String [] args){
	menu();
	String opc=teclado.nextLine();
	if(opc.equals ("A"))suma ();
	if(opc.equals ("B"))Resta ();
   }
}   