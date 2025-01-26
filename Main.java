import desafios.*;

public class Main {
  public static void main(String[] args) {
    // Desafio 1
    int soma = Desafio01.calcularSoma();
    System.out.println("1) Valor de SOMA: " + soma);

    // Desafio 2
    int numero = 21;
    if (Desafio02.pertenceFibonacci(numero)) {
      System.out.println("2) O número " + numero + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println("2) O número " + numero + " não pertence à sequência de Fibonacci.");
    }

    // Desafio 3
    double[] faturamentoMensal = {0, 1500, 3000, 0, 0, 2000, 4000, 3500, 0, 0, 0, 5000};
    Desafio03.calcularFaturamento(faturamentoMensal);

    // Desafio 4
    Desafio04.calcularPercentualEstados();

    // Desafio 5
    String texto = "Target";
    System.out.println("5) String invertida: " + Desafio05.inverterString(texto));
  }
}