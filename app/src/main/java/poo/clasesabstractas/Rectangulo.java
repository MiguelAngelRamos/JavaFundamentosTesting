package poo.clasesabstractas;

public class Rectangulo extends FiguraGeometrica{
  
  protected Rectangulo(String tipoFigura) {
    super(tipoFigura);
  }

  @Override
  public void dibujar() {
    System.out.println("Se imprime un: " + this.getClass().getSimpleName());
  }
}
