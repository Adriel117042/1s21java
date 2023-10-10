import java.util.Scanner;

public class P11_1s21{
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String operacion;
	String temp;
	int num1, num2;
	int resultado;

	System.out.println("programa que realiza operaciones basicas");
	System.out.println("que operacio desea: suma, resta, divicion o multiplicacion?");
	operacion = teclado.nextLine();
	if(operacion.equals("suma")){
		System.out.println("aui devemos realizar una suma");
		System.out.println("ingresa primer numero");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingrese segundo numero");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 + num2;
		System.out.println("la suma es:" + resultado);

	} else if (operacion.equals("resta")){
		System.out.println("aqui devemos realizar una resta");
				System.out.println("ingresa primer numero");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingrese segundo numero");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 - num2;
		System.out.println("la resta es:" + resultado);


	} else if (operacion.equals("divicion")){
		System.out.println("aqui devemos relizar una divicion");
				System.out.println("ingresa primer numero");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingrese segundo numero");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 / num2;
		System.out.println("la divicion es:" + resultado);


	} else if (operacion.equals("multiplicacion")){
		System.out.println("aqui devemos hacer una multiplicacion");
				System.out.println("ingresa primer numero");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingrese segundo numero");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 * num2;
		System.out.println("la multiplicacion es:" + resultado);


	} else if ({
		System.out.println("no existe operacion a realizar");
	}
}
}