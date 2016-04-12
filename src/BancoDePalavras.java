import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BancoDePalavras {

    private ArrayList<String> palavras;
    private Integer seed = null;

    public BancoDePalavras(){
        carregaPalavras();
    }

    public BancoDePalavras(Integer seed){
        this.seed = seed;
        carregaPalavras();
    }

    private void carregaPalavras(){
        try {
            Path arquivo = Paths.get("palavras.txt");
            palavras = (ArrayList<String>)Files.readAllLines(arquivo, StandardCharsets.UTF_8);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getListaPalavras(){
        return (ArrayList<String>)palavras.clone();
    }

    public String getPalavra(){
        Random rn;
        if (seed != null) {
            rn = new Random(seed);
        } else {
            rn = new Random();
        }
        return palavras.get(rn.nextInt(palavras.size() - 1));
    }

}
