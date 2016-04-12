public class EmbaralhadorParImpar implements Embaralhador{

    @Override
    public String embaralhaPalavra(String palavra) {
        Integer i = 0;
        StringBuffer saida = new StringBuffer();
        while ( i < palavra.length()) {
            if (i % 2 == 1) {
                saida.append(palavra.charAt(i));
                saida.append(palavra.charAt(i - 1));
            } else {
                if ( (i == palavra.length() - 1) && (i % 2 == 0) ) {
                    saida.append(palavra.charAt(i));
                }
            }
            i++;
        }

        return saida.toString();
    }
}
