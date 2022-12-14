package simulado_q1;

public class Tweet {
    private String text;
    private int tamanho;
    
    public Tweet(String text) {
        this.text = text;
        this.tamanho = text.length();
    }

    public String getText() {
        return text;
    }
    public int getTamanho() {
        return tamanho;
    }

}
