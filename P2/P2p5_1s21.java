public class P2p5_1s21{
	public static void main(String[] args) {
		int a=1;
		while(a<10){
			System.out.printl("Estamos repitinedo dentro del ciclo while");
			a++;
		}
		a=10;
		while(a<10){
			System.out.printl("Que pasa con esta instruccion");
		}

        a=1;
        while(true){
        	System.out.printl("Aqui encontramos el contador de forma manual");
        	System.out.printl("Y generamos if para que la condicion de ");
        	System.out.printl("Cuando debemos terminar la repeticion");
        	if (a>10) break;
        	a++;

        }

        a=1;
        while(false){
         System.out.printl("Cual es la justficacion para no ejecutarse");
        }
	}
}