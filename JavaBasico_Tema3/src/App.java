/*

 En este ejercicio tenéis que crear un bucle que permita concatenar 
 textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. 

Por ejemplo:
String[] nombres = {"", "", "", ""}

 */

public class App {
    public static void main(String[] args) {

       String[] comida = {"Arroz", "Papas", "Pollo", "Chasina", "Pan", "Cocacola", "Zumos", "Chorizo"};
       

        String listaCompra ="";

       for ( int i = 0; i < comida.length; i++){
       listaCompra = listaCompra + " " + comida[i];
        
       }

       System.out.println(listaCompra);

    }
}
