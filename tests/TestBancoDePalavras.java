import org.junit.Test;

import static junit.framework.Assert.*;

public class TestBancoDePalavras {

    @Test
    public void testPegaListaPalavras()
    {
        BancoDePalavras b = new BancoDePalavras();
        String palavra = b.getListaPalavras().get(0);
        String ultimaPalavra = b.getListaPalavras().get(b.getListaPalavras().size() - 1);
        assertEquals(30, b.getListaPalavras().size());
        assertEquals("bactéria", palavra);
        assertEquals("alto-falante", ultimaPalavra);
    }

    @Test
    public void testPegaPalavraAleatória(){
        BancoDePalavras b = new BancoDePalavras();
        String palavra = b.getPalavra();
        assertNotNull(palavra);
        assertTrue(palavra.length() > 1 );
    }

    @Test
    public void testOrdemSeed0(){
        BancoDePalavras b = new BancoDePalavras(0);
        String palavra = b.getPalavra();
        assertEquals("falhar", palavra);
    }
}
