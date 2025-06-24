import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int somar = 0;
        for (int i = 0; i<10; i++){
            System.out.println("Digite o " + (i+1) + " numero: ");
            vetor[i] = scanner.nextInt();
            somar += vetor[i];
        }
        System.out.println("-- vetor em ordem decrescente --");
        int n = vetor.length;
        boolean trocaFeita;
        for (int i = 0; i < n - 1; i++) {
            trocaFeita = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                   
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocaFeita = true;
                }
               


           
            if (!trocaFeita) {
                break;
            }
        }
          String separador = ""; 
        for (int elemento : vetor) {
            System.out.print(separador + elemento);
            separador = ", ";
        }
        System.out.println();


       
       
        }
         System.out.println(" -- vetor em ordem inversa --");
         for(int i = n - 1; i>=0; i--){
            System.out.println(vetor[i]);
         }
          int maiorNumero = vetor[0];
          int menorNumero = vetor[0];
           for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                 maiorNumero = vetor[i];
            }
            if (vetor[i] < menorNumero) {
                menorNumero = vetor[i];
            }
        }        
        System.out.println("O maior numero no vetor é: " + maiorNumero);
        System.out.println("O menor numero no vetor é: " + menorNumero);
        System.out.println();
        System.out.println("A soma dos valores é " + somar);
        }

    }

