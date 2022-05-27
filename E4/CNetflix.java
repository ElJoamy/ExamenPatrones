package E4;

public class CNetflix extends BuildContrato {
    @Override
    public void buildCosto() {
        contrato.setCosto("Bs 150");
    }

    @Override
    public void buildEmpresa() {
        contrato.setEmpresa("Netflix");
    }

    @Override
    public void buildLDCanales() {
        contrato.setlDCanales("La casa De Papel, Luifer, Avatar");
    }
}
