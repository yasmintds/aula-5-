import java.util.Scanner;
import java.util.Random;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    int tentativa = 0;
    int chute;
    boolean acertou = false;
   
    while (!acertou){
      System.out.println("Digite um número: ");
      chute = scanner.nextInt();

    //Verificando se o chute é maior ou menor que o numero       secreto
      tentativa++;
      if (chute == numeroSecreto){
        acertou = true;
        System.out.println("Parabéns! Você acertou o número secreto em: " + tentativa + " tentativas.");
      } else if (chute < numeroSecreto){
        System.out.println("O número secreto é maior.");
      } else {
        System.out.println("O número secreto é menor.");
      }
    }
  }

  
}