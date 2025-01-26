// 1) Soma do Trecho de Código
public class Main {
  public static void main(String[] args) {
    // Desafio 1
    int INDICE = 13, SOMA = 0, K = 0;
    while (K < INDICE) {
      K = K + 1;
      SOMA = SOMA + K;
    }
    System.out.println("1) Valor de SOMA: " + SOMA);

    // Desafio 2
    int numero = 21; // Substituir por entrada desejada
    if (pertenceFibonacci(numero)) {
      System.out.println("2) O número " + numero + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println("2) O número " + numero + " não pertence à sequência de Fibonacci.");
    }

    // Desafio 3
    double[] faturamentoMensal = {0, 1500, 3000, 0, 0, 2000, 4000, 3500, 0, 0, 0, 5000}; // Exemplo
    calcularFaturamento(faturamentoMensal);

    // Desafio 4
    calcularPercentualEstados();

    // Desafio 5
    String texto = "Exemplo"; // Substituir por entrada desejada
    System.out.println("5) String invertida: " + inverterString(texto));
  }

  // Função para o desafio 2
  public static boolean pertenceFibonacci(int num) {
    int a = 0, b = 1;
    while (a <= num) {
      if (a == num) return true;
      int temp = a;
      a = b;
      b = temp + b;
    }
    return false;
  }

  // Função para o desafio 3
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

  // Função para o desafio 4
  public static void calcularPercentualEstados() {
    double sp = 67836.43;
    double rj = 36678.66;
    double mg = 29229.88;
    double es = 27165.48;
    double outros = 19849.53;

    double total = sp + rj + mg + es + outros;

    System.out.printf("4) Percentual de SP: %.2f%%\n", (sp / total) * 100);
    System.out.printf("4) Percentual de RJ: %.2f%%\n", (rj / total) * 100);
    System.out.printf("4) Percentual de MG: %.2f%%\n", (mg / total) * 100);
    System.out.printf("4) Percentual de ES: %.2f%%\n", (es / total) * 100);
    System.out.printf("4) Percentual de Outros: %.2f%%\n", (outros / total) * 100);
  }

  // Função para o desafio 5
  public static String inverterString(String texto) {
    char[] caracteres = texto.toCharArray();
    String invertida = "";
    for (int i = caracteres.length - 1; i >= 0; i--) {
      invertida += caracteres[i];
    }
    return invertida;
  }
}

