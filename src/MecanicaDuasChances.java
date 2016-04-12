import java.util.Formatter;


public class MecanicaDuasChances implements MecanicaDoJogo {

    private Embaralhador e;
    private boolean acertou;
    private boolean andamento;
    private String palavra;
    private String palavraEmbaralhada;
    private Integer chance;

    public MecanicaDuasChances(){
        e = FabricaEmbaralhadores.getEmbaralhador();
        chance = 0;
        palavra = new BancoDePalavras().getPalavra();
        palavraEmbaralhada = e.embaralhaPalavra(palavra);
        acertou = false;
        andamento = true;
    }

    @Override
    public String getMensagemInicial() {
        return "Este é o jogo das Palavras Embaralhadas\\nVocê tem duas chances para acertar a palavra!";
    }

    @Override
    public String getMensagemJogo() {
        StringBuffer s = new StringBuffer();
        Formatter f = new Formatter(s);
        if (this.chance == 0) {
            return f.format("Esta é a sua primeira chance!\nDesembaralhe a palavra %s", palavraEmbaralhada).toString();
        }
        return "Esta é a sua última chance! Tente uma última vez!";
    }

    @Override
    public boolean jogoEmAndamento() {
        return andamento;
    }

    @Override
    public String getMensagemFinal() {
        StringBuffer s = new StringBuffer();
        Formatter f = new Formatter(s);
        if (acertou) {
            return f.format("Parabéns! Você acertou a palavra %s", this.palavra).toString();
        } else {
            return f.format("Você errou! A palavra certa é %s", this.palavra).toString();
        }
    }

    @Override
    public void verificaPalavra(String palavra) {
        this.chance++;
        if (palavra.equals(this.palavra)) {
            acertou = true;
            andamento = false;
        }
        if (chance == 2) {
            andamento = false;
        }

    }
}
