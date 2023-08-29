
/**
 * @author enpinheiro
 *
 */
public class Vetores {

	 
	public static void main(String[] args) {
	

	
 int[] elementos = {10, 20, 30, 40, 50};
      
     
      for (int i = elementos.length - 1; i >= 0; i--) {
          System.out.println(elementos[i]);
     }

           
      
      int[] elementos1 = {22, -100, 80, 0, 500};
      
    
      int maior = elementos1[0];
      for (int i = 1; i < elementos1.length; i++) {
          if (elementos1[i] > maior) {
              maior = elementos1[i];
          }
      }
      System.out.println("Maior elemento: " + maior);

      int menor = elementos1[0];
      for (int i = 1; i < elementos1.length; i++) {
          if (elementos1[i] < menor) {
              menor = elementos1[i];
          }
      }
      System.out.println("Menor elemento: " + menor);
      

      int soma = 0;
      for (int i = 0; i < elementos1.length; i++) {
          soma += elementos1[i];
      }
      double media = (double) soma / elementos1.length;
      System.out.println("Média dos elementos: " + media);
     
      
     
      
}
}