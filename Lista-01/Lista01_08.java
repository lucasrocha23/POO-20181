import java.util.Scanner;

public class Lista01_08{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		float soma = 0, maior = 0, menor = 999999;

		System.out.println("digite 10 numeros:");

		for (int i = 0; i < 10; i++){
			
			int numero = scan.nextInt();
			soma += numero;
		
			if (numero > maior){
				maior = numero;
			}

			if (numero < menor){
				menor = numero;
			}
		}
		
		double media = soma/10;

		System.out.println("a media: " + media + 
				 "\no maior: " + maior + 
				 "\no menor: " + menor);
	}
}