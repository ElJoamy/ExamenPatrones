package E2.Prototype;

public class Client{
    public static void main(String[] args){
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setTamanho("Mediano");
        celular.setPeso(60);
        celular.setFoco(5);
        celular.setLente("5mp");
        celular.setImei(10001);
        celular.setOrigen("Bolivia");
        
        Celular c1 = (Celular)celular.clone();
        System.out.println("Celular 1");
        c1.setImei(10002);
        c1.showInfo();
        System.out.println();

        Celular c2 = (Celular)celular.clone();
        System.out.println("Celular 2");
        c2.setImei(10003);
        c2.showInfo();
        System.out.println();

        Celular c3 = (Celular)celular.clone();
        System.out.println("Celular 3");
        c3.setImei(10002);
        c3.showInfo();
        System.out.println();

        Celular c4 = (Celular)celular.clone();
        System.out.println("Celular 4");
        c4.setImei(10003);
        c4.showInfo();
        System.out.println();

        Celular c5 = (Celular)celular.clone();
        System.out.println("Celular 5");
        c5.setImei(10002);
        c5.showInfo();
        System.out.println();
    }
}