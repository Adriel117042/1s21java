import java.util.Scanner;

public class P3p2_1s21{
	static Scanner teclado= new Scanner(System.in);
	public static void suma(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo Numero");
		int b=teclado.nextInt();
		int c=a+b;
		System.out.println("La suma fue " +c);
	}

public static void Resta(){
	System.out.println("Resta de 2 numeros");
	System.out.println("ingrese el primer numero");
	int a=teclado.nextInt();
	System.out.println("ingrese el segundo numero");
	int b=teclado.nextInt();
	int c=a-b;
	System.out.println("La resta fue " +c);
   }

public static void Division(){
   	System.out.println("Division de 2 Numeros");
   	System.out.println("Ingrese el Primer NUmero");
   	int a=teclado.nextInt();
   	System.out.println("Inrese el Segundo numero");
   	int b= teclado.nextInt();
   	int c=a/b;
   	System.out.println("La Division fue " + c);
   }

   public static void Multiplicacion(){
   	System.out.println("Multiplicaion de 2 Numeros");
   	System.out.println("Ingrese el Primer NUmero");
   	int a=teclado.nextInt();
   	System.out.println("Inrese el Segundo numero");
   	int b= teclado.nextInt();
   	int c=a*b;
   	System.out.println("La Multiplicacion fue " + c);
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
	boolean continuar = true;
	while (continuar) {
	menu();
	opc = teclado.nextLine().toUpperCase();

    switch (opc){
    	String opc=teclado.nextLine();
	if(opc.equals("A"))suma(); break;
	if(opc.equals("B"))Resta(); break;
	if(opc.equals("C"))Division(); break;
	if(opc.equals("D"))Multiplicacion(); break;
    if(opc.equals("S")): System.out.println("Se termino el Pograma");
    continuar = false;	break;
default: System.out.println("La opcion no es valida"); break;
     }
      tecaldo.nextLine();
    } 
  } 
} 