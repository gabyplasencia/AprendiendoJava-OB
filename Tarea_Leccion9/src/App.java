/*
 Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase
tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, 
el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
y con una variable salario que solo tenga la clase Trabajador.
 */

public class App {
    public static void main(String[] args){
        
        Cliente cliente = new Cliente();

        cliente.setNombre("José");
        cliente.setEdad(25);
        cliente.setTelefono(689745896);
        cliente.setCredito(25000);

        System.out.println("Estos son los datos del objeto cliente");
        System.out.println("Nombre: " + cliente.getNombre() + "\n" + "Edad: " + cliente.getEdad() +
                            "\n" + "Telefono: " + cliente.getTelefono() + "\n" +
                            "Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador ();

        trabajador.setNombre("María");
        trabajador.setEdad(47);
        trabajador.setTelefono(822569874);
        trabajador.setSalario(45000);

        System.out.println("Estos son los datos del objeto trabajador");
        System.out.println("Nombre: " + trabajador.getNombre() + "\n" + "Edad: " + trabajador.getEdad() +
                            "\n" + "Telefono: " + trabajador.getTelefono() + "\n" +
                            "Salario: " + trabajador.getSalario());
      
    }
}
class Persona {
   int edad;
   String nombre;
   int telefono;

public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getTelefono() {
    return telefono;
}
public void setTelefono(int telefono) {
    this.telefono = telefono;
}

}

class Cliente extends Persona {
   int credito;

public int getCredito() {
    return credito;
}

public void setCredito(int credito) {
    this.credito = credito;
}

}

class Trabajador extends Persona {
     int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
