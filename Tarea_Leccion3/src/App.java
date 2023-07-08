/*
 Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

 Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
 */
 

public class App {
    public static void main(String[] args) {

      System.out.println(x(10, 20 , 30));
      
      Coche miCoche = new Coche();

      miCoche.masPuertas();

      System.out.println(miCoche.puertas);

    }

   

    public static int x (int a, int b, int c){
        return a + b + c;
    }

}

 class Coche {
    
    int puertas = 2;

    public void masPuertas(){
         this.puertas ++;
    }
}


