package E4;

public abstract class BuildContrato {
    protected Contrato contrato;


    public Contrato getServicio(){
        return contrato;
    }

    public void createServicio(){
        contrato = new Contrato();
    }

    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildLDCanales();
}
