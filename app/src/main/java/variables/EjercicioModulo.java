package variables;

import java.util.Scanner;

public class EjercicioModulo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int numero = sc.nextInt();

    // * Si el numero es par o impar
    //* 14/2 = 7 y su resto es 0
    //* 10/2 = 5 y su resto es 0
    System.out.println(numero % 2 == 0);
    if(numero % 2 == 0) {
      System.out.println("El numero es PAR");
    } else {
      System.out.println("El numero es IMPAR");
    }
    sc.close();

  }
}
