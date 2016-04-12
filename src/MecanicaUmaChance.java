import java.util.Formatter;

public class MecanicaUmaChance implements MecanicaDoJogo {

    private Embaralhador e;
    private boolean acertou;
    private boolean andamento;
    private String palavra;
    private String palavraEmbaralhada;

    public MecanicaUmaChance(){
        e = FabricaEmbaralhadores.getEmbaralhador();
        palavra = new BancoDePalavras().getPalavra();
        palavraEmbaralhada = e.embaralhaPalavra(palavra);
        acertou = false;
        andamento = true;
    }

    @Override
    public String getMensagemInicial() {
        return "Este é o jogo das Palavras Embaralhadas\nVocê tem uma chance para acertar a palavra!";
    }

    @Override
    public String getMensagemJogo() {
        StringBuffer s = new StringBuffer();
        Formatter f = new Formatter(s);
        return f.format("Desembaralhe a palavra %s", palavraEmbaralhada).toString();
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
        if (palavra.equals(this.palavra)) {
            acertou = true;
        }
        andamento = false;
    }
}
