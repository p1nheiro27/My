import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	      
	        int[] array = new int[5];
	        
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o elemento " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }
	        
	        System.out.print("Digite o n�mero a ser buscado: ");
	        int numeroBuscado = scanner.nextInt();
	        

	        boolean encontrado = false;
	        for (int i = 0; i < 5; i++) {
	            if (array[i] == numeroBuscado) {
	                System.out.println("N�mero encontrado no �ndice " + i);
	                encontrado = true;
	                break; 
	        }
	        
	        if (!encontrado) {
	            System.out.println("N�mero n�o encontrado na array.");
	        }

	}

	        
	        
	        
	        
	        
	        
	        
	        
}
}