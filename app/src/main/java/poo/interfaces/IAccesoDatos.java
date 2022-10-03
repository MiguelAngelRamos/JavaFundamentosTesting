package poo.interfaces;

public interface IAccesoDatos {
  //* public static final int MAX_REGISTRO 
  int MAX_REGISTRO = 10;
  //* Es una interface todos sus métodos son abstractos
  //* public abstract void insertar();
  void insertar();
  void listar();
  void actualizar();
  void eliminar();

  //* CREATE, READ, UPDATE, DELETE (C.R.U.D)  */
}
