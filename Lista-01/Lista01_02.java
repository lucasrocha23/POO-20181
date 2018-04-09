import java.util.Scanner;

public class Lista01_02{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("digite seu ano de nascimento:");

		int data = scan.nextInt();
		int idade = 2018 - data;

		System.out.println("sua idade eh: " + idade + " anos");
	}
}