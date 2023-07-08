import java.util.Vector;

/*
 *4-Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
Elimina el 2o y 3er elemento y muestra el resultado final.
 */
public class Ejercicio4_5 {
    public static void main(String[] args){

        Vector<String> vector = new Vector<>();
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        vector.add("Elemento 4");
        vector.add("Elemento 5");

        for(int i = 0; i < vector.size(); i ++){
           System.out.println("posicion "+ i + "valor " + vector.get(i));
        }
       
        //No se elimina el el "Elemento 3" porque al eleminar el elemento en index 1, los demas de acomodan y toman nuevas posiciones,
        //siendo ahora el "Elemento 4" el que se encuentra en el index 2.
        vector.remove(1);
        vector.remove(2);

        for(int i = 0; i < vector.size(); i ++){
            System.out.println("posicion "+ i + "valor " + vector.get(i));
         }
        

        /*
         5-Indica cuál es el problema de utilizar un Vector con la capacidad 
         por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

         R:Se duplicaria la cantidad de manera innecesaria y haria mas pesado y lento el programa.
         Para prevenir este problema indicamos en parametros la initialCapacity lo mas cercano a lo que creemos necesitar y
         tambien elegimos el capacityIncrement por ejemplo en 15, de manera que si se desborda
          no crea un segundo array con el doble de elementos.
         */

    }
}
