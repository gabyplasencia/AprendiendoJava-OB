public class SmartDevice {

    protected String marca;
    protected String pantalla;
    protected int bateria;
    protected int vatiosCarga;
    protected boolean nfc;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String pantalla, int bateria, int vatiosCarga, boolean nfc) {
        this.marca = marca;
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.vatiosCarga = vatiosCarga;
        this.nfc = nfc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getVatiosCarga() {
        return vatiosCarga;
    }

    public void setVatiosCarga(int vatiosCarga) {
        this.vatiosCarga = vatiosCarga;
    }

    public boolean isNfc() {
        return nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public void tieneNfc(){
        if (isNfc()){
         System.out.println("Tiene NFC");
        }else {
         System.out.println("No tiene NFC");
        }
     }
}
    
    