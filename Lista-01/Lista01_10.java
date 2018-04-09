import java.util.Scanner;

public class Lista01_10{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("digite 1 numero:");
		
		float numero = scan.nextFloat();
		int cont = 0;

		while (numero >= 1){
		
			numero = numero / 2;
			cont++;

		}

		System.out.println("resultado da ultima divisão: " + numero + 
				 "\nqntd de divisões efetuadas :" + cont);

	}
}