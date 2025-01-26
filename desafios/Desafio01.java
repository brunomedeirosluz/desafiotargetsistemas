package desafios;

public class Desafio01 {

  private Desafio01() {}

  public static int calcularSoma() {
   int indice = 13;
   int soma = 0;
   int k = 0;


    while (k < indice) {
      k = k + 1;
      soma = soma + k;
    }
    return soma;
  }
}
