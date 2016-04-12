import org.junit.Test;

import static junit.framework.Assert.*;

public class TestEmbaralhadorInverte{

    @Test
    public void testEmbaralhadorInverte(){
        Embaralhador e = new EmbaralhadorInverte();
        assertEquals(e.embaralhaPalavra("muito"), "otium");
    }
}
