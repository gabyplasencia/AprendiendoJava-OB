/*
 8-Crea una función DividePorCero. Esta, debe generar una excepción ("throws") 
a su llamante del tipo ArithmeticException que será capturada por su llamante
(desde "main", por ejemplo). 
Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
Finalmente, mostraremos en cualquier caso: "Demo de código".
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
        try{
            DividePorCero(9, 0);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de código");
        
    }public static int DividePorCero(int a, int b)throws ArithmeticException {
              int resultado = 0;
              try {
                resultado = a / b;
                System.out.println( a + " / "+ b + " = " + resultado);
              } catch (ArithmeticException e) {
                throw new ArithmeticException();
              }

              return resultado;
    }
}
