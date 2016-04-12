
import java.util.Scanner;

public class Principal {

    public static void main (String[] args) {
        MecanicaDoJogo m = FabricaMecanicaDoJogo.getMecanica();
        System.out.println(m.getMensagemInicial());
        Scanner in = new Scanner(System.in);

        while (m.jogoEmAndamento()) {
            System.out.println(m.getMensagemJogo());
            m.verificaPalavra(in.nextLine());
        }

        System.out.println(m.getMensagemFinal());

    }

}
