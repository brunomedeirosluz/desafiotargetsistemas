package desafios;

public class Desafio02 {

  private Desafio02() {}

  public static boolean pertenceFibonacci(int num) {
    int a = 0;
    int b = 1;

    while (a <= num) {
      if (a == num) return true;
      int temp = a;
      a = b;
      b = temp + b;
    }
    return false;
  }
}
