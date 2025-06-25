import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        for(int i = 0; i<4; i++){
            System.out.println("Digite a " + (i+1) + " nota");
            notas[i] = scanner.nextDouble();
        }
       double mediaAritmetica = calculaMedia(notas);
       System.out.println("Suas notas foram: ");
       for(int i = 0; i<4; i++){
        System.out.println(notas[i] + " ");
       }
       System.out.println("Sua média foi de: " + mediaAritmetica);
       if (mediaAritmetica>=7.0){
        System.out.println("Você foi aprovado!");
       } else if (mediaAritmetica<7.0 && mediaAritmetica>=5.0){
        System.out.println("Recuperação");
       } else {
        System.out.println("Reprovado!");
       }
       
        
    } 
    public static double calculaMedia(double[] notas){
        double soma = 0;
        for(int i = 0; i<4; i++){
            soma+=notas[i];
        }
        double media = soma/4;
        return media;
    }
}
