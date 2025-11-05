
import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int codigo;
        double preco;
    ArrayList <Integer> codigoProduto = new ArrayList<>();
    ArrayList <String> nomeProduto = new ArrayList<>();
    ArrayList <Double> quantidadeProduto = new ArrayList<>();

    System.out.println("Digite quantos produtos deseja registrar: ");
    int n = scanner.nextInt();
    //O(1);

    for(int i=0;i<n;i++){
        System.out.println("Digite o nome do " + (i+1) + " produto:");
        nome = scanner.next();
         nomeProduto.add(nome);
        System.out.println("Digite o codigo do " + (i+1) + " produto:");
        codigo = scanner.nextInt();
        System.out.println("Digite a quantidade do " + (i+1)+ " produto:");
        preco = scanner.nextDouble();
        quantidadeProduto.add(preco); 
        if(codigoProduto.contains(codigo)) throw new IllegalArgumentException("ERRO CODIGO IGUAL!"); 
        codigoProduto.add(codigo); 
        
}
    System.out.println("Nome dos Produtos: ");
    nomeProduto.forEach(System.out::println);
    System.out.println("------------------");
    System.out.println(" Codigo dos produtos: ");
    codigoProduto.forEach(System.out::println);
    System.out.println("------------------");
    System.out.println("Quantidade dos produtos: ");
    quantidadeProduto.forEach(System.out::println);

    System.out.println("Digite o codigo de um produto qualquer: ");
    int codigoDigitado = scanner.nextInt();
    System.out.println("Digite o valor de aumento no preco: ");
    


    }
}
