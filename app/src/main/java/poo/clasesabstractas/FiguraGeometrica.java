package poo.clasesabstractas;

public abstract class FiguraGeometrica {

  private String tipoFigura;
  protected FiguraGeometrica(String tipoFigura) {
    this.tipoFigura = tipoFigura;
  }

  public String getTipoFigura() {
    return tipoFigura;
  }

  public abstract void dibujar();

  public void setTipoFigura(String tipoFigura) {
    this.tipoFigura = tipoFigura;
  }

  @Override
  public String toString() {
    return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
  }
}

