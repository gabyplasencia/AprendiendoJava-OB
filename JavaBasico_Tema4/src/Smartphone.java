public class Smartphone extends SmartDevice{
    
    protected int tasaRefresco;
    protected String tipoCarga;
    protected String sistemaOperativo;
    protected boolean cargaInhalambrica;

    public Smartphone(){

    }

    public Smartphone(String marca, String pantalla, int bateria, int vatiosCarga, boolean nfc, int tasaRefresco,
            String tipoCarga, String sistemaOperativo, boolean cargaInhalambrica) {
        super(marca, pantalla, bateria, vatiosCarga, nfc);
        this.tasaRefresco = tasaRefresco;
        this.tipoCarga = tipoCarga;
        this.sistemaOperativo = sistemaOperativo;
        this.cargaInhalambrica = cargaInhalambrica;
    }

    public int getTasaRefresco() {
        return tasaRefresco;
    }

    public void setTasaRefresco(int tasaRefresco) {
        this.tasaRefresco = tasaRefresco;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isCargaInhalambrica() {
        return cargaInhalambrica;
    }

    public void tieneCargaInhalambrica(){
       if (isCargaInhalambrica()){
        System.out.println("Tiene carga inhalambrica");
       }else {
        System.out.println("No tiene carga inhalambrica");
       }
    }

    public void setCargaInhalambrica(boolean cargaInhalambrica) {
        this.cargaInhalambrica = cargaInhalambrica;
    }
    
    
}
