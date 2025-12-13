package singleton;

/**
 * Singleton Eager implementation of Agenda
 * O Eager Singleton é uma implementação do padrão Singleton onde a
 * instância única da classe é criada no momento em que a classe é carregada
 * pela primeira vez, independentemente de ela ser realmente necessária ou não.
 * Isso significa que a instância é criada antecipadamente (eagerly), garantindo
 * que estará disponível quando for solicitada.
 * @author Marcelo
 */
public class AgendaEAGER extends Agenda {
    private static final AgendaEAGER INSTANCIA = new AgendaEAGER();

    // Construtor privado para evitar instanciacao externa
    private AgendaEAGER() {
        super();
    }

    public static AgendaEAGER getInstancia() {
        return INSTANCIA;
    }
    
}
