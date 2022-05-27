package E4;

public class Contrato {
    private String costo;
    private String empresa;
    private String lDCanales;

    public Contrato(){}

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getlDCanales() {
        return lDCanales;
    }

    public void setlDCanales(String lDCanales) {
        this.lDCanales = lDCanales;
    }

    public void showInfo(){
        System.out.println("Costo: " + costo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Lista de canales: " + lDCanales);
    }

    

}
