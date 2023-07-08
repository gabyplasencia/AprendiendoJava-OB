package Ejercicio10;

/*
 10-Sorpréndenos creando un programa de tu elección que utilice 
InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {

    HashMap<String, Integer> permisoFichero = new HashMap<>();
    Horoscopo h = new Horoscopo();
    Scanner sc = new Scanner(System.in);

    permisoFichero.put("Medium", 1);
    permisoFichero.put("Usuario", 2);

    boolean salir = false;
    int opcion = 0;
    String signo = "";
    String prediccion = "";
    int permiso = 0;

    do {
      System.out.println("---MENU---\n1-Escribir Predicción\n2-Leer Prediccion\n3-Salir\n-------------------------------");
      opcion = sc.nextInt();
      sc.nextLine();
      switch (opcion) {
        case 1:
          System.out.println("Eres medium(1) o Cliente(2)?");
          permiso = sc.nextInt();
          sc.nextLine();
          if (permisoFichero.get("Medium") == permiso) {
            do {
              System.out.println("Escribe el signo zodiacal:");
              signo = sc.nextLine();
            } while (!h.existeSigno(signo));
            System.out.println("Escribe la prediccion: ");
            prediccion = sc.nextLine();
            h.escribirPrediccion(prediccion, signo);
          }else{
            System.out.println("No tienes permiso para escribir predicciones.");
          }
          break;

        case 2:
            do {
              System.out.println("Escribe el signo zodiacal: ");
              signo = sc.nextLine();
            } while (!h.existeSigno(signo));
            h.leerPrediccion(signo);
          
          break;

        case 3:
        System.out.println("Hasta luego :)");
          salir = true;
          break;

          default:
          System.out.println("No es una opción...");
          break;
      }
    } while (!salir);

    sc.close();

  }
}
