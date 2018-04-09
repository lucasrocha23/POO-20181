import java.util.Scanner;

public class Lista01_01{

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);

		System.out.println("digite a velocidade em m/s:");

		float velocidade = scan.nextFloat();
		double conversao = velocidade * 3.6;

		System.out.println("sua velocidade: " + conversao + " km/h");
	}
}