import java.util.Scanner;

/**
 * @author enpinheiro
 *
 */
public class P1nheiro27 {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome de uma fruta: ");
	        String fruta = scanner.nextLine().toLowerCase(); // Convertendo para letras minúsculas para comparação

	        switch (fruta) {
	            case "pitaya":
	                System.out.println("Eu gosto dessa fruta.");
	                break;
	            case "banana":
	                System.out.println("Eu não gosto dessa fruta.");
	                break;
	            case "morango":
	                System.out.println("Essa é uma fruta saborosa.");
	                break;
	            case "limão ":
	                System.out.println("Adoro limonada!");
	                break;
	            case "ameixa":
	                System.out.println("ameixas são ótimas para o intestino.");
	                break;
	            default:
	                System.out.println("Eu não conheço essa fruta.");
	        }
		
		
		
	}

}