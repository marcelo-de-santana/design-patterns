import singleton.Agenda;
import singleton.DiaDaSemana;

public class TesteSingleton {
    public static void main(String[] args) {
        reservarDia(DiaDaSemana.SEXTA);
        reservarDia(DiaDaSemana.SABADO);
    }

    static void reservarDia(DiaDaSemana dia) {
        var agenda = new Agenda();
        agenda.marcarDiaIndisponivel(dia);
        System.out.println(agenda.getDias());
    }

    static void testeAgendaComSingletonEager(){
        
    }
}
