import java.util.Scanner;

/**
 * @author enpinheiro
 *
 */
public class P1nheiro27 {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome de uma fruta: ");
	        String fruta = scanner.nextLine().toLowerCase(); // Convertendo para letras min�sculas para compara��o

	        switch (fruta) {
	            case "pitaya":
	                System.out.println("Eu gosto dessa fruta.");
	                break;
	            case "banana":
	                System.out.println("Eu n�o gosto dessa fruta.");
	                break;
	            case "morango":
	                System.out.println("Essa � uma fruta saborosa.");
	                break;
	            case "lim�o ":
	                System.out.println("Adoro limonada!");
	                break;
	            case "ameixa":
	                System.out.println("ameixas s�o �timas para o intestino.");
	                break;
	            default:
	                System.out.println("Eu n�o conhe�o essa fruta.");
	        }
		
		
		
	}

}