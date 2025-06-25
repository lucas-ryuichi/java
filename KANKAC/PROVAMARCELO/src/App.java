import java.lang.reflect.AnnotatedType;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[5][3];
        String[] produtos = new String[5];
        for (int i = 0; i<5; i++){
            System.out.println("Digite o nome do " + (i+1) + " produto");
            produtos[i] = scanner.nextLine();
        }
        System.out.println("A seguir");
        System.out.println("Primeira coluna para código do produto");
        for (int i = 0; i<5; i++){
            for(int j = 0; j<1; j++){
                System.out.println("Digite o codigo do " + (i+1) + "º" + " produto");
                 matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Segunda coluna - quantidade de produto");
        for (int i = 0; i<5; i++){
           for(int j = 1; j<2;j++){
            System.out.println("Digite a quantidade disponivel do " + (i+1) + "º" + " produto");
            matriz[i][j] = scanner.nextDouble();
           }
        }
        System.out.println("Terceira coluna - Preço unitario ");
        for(int i=0; i<5; i++){
            for(int j=2; j<3;j++){
                System.out.println("Digite o preço unitário do "  + (i+1) + "º" + " produto");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        int op;
        exibirEstoque(matriz);
        do{
            System.out.println("Você deseja: ");
            System.out.println(" 1- Adicionar/ remover produto");
            System.out.println("2 - Ver valor total dos produtos");
            System.out.println("3 - Sair");
            op = scanner.nextInt();

         switch(op){
            case 1: adicionarRemover(matriz);
            break;
            case 2: verValorTot(matriz);
            break;
            default:
            System.out.println("Saindo");
         }
        } while (op !=3);
        System.out.println("Matriz com valores atualizados: ");
        
int linhas = 5;
int colunas = 3;
 double maiorNumero = Integer.MIN_VALUE; 
   double menorNumero = Integer.MAX_VALUE;
     for (int i = 0; i < linhas; i++) { 
            for (int j = 0; j < colunas; j++) {
                double elementoAtual = matriz[i][j]; 
                if (elementoAtual > maiorNumero) {
                    maiorNumero = elementoAtual;
                }
               
                if (elementoAtual < menorNumero) {
                    menorNumero = elementoAtual;
                }
            }
        }
         System.out.println("\n--- CODIGO/QUANTIDADE/PRECO ---");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
    public static void exibirEstoque(double[][] matriz){
        int linhas = 5;
        int colunas = 3;
   double maiorNumero = Integer.MIN_VALUE; 
   double menorNumero = Integer.MAX_VALUE;
     for (int i = 0; i < linhas; i++) { 
            for (int j = 0; j < colunas; j++) {
                double elementoAtual = matriz[i][j]; 
                if (elementoAtual > maiorNumero) {
                    maiorNumero = elementoAtual;
                }
               
                if (elementoAtual < menorNumero) {
                    menorNumero = elementoAtual;
                }
            }
        }

        System.out.println("\n--- CODIGO/QUANTIDADE/PRECO ---");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
    public static void adicionarRemover(double[][] matriz){
        Scanner scanner = new Scanner(System.in);
   System.out.println("Digite o codigo do produto");
   double codigoDigitado = scanner.nextDouble();
   if (codigoDigitado == matriz[0][0]){
    System.out.println("Você deseja 1 - Adicionar, 2 - Remover um produto ?");
    int op3 = scanner.nextInt();
    if (op3 == 1){
System.out.println("Digite a quantidade de produto a ser adicionada");
   double quantidadeAd = scanner.nextDouble();
   double newQuantidade = matriz[0][1] + quantidadeAd;
   System.out.println("A nova quantidade é " + newQuantidade);
   matriz[0][1] = newQuantidade;
    }
    else if(op3 == 2){
        System.out.println("Digite a quantidade de produto a ser removida");
double quantidadeRe = scanner.nextDouble();
double newQuantidadeRe = matriz[0][1] - quantidadeRe;
System.out.println("A nova quantidade é " + newQuantidadeRe);
matriz[0][1] = newQuantidadeRe;
    }
   } 
    if (codigoDigitado == matriz[1][0]){
    System.out.println("Você deseja 1 - Adicionar, 2 - Remover um produto ?");
    int op3 = scanner.nextInt();
    if (op3 == 1){
System.out.println("Digite a quantidade de produto a ser adicionada");
   double quantidadeAd = scanner.nextDouble();
   double newQuantidade = matriz[1][1] + quantidadeAd;
   System.out.println("A nova quantidade é " + newQuantidade);
   matriz[1][1] = newQuantidade;
   }
   else if(op3 == 2){
     System.out.println("Digite a quantidade de produto a ser removida");
double quantidadeRe = scanner.nextDouble();
double newQuantidadeRe = matriz[1][1] - quantidadeRe;
System.out.println("A nova quantidade é " + newQuantidadeRe);
matriz[1][1] = newQuantidadeRe;
    }
    }
     if (codigoDigitado == matriz[2][0]){
    System.out.println("Você deseja 1 - Adicionar, 2 - Remover um produto ?");
    int op3 = scanner.nextInt();
    if (op3 == 1){
System.out.println("Digite a quantidade de produto a ser adicionada");
   double quantidadeAd = scanner.nextDouble();
   double newQuantidade = matriz[2][1] + quantidadeAd;
   System.out.println("A nova quantidade é " + newQuantidade);
   matriz[2][1] = newQuantidade;
}
else if(op3 == 2){
     System.out.println("Digite a quantidade de produto a ser removida");
double quantidadeRe = scanner.nextDouble();
double newQuantidadeRe = matriz[2][1] - quantidadeRe;
System.out.println("A nova quantidade é " + newQuantidadeRe);
matriz[2][1] = newQuantidadeRe;
    }
}
 if (codigoDigitado == matriz[3][0]){
    System.out.println("Você deseja 1 - Adicionar, 2 - Remover um produto ?");
    int op3 = scanner.nextInt();
    if (op3 == 1){
System.out.println("Digite a quantidade de produto a ser adicionada");
   double quantidadeAd = scanner.nextDouble();
   double newQuantidade = matriz[3][1] + quantidadeAd;
   System.out.println("A nova quantidade é " + newQuantidade);
   matriz[3][1] = newQuantidade;
    }
    else if(op3 == 2){
         System.out.println("Digite a quantidade de produto a ser removida");
double quantidadeRe = scanner.nextDouble();
double newQuantidadeRe = matriz[3][1] - quantidadeRe;
System.out.println("A nova quantidade é " + newQuantidadeRe);
matriz[3][1] = newQuantidadeRe;
    }
}
 if (codigoDigitado == matriz[4][0]){
    System.out.println("Você deseja 1 - Adicionar, 2 - Remover um produto ?");
    int op3 = scanner.nextInt();
    if (op3 == 1){
System.out.println("Digite a quantidade de produto a ser adicionada");
   double quantidadeAd = scanner.nextDouble();
   double newQuantidade = matriz[4][1] + quantidadeAd;
   System.out.println("A nova quantidade é " + newQuantidade);
   matriz[4][1] = newQuantidade;
    } else if(op3 == 2){
         System.out.println("Digite a quantidade de produto a ser removida");
double quantidadeRe = scanner.nextDouble();
double newQuantidadeRe = matriz[4][1] - quantidadeRe;
System.out.println("A nova quantidade é " + newQuantidadeRe);
matriz[4][1] = newQuantidadeRe;
    }
}
    }

    public static void verValorTot(double[][] matriz){
        double somaTotal = 0;
for (int i = 0; i<5; i++){
     somaTotal +=matriz[i][1]*matriz[i][2];
}
 System.out.println("A soma total de todos os produtos multiplicados por suas respectivas quantidades é " + somaTotal);
    }
}


