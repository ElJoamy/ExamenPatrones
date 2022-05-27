package E4;

public class CHBO extends BuildContrato {
    @Override
    public void buildCosto() {
        contrato.setCosto("Bs 100");
    }

    @Override
    public void buildEmpresa() {
        contrato.setEmpresa("HBO");
    }

    @Override
    public void buildLDCanales() {
        contrato.setlDCanales("Game of Thrones, The Walking Dead, The Big Bang Theory");
    }
}