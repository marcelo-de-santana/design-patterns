package prototype;

public class Botao {
    String cor;
    int largura;
    int altura;
    TipoBordaEnum tipoBorda;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public TipoBordaEnum getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(TipoBordaEnum tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

}
