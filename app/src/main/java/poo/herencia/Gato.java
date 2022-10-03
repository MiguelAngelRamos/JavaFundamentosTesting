package poo.herencia;

//* con "extends" heredamos clase Animal
public class Gato extends Animal {
  
  public Gato() {
    super("Benito");
  }
  @Override
  public void caminar() {
    System.out.println("Soy un gato y estoy caminando");
  }
  
}
