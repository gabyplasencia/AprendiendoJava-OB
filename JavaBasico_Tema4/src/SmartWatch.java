public class SmartWatch extends SmartDevice{
    
    protected boolean llamada;
    protected boolean gps;
    protected String strapSize;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String pantalla, int bateria, int vatiosCarga, boolean nfc, boolean llamada,
            boolean gps, String strapSize) {
        super(marca, pantalla, bateria, vatiosCarga, nfc);
        this.llamada = llamada;
        this.gps = gps;
        this.strapSize = strapSize;
    }

    public boolean isLlamada() {
        return llamada;
    }

    public void tieneLlamada(){
        if (isLlamada()){
         System.out.println("Puede hacer llamadas");
        }else {
         System.out.println("No puede hacer llamadas");
        }
     }

    public void setLlamada(boolean llamada) {
        this.llamada = llamada;
    }

    public boolean isGps() {
        return gps;
    }

    public void tienegPS(){
        if (isGps()){
         System.out.println("Tiene GPS");
        }else {
         System.out.println("No tiene GPS");
        }
     }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public String getStrapSize() {
        return strapSize;
    }

    public void setStrapSize(String strapSize) {
        this.strapSize = strapSize;
    }

    
}
