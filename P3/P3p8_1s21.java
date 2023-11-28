public class P3p8_1s21{
	public static void main(String[] args) {
		System.out.println("10 numeros fibonacci");
		System.out.println(0);
		System.out.println(1);

		int a= 0, b= 1;
		int c = 2;

		while (c < 10){
			int suma = a + b;
			a = b;
			b = suma;


		System.out.println(b);
		c ++;
		}
	}
}