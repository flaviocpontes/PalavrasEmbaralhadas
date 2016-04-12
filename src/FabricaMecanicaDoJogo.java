import java.util.ArrayList;
import java.util.Random;

public class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo getMecanica(){
        ArrayList<MecanicaDoJogo> mecanicas = new ArrayList<>();
        mecanicas.add(new MecanicaUmaChance());
        mecanicas.add(new MecanicaDuasChances());
        Random r = new Random();
        return mecanicas.get(r.nextInt(mecanicas.size()));
    }

}
