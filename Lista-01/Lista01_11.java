import java.util.Scanner;

public class Lista01_11{

	public double pedido(int codigo, int qnt){

		double total = 0;

		if (codigo == 10){
			total = qnt * 1.50;
		}

		else if (codigo == 11){
			total = qnt * 1.80;
		}

		else if (codigo == 12){
			total = qnt * 1.90;
		}

		else if (codigo == 20){
			total = qnt * 10;
		}

		else if (codigo == 30){
			total = qnt * 8;
		}

		else if (codigo == 50){
			total = qnt * 2.50;
		}

		return total;
	}

	public static void main(String[] args){

		Lista01_11 new_pedido = new Lista01_11();

		Scanner scan = new Scanner(System.in);

		System.out.println("digite a qntd de produtos a serem pedidos:");

		int qnt = scan.nextInt(), i, qnt_cada, codigo;
		double valor_total = 0;

		System.out.println("digite o codigo e a qntd de cada produto:");

		for(i = 0; i < qnt; i++){

			codigo = scan.nextInt();
			qnt_cada = scan.nextInt();	
			
			qnt = qnt - (qnt_cada - 1);		

			valor_total += new_pedido.pedido(codigo, qnt_cada);
		}
	
		if (valor_total > 50){
			valor_total -= (valor_total * 0.05);
		}
		
		System.out.println("o seu total é: " + valor_total);
	}
}