import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

/*
 9-Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: 
"fileIn" y "fileOut". 
La tarea de la función será realizar la copia del fichero dado en el parámetro 
"fileIn" al fichero dado en "fileOut".
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        try {

            InputStream fileIn = new FileInputStream("C:/Users/Manuel/Desktop/OpenBootCamp/ficheroEjercicio9JB.txt");
            PrintStream fileOut = new PrintStream("C:/Users/Manuel/Desktop/OpenBootCamp/copiaFichero.txt");
            copiaFichero(fileIn, fileOut);
        } catch (FileNotFoundException e) {
            System.out.println("UPS" + e.getMessage());
        }

    }

    public static void copiaFichero(InputStream fileIn, PrintStream fileOut) {
        try {

            byte[] datos = fileIn.readAllBytes();

            fileOut.write(datos);

        } catch (Exception e) {
            System.out.println("UPS hubo un error..." + e.getMessage());
        }
    }
}
