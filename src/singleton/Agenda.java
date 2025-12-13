package singleton;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<DiaDaSemana, Boolean> diasDisponiveis = new HashMap<>();

    public Agenda() {
        diasDisponiveis.put(DiaDaSemana.DOMINGO, Boolean.TRUE);
        diasDisponiveis.put(DiaDaSemana.SEGUNDA, Boolean.TRUE);
        diasDisponiveis.put(DiaDaSemana.TERCA, Boolean.TRUE);
        diasDisponiveis.put(DiaDaSemana.QUARTA, Boolean.TRUE);
        diasDisponiveis.put(DiaDaSemana.QUINTA, Boolean.TRUE);
        diasDisponiveis.put(DiaDaSemana.SEXTA, Boolean.TRUE);
        diasDisponiveis.put(DiaDaSemana.SABADO, Boolean.TRUE);
    }

    public Map<DiaDaSemana, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void marcarDiaIndisponivel(DiaDaSemana dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }

  
}
