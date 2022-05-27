package E4;

public class client {
    public static void main(String[] args) {
        User user = new User();
        CAmazon amazon = new CAmazon();
        CHBO hbo = new CHBO();
        CNetflix netflix = new CNetflix();


        user.setBuilder(amazon);
        user.createServicio();
        Contrato c1 = user.getServicioBuilder();
        c1.showInfo();
        System.out.println();

        user.setBuilder(hbo);
        user.createServicio();
        Contrato c2 = user.getServicioBuilder();
        c2.showInfo();
        System.out.println();

        user.setBuilder(netflix);
        user.createServicio();
        Contrato c3 = user.getServicioBuilder();
        c3.showInfo();
        System.out.println();
    }
}
