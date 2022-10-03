package variables;

import java.util.Scanner;

public class IntroduccionCaracteresTeclado {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("¿Cómo te llamas?");
    String nombre = sc.nextLine();
    System.out.println("Hola " + nombre + " !Bienvenido(a)!");
    sc.close();
  }
}
