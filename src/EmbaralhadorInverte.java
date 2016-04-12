public class EmbaralhadorInverte implements Embaralhador {

    public String embaralhaPalavra(String palavra) {
        StringBuffer revertida = new StringBuffer(palavra);
        return revertida.reverse().toString();
    }

}
