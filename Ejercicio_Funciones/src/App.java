
//crear una función que reciba un precio y devuelva el precio con el IVA incluido.

public class App {
    public static void main(String[] args) {
        
        double precio = 20;
        System.out.println("El precio con Iva de " + precio + " es: " + precioIva(precio));
    
    }
    
    public static double precioIva (double precio){
        double iva = precio * 0.21;
        return precio + iva;
    }
}
