import org.junit.Test;

import static junit.framework.Assert.*;

public class TestEmbaralhadorParImpar {

    @Test
    public void testStringVazia(){
        Embaralhador e = new EmbaralhadorParImpar();
        assertEquals("", e.embaralhaPalavra(""));
    }

    @Test
    public void testStringUnitaria(){
        Embaralhador e = new EmbaralhadorParImpar();
        assertEquals("a", e.embaralhaPalavra("a"));
    }

    @Test
    public void testStringDois(){
        Embaralhador e = new EmbaralhadorParImpar();
        assertEquals("ba", e.embaralhaPalavra("ab"));
    }

    @Test
    public void testStringQuatro(){
        Embaralhador e = new EmbaralhadorParImpar();
        assertEquals(e.embaralhaPalavra("abab"), "baba");
    }

    @Test
    public void testStringTres(){
        Embaralhador e = new EmbaralhadorParImpar();
        assertEquals(e.embaralhaPalavra("aba"), "baa");
    }

}
