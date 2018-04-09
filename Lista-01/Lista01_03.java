import java.util.Scanner;

public class Lista01_03{

	public static void main (String[] arg){

		Scanner scan = new Scanner(System.in);

		System.out.println("digite 3 notas:");		

		float nota_1 = scan.nextFloat() * 2,
		      nota_2 = scan.nextFloat() * 3,
		      nota_3 = scan.nextFloat() * 5;

		float media = (nota_1 + nota_2 + nota_3)/10;
	
		System.out.println("sua media: " + media);
	}
}