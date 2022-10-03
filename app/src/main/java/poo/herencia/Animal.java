package poo.herencia;

public class Animal {
  public String nombre;

  public Animal(String nombre ) {
    this.nombre = nombre;
  }
  public void respirar() {
    System.out.println("Soy un Animal y estoy respirando....");
  }

  public void caminar() {
    System.out.println("Soy un Animal y estoy caminando...");
  }

  public void comer() {
    System.out.println("Soy un Animal y estoy comiendo...");
  }

  public void volar() {
    System.out.println("Soy un Animal y estoy volando...");
  }
  //* control + b 
}
