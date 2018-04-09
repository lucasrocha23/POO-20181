import java.util.Scanner;

public class Lista01_05{

	public String mes(int mes_int, String mes_str){

		if (mes_int == 1){
			mes_str = "Janeiro";
		}	
		
		else if (mes_int == 2){
			mes_str = "Fervereiro";
		}

		else if (mes_int == 3){
			mes_str = "Março";
		}

		else if (mes_int == 4){
			mes_str = "Abril";
		}

		else if (mes_int == 5){
			mes_str = "Maio";
		}

		else if (mes_int == 6){
			mes_str = "Junho";
		}

		else if (mes_int == 7){
			mes_str = "Julho";
		}

		else if (mes_int == 8){
			mes_str = "Agosto";
		}

		else if (mes_int == 9){
			mes_str = "Setembro";
		}

		else if (mes_int == 10){
			mes_str = "Outubro";
		}

		else if (mes_int == 11){
			mes_str = "Novembro";
		}

		else if (mes_int == 12){
			mes_str = "Dezembro";
		}

		return mes_str;
	}

	public static void main(String[] args){

		Lista01_05 new_mes = new Lista01_05();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("digite o numero equivalente ao mês:");

		String resposta = new_mes.mes(scan.nextInt(),"");

		System.out.println("seu mês é " + resposta);

	}
}