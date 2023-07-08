import java.util.Scanner;

/*
 Dada la función:

 public static String reverse(String texto) { }

1-Escribe el código que devuelva una cadena al revés. Por ejemplo, 
la cadena "hola mundo", debe retornar "odnum aloh".
 */
public class Ejercicio1 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingresa una frase: ");
      reverse(sc.nextLine());

      sc.close();
      
    }
    public static String reverse(String texto) { 
         
         for(int i = texto.length() - 1; i >= 0 ; i--){
            System.out.println(texto.charAt(i));
        }
        return "";
    }
}
