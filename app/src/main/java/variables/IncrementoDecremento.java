package variables;

public class IncrementoDecremento {
  public static void main(String[] args) {
    int contador = 0;
    //* Incremento
    contador = contador + 1; //* contador++;
    //* 0 = 0 + 1 */
    System.out.println(contador);
    contador++;
    System.out.println(contador);

    //* Decremento */
    int contadorDecremento = 20;
    // contadorDecremento = contadorDecremento - 1;
    contadorDecremento--;
    System.out.println(contadorDecremento);

    int contadorOtroNumero = 40;
    // contadorOtroNumero = contadorOtroNumero - 5;
    contadorOtroNumero -=5;
    System.out.println(contadorOtroNumero);
  }
}
