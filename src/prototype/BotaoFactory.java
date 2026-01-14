package prototype;

public class BotaoFactory {
    public static Botao getInstancia(Botao prototipo) {
        var clone = new Botao();

        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

        return clone;
    }

}
