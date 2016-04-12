import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores {

    public static Embaralhador getEmbaralhador(){
        ArrayList<Embaralhador> embaralhadores = new ArrayList<>();
        embaralhadores.add(new EmbaralhadorInverte());
        embaralhadores.add(new EmbaralhadorParImpar());
        Random r = new Random(0);
        return embaralhadores.get(r.nextInt(embaralhadores.size()));
    }

}
