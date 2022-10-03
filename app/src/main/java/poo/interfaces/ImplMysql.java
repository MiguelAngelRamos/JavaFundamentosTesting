package poo.interfaces;

public class ImplMysql implements IAccesoDatos {

  @Override
  public void insertar() {
    System.out.println("Insertar Datos desde Mysql");
  }
  @Override
  public void listar() {
    System.out.println("Listar Datos desde Mysql");
    
  }
  @Override
  public void actualizar() {
    System.out.println("Actualiar Datos desde Mysql");
  }
  @Override
  public void eliminar() {
    System.out.println("Eliminando Datos desde Mysql");
  }
  //* Previamente seleccionar el texto en común, control + d 
}
