package E4;

public class CAmazon extends BuildContrato{
    @Override
    public void buildCosto() {
        contrato.setCosto("Bs 50");
    }

    @Override
    public void buildEmpresa() {
        contrato.setEmpresa("Amazon");
    }

    @Override
    public void buildLDCanales() {
        contrato.setlDCanales("Guerra de las Galaxias, El Hobbit,");
    }

}
