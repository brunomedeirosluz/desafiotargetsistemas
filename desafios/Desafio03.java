package desafios;

public class Desafio03 {

  private Desafio03() {}

  public static void calcularFaturamento(double[] faturamento) {
    double menor = Double.MAX_VALUE;
    double maior = Double.MIN_VALUE;
    double soma = 0;
    int diasValidos = 0;

    for (double valor : faturamento) {
      if (valor > 0) {
        if (valor < menor) menor = valor;
        if (valor > maior) maior = valor;
        soma += valor;
        diasValidos++;
      }
    }

    double media = soma / diasValidos;
    int diasAcimaDaMedia = 0;
    for (double valor : faturamento) {
      if (valor > media) diasAcimaDaMedia++;
    }

    System.out.println("3) Menor faturamento: R$" + menor);
    System.out.println("3) Maior faturamento: R$" + maior);
    System.out.println("3) Dias acima da média mensal: " + diasAcimaDaMedia);
  }
}
