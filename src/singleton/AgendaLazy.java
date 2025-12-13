package singleton;

public class AgendaLazy extends Agenda {
    private static AgendaLazy INSTANCIA = null;

    // Construtor privado para evitar instanciacao externa
    private AgendaLazy() {
        super();
    }

    public static AgendaLazy getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new AgendaLazy();
        }
        return INSTANCIA;
    }
}
