public class Lista01_12{
	public static void main(String args[]){
	
		int i,quadrado,cubo;

		System.out.println("Número    Quadrado    Cubo");

		for(i = 0; i <= 10; i++){

			quadrado = (int)Math.pow(i,2);
			cubo = (int)Math.pow(i,3);

			System.out.println("  " + i + "          " + quadrado + "          " + cubo); 
		}
 
	}
}