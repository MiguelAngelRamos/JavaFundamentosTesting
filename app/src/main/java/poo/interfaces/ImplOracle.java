package poo.interfaces;

public class ImplOracle implements IAccesoDatos{

  @Override
  public void insertar() {
    System.out.println("Insertar Datos desde Oracle");
  }
  @Override
  public void listar() {
    System.out.println("Listar Datos desde Oracle");
    
  }
  @Override
  public void actualizar() {
    System.out.println("Actualiar Datos desde Oracle");
    
  }
  @Override
  public void eliminar() {
    System.out.println("Eliminando Datos desde Oracle");
  }
  
}
