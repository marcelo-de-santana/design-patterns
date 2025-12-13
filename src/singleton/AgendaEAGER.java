package singleton;

public class AgendaEAGER extends Agenda {
    private static final AgendaEAGER instancia = new AgendaEAGER();

    private AgendaEAGER() {
        super();
    }

    public static AgendaEAGER getInstancia() {
        return instancia;
    }
    
}
