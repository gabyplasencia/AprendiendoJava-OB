package ejercicio;

/*
 Para este primer ejercicio tendréis que realizar lo siguiente:

Crea un proyecto de Java desde 0

Dentro del proyecto tenéis que crear un paquete. 
En el paquete tendréis que crear una clase.

Dentro de la clase tenéis que crear el método main e 
imprimir todos los datos que se han visto en las sesiones.

 */
public class Ejercicios{

    public static void main(String[] args){
        
        Variables variables = new Variables();

        System.out.println(variables.toString());

    }
    
}
class Variables {
    
    byte variableByte = 1;
    short variableShort = 50;
    int variableInt = 500;
    long variableLong = 45621525;
    float variableFloat = 10.3f;
    double variableDouble = 25.1d;
    boolean variableBoolean = false;
    char variableChar = 'm';
    String variableString = "Hola";

    public Variables (){

    }

    @Override
    public String toString() {
        return "Variables [variableByte=" + variableByte + ", variableShort=" + variableShort + ", variableInt="
                + variableInt + ", variableLong=" + variableLong + ", variableFloat=" + variableFloat
                + ", variableDouble=" + variableDouble + ", variableBoolean=" + variableBoolean + ", variableChar="
                + variableChar + ", variableString=" + variableString + "]";
    }

    

}