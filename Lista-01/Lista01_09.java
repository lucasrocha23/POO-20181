import java.util.Scanner;

public class Lista01_09{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("digite 2 numeros:");

		int num_1 = scan.nextInt(), num_2 = scan.nextInt(),pares = 0, impares = 0, soma = num_1 + num_2;

		if(num_1 % 2 == 0){
			pares++;
		}
		
		else{
			impares++;
		}

		
		if(num_2 % 2 == 0){
			pares++;
		}
		
		else{
			impares++;
		}


		System.out.println("qntd impares: " + impares + 
				 "\nqntd pares: " + pares + 
				 "\nsoma: " + soma);
	}
}