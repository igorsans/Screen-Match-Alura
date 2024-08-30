package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoExpecption extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoExpecption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
