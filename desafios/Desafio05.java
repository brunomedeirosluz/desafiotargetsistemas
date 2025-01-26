package desafios;

public class Desafio05 {

  private Desafio05() {}

  public static String inverterString(String texto) {

    char[] caracteres = texto.toCharArray();
    String invertida = "";

    for (int i = caracteres.length - 1; i >= 0; i--) {
      invertida += caracteres[i];
    }
    return invertida;
  }
}
