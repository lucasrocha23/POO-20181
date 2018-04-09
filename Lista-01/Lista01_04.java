import java.util.Scanner;

public class Lista01_04{
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("digite 4 notas:");

		float nota_1 = scan.nextFloat();
		float nota_2 = scan.nextFloat();
		float nota_3 = scan.nextFloat();
		float nota_4 = scan.nextFloat();

		float media = (nota_1 + nota_2 + nota_3 + nota_4)/4;

		if (media >= 7){
			System.out.println("Aprovado!");
		}

		else if (media < 5){
			System.out.println("Reprovado!");
		}

		else{
			System.out.println("Final!");
		}
	}
}