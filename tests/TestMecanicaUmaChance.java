import org.junit.Test;
import java.util.regex.*;

import static junit.framework.Assert.*;

public class TestMecanicaUmaChance {

    @Test
    public void testInicioDeJogo(){
        MecanicaDoJogo m = new MecanicaUmaChance();
        String mensagem = m.getMensagemInicial();
        assertEquals("Este é o jogo das Palavras Embaralhadas\nVocê tem uma chance para acertar a palavra!",
                mensagem);
        mensagem = m.getMensagemJogo();
        boolean teste = Pattern.matches("Desembaralhe a palavra \\S*", mensagem);
        assertTrue(Pattern.matches("Desembaralhe a palavra \\S*", mensagem));
    }

}
