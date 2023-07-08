import java.util.ArrayList;
import java.util.LinkedList;

/*
 6-Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. 
Recorre ambos mostrando únicamente el valor de cada elemento.
 */
public class Ejercicio6_7 {
    public static void main(String[] args){
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Elemento 1");
        listString.add("Elemento 2");
        listString.add("Elemento 3");
        listString.add("Elemento 4");

         System.out.println("ARRAYLIST \n--------------------------");
        for(String elemento : listString){
            System.out.println(elemento);
        }

        System.out.println("\nLINKEDLIST \n--------------------------");
        LinkedList<String> listEnlazada = new LinkedList<>(listString);
        for(String elemento : listEnlazada){
            System.out.println(elemento);
        }

        /*
7-Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, 
 vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, 
 siempre y cuando cumplas el primer "for" de relleno.
         */
         System.out.println("\nARRAYLIST NUMEROS \n--------------------------");
         ArrayList<Integer> listNumeros = new ArrayList<>();

         int elemento = 1;
         for(int i = 0; i < 10; i++){
                
            if(elemento % 2 != 0){
                listNumeros.add(elemento);
            }
                elemento++;    
         }
      
         System.out.println(listNumeros);
    }
}
