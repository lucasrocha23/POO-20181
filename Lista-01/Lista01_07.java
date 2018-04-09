import java.util.Scanner;

public class Lista01_07{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("digite a sua nota:");
		int nota = scan.nextInt();

		if (nota > 0 && nota < 50 ){
			System.out.println("Insuficiente");
		}

		else if (nota > 49 && nota < 65){
			System.out.println("Regular");
		}

		else if (nota > 64 && nota < 85){
			System.out.println("Bom");
		}
		
		else if (nota > 84 && nota < 101){
			System.out.println("Otimo");
		}		
	}
}