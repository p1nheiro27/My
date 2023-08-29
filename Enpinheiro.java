import java.util.Scanner;

/**
 * @author enpinheiro
 *
 */
public class Enpinheiro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente 'c': ");
        double c = scanner.nextDouble();

        boolean encontrouSolucao = false;

        for (double x1 = -1000; x1 <= 1000; x1++) {
            for (double x2 = -1000; x2 <= 1000; x2++) {
                if (x1 != x2 && a * (x1 + x2) + b * x1 * x2 + c == 0) {
                    System.out.println("Solução encontrada:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                    encontrouSolucao = true;
                    break;
                }
            }
            if (encontrouSolucao) {
                break;
            }
        }

        if (!encontrouSolucao) {
        	   System.out.println("Não foi possível encontrar uma solução.");
        }
	

	}

}
