package Ejercicio10;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Horoscopo {

    ArrayList<SignoZodiacal> horoscopo = new ArrayList<>();

    public Horoscopo() {
        añadirSigno();
    }

    public void añadirSigno() {
        horoscopo.add(new SignoZodiacal("Aries"));
        horoscopo.add(new SignoZodiacal("Tauro"));
        horoscopo.add(new SignoZodiacal("Geminis"));
        horoscopo.add(new SignoZodiacal("Cancer"));
        horoscopo.add(new SignoZodiacal("Leo"));
        horoscopo.add(new SignoZodiacal("Virgo"));
        horoscopo.add(new SignoZodiacal("Libra"));
        horoscopo.add(new SignoZodiacal("Escorpio"));
        horoscopo.add(new SignoZodiacal("Sagitario"));
        horoscopo.add(new SignoZodiacal("Capricornio"));
        horoscopo.add(new SignoZodiacal("Acuario"));
        horoscopo.add(new SignoZodiacal("Piscis"));
    }

    public boolean existeSigno (String signo){
        boolean existe = false;

        for(SignoZodiacal signoZ : horoscopo){
            if(signoZ.getNombre().equalsIgnoreCase(signo)){
             existe = true;
            }
        }if(!existe){
            System.out.println("Has escrito mal el signo...");
            
        } 
        return existe;
    }

    public void escribirPrediccion (String prediccion, String signo){
        try {
            PrintStream escribirFichero = new PrintStream(
                    "C:/Users/Manuel/Desktop/OpenBootCamp/Horoscopo/" + signo + ".txt");
            escribirFichero.println(prediccion);
            escribirFichero.close();
        } catch (Exception e) {
            System.out.println("Ups hubo un error..." + e.getMessage());
        }
    }

    public void leerPrediccion (String signo){
        try {
            InputStream leerFichero = new FileInputStream(
                    "C:/Users/Manuel/Desktop/OpenBootCamp/Horoscopo/" + signo + ".txt");
            byte[] datos = leerFichero.readAllBytes();

            for (byte dato : datos) {
                System.out.print((char) dato);
            }
            leerFichero.close();
        } catch (Exception e) {
            System.out.println("Ups hubo un error..." + e.getMessage());
        }
    }

}
