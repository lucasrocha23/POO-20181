import java.util.Scanner;

public class Lista01_06{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		float diaria = 60;
		double total = 0;

		System.out.println("digite seu nome:");
	        String nome = scan.nextLine();

		System.out.println("digite a quantidade de dias da sua estadia:");
		int dias = scan.nextInt();

		if (dias > 15){
			total = dias * (5.5 + diaria);
		}

		else if (dias == 15){
			total = dias * (6 + diaria);
		}

		else if (dias < 15){
			total = dias * (8 + diaria);
		}
		
		System.out.println(nome + " este foi o seu custo total: R$ " + total);
	}
}