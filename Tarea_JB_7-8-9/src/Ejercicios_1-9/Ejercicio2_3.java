/*
 2-Crea un array unidimensional de Strings y recórrelo, 
mostrando únicamente sus valores.
 */
public class Ejercicio2_3 {
    public static void main(String[] args){
   
         String array[] = new String[5];

         array[0] = "Primero";
         array[1] = "Segundo";
         array[2] = "Tercero";
         array[3] = "Cuarto";
         array[4] = "Quinto";

         for(String valor : array){
            System.out.println(valor);
         }

    /*
    3-Crea un array bidimensional de enteros y recórrelo, 
    mostrando la posición y el valor de cada elemento en ambas dimensiones.
    */ 
    System.out.println("\n///////////////////////////////////\n");
    
    int arrayBidimensional[][] = {
        {100, 200, 300, 400, 500},
        {111, 222, 333, 444, 555},
        {101, 202, 303, 404, 505}
    };
    for(int i = 0; i < arrayBidimensional.length; i++){
         for(int j = 0; j < arrayBidimensional[i].length; j++){
                
            System.out.println("Posición: " + i + j + "\nValor: " + arrayBidimensional[i][j] +"\n");
         }
    }

         
 }
}
