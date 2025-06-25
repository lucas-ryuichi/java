import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100) + 1; 
    }
     }
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
                 
            
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matriz[i][j]); 
            }
            System.out.println(); 
        }
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 4; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("soma da diagonal principal: " + somaDiagonalPrincipal);
        int somaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("soma de todos os elementos: " + somaTotal);
        int maiorValor = matriz[0][0]; 

        int menorValor = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
        }
            }
        }
        System.out.println("maior valor da matriz " + maiorValor);
        System.out.println("menor valor na matriz: " + menorValor);
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 == 0) { 
                    quantidadePares++;
        } else {
                    quantidadeImpares++;
    }
         }
        }
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
