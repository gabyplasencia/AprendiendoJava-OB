/*

 En este ejercicio tendréis que crear una clase SmartDevice. 
 Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis 
para imprimir sus valores por consola.

 */
public class App {
    public static void main(String[] args){

       Smartphone smartphone = new Smartphone("Samsung", "Amoled", 4500, 40, true, 
       120, "Tipo C", "Android 13", false);

       System.out.println(smartphone.getMarca() + " \n" + smartphone.getPantalla() + " \n" + smartphone.getBateria()
       + "mAh \n" + smartphone.getVatiosCarga() + "W \n" + smartphone.getTasaRefresco() + " Hz \n" + smartphone.getTipoCarga()
       + " \n" + smartphone.getSistemaOperativo() + " \n");
       smartphone.tieneCargaInhalambrica();
       smartphone.tieneNfc();
       
       System.out.println("------------------------------------------------------------");
       SmartWatch smartwacht = new SmartWatch("Xiaomi", "IPS", 480, 10, false, 
       false, true, "Medium");

       System.out.println(smartwacht.getMarca() + " \n" + smartwacht.getPantalla() + " \n" + smartwacht.getBateria()
       + "mAh \n" + smartwacht.getVatiosCarga() + "W \n");
       smartwacht.tieneLlamada();
       smartwacht.tieneNfc();
       smartwacht.tienegPS();
    }
}
