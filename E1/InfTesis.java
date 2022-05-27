package E1;

import java.util.concurrent.ConcurrentHashMap;

public class InfTesis {
    private static InfTesis instance;
    private Map<Tesis, Date> registra = new ConcurrentHashMap<>();


    private InfTesis() {
        System.out.println("Inicializando los datos...");
    }
    
    public static InfTesis getInstance() {
        if (instance == null) {
            instance = new InfTesis();
        }
        return instance;
    }

    private synchronized static void multiThreadControl() {

        if(instance == null) {

            instance = new InfTesis();

        }

    }

    
}
