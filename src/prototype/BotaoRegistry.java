package prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {
    private static BotaoRegistry instancia;

    private static Map<String, Botao> REGISTRO = new HashMap<>();

    static {
        Botao botaoVermelho = new BotaoVermelho();
        Botao botaoAmarelo = new BotaoAmarelo();
        Botao botaoAzul = new BotaoAzul();

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
}
