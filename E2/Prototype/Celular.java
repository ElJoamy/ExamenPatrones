package E2.Prototype;

public class Celular implements IEeclular {
    private String modelo;
    private String tamanho;
    private int peso;
    private int foco;
    private int lente;
    private int imei;
    private String origen;

    public Celular(){}
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    } 

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getFoco() {
        return foco;
    }

    public void setFoco(int foco) {
        this.foco = foco;
    }

    public int getLente() {
        return lente;
    }

    public void setLente(int lente) {
        this.lente = lente;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone(){
        Celular celular = new Celular();
        celular.setModelo(this.modelo);
        celular.setTamanho(this.tamanho);
        celular.setPeso(this.peso);
        celular.setFoco(this.foco);
        celular.setLente(this.lente);
        celular.setImei(this.imei);
        celular.setOrigen(this.origen);
        return celular;
    }

    public void showInfo(){
        System.out.println("INFORMAION DE CELULAR");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Peso: " + this.peso);
        System.out.println("Foco: " + this.foco);
        System.out.println("Lente: " + this.lente);
        System.out.println("IMEI: " + this.imei);
        System.out.println("Origen: " + this.origen);
    }
}
