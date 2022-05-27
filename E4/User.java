package E4;

public class User {
    private BuildContrato builder;

    public Contrato getServicioBuilder() {
        return builder.getServicio();
    }

    public void setBuilder(BuildContrato builder) {
        this.builder = builder;
    }

    public void createServicio() {
        this.builder.createServicio();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildLDCanales();
    }
}
