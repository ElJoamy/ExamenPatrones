public class Client{
    public static void main(String[] args){
        Celular celular = new Celular();
        celular.setModelo("iPhone");
        celular.setTamanho("Grande");
        celular.setPeso(100);
        celular.setFoco(100);
        celular.setLente(100);
        celular.setImei(100);
        celular.setOrigen("China");
        System.out.println(celular);
        System.out.println("Clonando...");
        Celular celular2 = (Celular)celular.clone();
        System.out.println(celular2);
    }
}