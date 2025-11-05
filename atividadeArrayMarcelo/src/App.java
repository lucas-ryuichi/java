



import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int codigo;
        double preco;
    ArrayList <Integer> codigoProduto = new ArrayList<>();
    ArrayList <String> nomeProduto = new ArrayList<>();
    ArrayList <Double> precoProduto = new ArrayList<>();

    System.out.println("Digite quantos produtos deseja registrar: ");
    int n = scanner.nextInt();
    //O(1);

    for(int i=0;i<n;i++){
        System.out.println("Digite o nome do " + (i+1) + " produto:");
        nome = scanner.next();
         nomeProduto.add(nome);
        System.out.println("Digite o codigo do " + (i+1) + " produto:");
        codigo = scanner.nextInt();
        boolean codigoRepetido = existeCodigo(codigoProduto, codigo);
        if(codigoRepetido){
            System.err.println("ERRO, CODIGO JA EXISTE!");
        } while (codigoRepetido);
        codigoProduto.add(codigo);
        System.out.println("Digite o preco do " + (i+1)+ " produto:");
        preco= scanner.nextDouble();
        precoProduto.add(preco); 
}
 System.out.println("Digite O codigo de um produto especifico: " );
 int codigoDigitado = scanner.nextInt();
 System.out.println("Digite um valor em X(%) (digite um numero inteiro) ");  
 double val = scanner.nextDouble();

 int indiceProduto = encontrarIndicePeloCodigo(codigoProduto, codigoDigitado);
 if(indiceProduto == -1) throw new InputMismatchException("ERRO CODIGO INVALIDO!");
 double novoPrecoProduto = newPreco(nomeProduto, precoProduto, indiceProduto, val);
 System.out.println("Novo preco do produto: " + nomeProduto.get(indiceProduto) + " = " + novoPrecoProduto);
 precoProduto.set(indiceProduto, novoPrecoProduto);
 System.out.println("--ATUALIZACAO FINAL DOS PRODUTOS--\n");
 System.out.println("Nome dos Produtos: ");
    nomeProduto.forEach(System.out::println);
    System.out.println("------------------");
    System.out.println(" Codigo dos produtos: ");
    codigoProduto.forEach(System.out::println);
    System.out.println("------------------");
    System.out.println("Preco dos produtos: ");
    precoProduto.forEach(System.out::println); 
    }
    public static int encontrarIndicePeloCodigo(ArrayList<Integer> listaCodigo, int codigo){

   for(int i = 0; i<listaCodigo.size(); i++){
if(listaCodigo.get(i).equals(codigo)){
return i;
}
   }
        return -1;
    }

    public static boolean existeCodigo(ArrayList<Integer> listaCodigo, int codigo){    
return encontrarIndicePeloCodigo(listaCodigo, codigo) != -1;
    }

    public static double newPreco(ArrayList<String> nomeProduto, ArrayList<Double> preco, int indiceProduto, double val){
        double novoPreco = 0;
        novoPreco += preco.get(indiceProduto)*(val/100) + preco.get(indiceProduto);
        return novoPreco;
    }
}
