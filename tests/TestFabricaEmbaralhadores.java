import org.junit.Test;

import static junit.framework.Assert.*;

public class TestFabricaEmbaralhadores {

    @Test
    public void testGetEmabaralhador(){
        Embaralhador e = new FabricaEmbaralhadores().getEmbaralhador();
        assertTrue(e != null);
    }

}
