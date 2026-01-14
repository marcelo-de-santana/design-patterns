package prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {
    private static BotaoRegistry instancia;

    private static Map<String, Botao> REGISTRO = new HashMap<>();

    static {
        Botao botaoVermelho = new BotaoVermelho();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAmarelo = new BotaoAmarelo();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);

        Botao botaoAzul = new BotaoAzul();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRO.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRO.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRO.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegistry getInstancia() {
        if (Objects.isNull(instancia)) {
            instancia = new BotaoRegistry();
        }
        return instancia;
    }

    public static Botao getBotao(String tipoBotao) {
        return BotaoFactory.getInstancia(REGISTRO.get(tipoBotao));
    }
}
