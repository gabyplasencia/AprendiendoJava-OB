
public class App {
    public static void main(String[] args) {
       
/*
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */     
        System.out.println("---------------------------\n Condicional If");

        int numeroIf = 1;

        if(numeroIf > 0){
            System.out.println("La variable numeroIf es positiva");
        } 
        else if(numeroIf < 0){
            System.out.println("La variable numeroIf es negativa");
        }
        else if(numeroIf == 0){
            System.out.println("La variable numeroIf vale 0");
        }

        System.out.println("---------------------------\n Bucle While");
 /*
 Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.
 */
        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("---------------------------\n Bucle Do While");
/* 
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
*/
      do{
        System.out.println(numeroWhile);
        numeroWhile = numeroWhile + 2;
      }while(numeroWhile < 3);
      
      System.out.println("---------------------------\n Bucle For");

/*
 Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute 
y deberá mostrarse por pantalla.
 */
     for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){
        System.out.println(numeroFor);
     }

     System.out.println("---------------------------\n Switch");
/*
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
 También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
     String estacion = "Primavera";

     switch(estacion){

        case "Primavera":
        System.out.println("Es primavera");
        break;

        case "Verano":
        System.out.println("Es verano");
        break;

        case "Otoño":
        System.out.println("Es otoño");
        break;

        case "Invierno":
        System.out.println("Es invierno");
        break;

        default:
        System.out.println("No es una estación");
     }
  }
}
