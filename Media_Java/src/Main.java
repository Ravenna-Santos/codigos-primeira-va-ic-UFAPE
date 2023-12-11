import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float soma = 0; 
    float numero;

    for (int i = 0; i < 3; i++) {
      System.out.print("Digite um número: ");
      numero = scanner.nextFloat();
      soma += numero; 
    }

    float media = soma / 3; 

    System.out.printf("Média = %.1f\n", media);

    scanner.close();
  }
}