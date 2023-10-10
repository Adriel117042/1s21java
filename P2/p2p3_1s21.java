import java.util.Scanner;

public class p2p3_1s21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese un numero para la demostracion de su tabla de multiplicar del 0 al 10");
		String numero1="1";
		int numero2;
		numero1=teclado.nextLine();
		switch(numero1){
		case "0":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(0 + "*" + numero2 + "=" + 0 *numero2);}
			    break;
		    case "1":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(1 + "*" + numero2 + "=" + 1 *numero2);}
			    break;
			case "2":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(2 + "*" + numero2 + "=" + 2 *numero2);}
			    break;
			case "3":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(3 + "*" + numero2 + "=" + 3 *numero2);}
			    break;
			case "4":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(4 + "*" + numero2 + "=" + 4 *numero2);}
			    break;
			case "5":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(5 + "*" + numero2 + "=" + 5 *numero2);}
			    break;
			case "6":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(6 + "*" + numero2 + "=" + 6 *numero2);}
			    break;
			case "7":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(7 + "*" + numero2 + "=" + 7 *numero2);}
			    break;
			case "8":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(8 + "*" + numero2 + "=" + 8 *numero2);}
			    break;
			case "9":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(9 + "*" + numero2 + "=" + 9 *numero2);}
			    break;
			case "10":
		    	System.out.println("tabla de multiplicar de 1");
			    for ( numero2=0;numero2<=10;numero2++ ) {
			    System.out.println(10 + "*" + numero2 + "=" + 10 *numero2);}
			    break;
			default:
			System.out.println("no existe esta multiplicacion");
		}
		}
	}
