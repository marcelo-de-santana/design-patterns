import java.lang.reflect.InvocationTargetException;

import singleton.AgendaEAGER;
import singleton.AgendaEnum;
import singleton.AgendaLazy;
import singleton.DiaDaSemana;

public class TesteSingleton {
    static void reservarDiaEager(DiaDaSemana dia) {
        var agenda = AgendaEAGER.getInstancia();
        agenda.marcarDiaIndisponivel(dia);
        System.out.println(agenda.getDias());
    }

    static void reservarDiaLazy(DiaDaSemana dia) {
        var agenda = AgendaLazy.getInstancia();
        agenda.marcarDiaIndisponivel(dia);
        System.out.println(agenda.getDias());
    }

    static void testeAgendaComSingletonEager() {
        System.out.println("--- Teste Singleton Eager ---");
        reservarDiaEager(DiaDaSemana.SEXTA);
        reservarDiaEager(DiaDaSemana.SABADO);
    }

    static void testeAgendaComSingletonLazy() {
        System.out.println("--- Teste Singleton Lazy ---");
        reservarDiaLazy(DiaDaSemana.SEXTA);
        reservarDiaLazy(DiaDaSemana.SABADO);
    }

    // Teste para demonstrar que é possível quebrar o padrão singleton usando reflection
    static void testeAgendaSingletonComReflection() throws NoSuchMethodException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("--- Teste Singleton Com Reflection ---");
        var contrutorDeclarado = AgendaLazy.class.getDeclaredConstructor();
        contrutorDeclarado.setAccessible(true);

        var agenda1 = contrutorDeclarado.newInstance();
        var agenda2 = contrutorDeclarado.newInstance();

        System.out.println("Agenda 1: " + agenda1.hashCode());
        System.out.println("Agenda 2: " + agenda2.hashCode());
        System.out.println("São a mesma instância? " + (agenda1 == agenda2)); //false
    }

    // Teste para demonstrar que o padrão singleton usando enum não pode ser quebrado com reflection
    static void testeAgendaSingletonSemReflection() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("--- Teste Singleton Sem Reflection ---");
        var contrutorDeclarado = AgendaEnum.class.getDeclaredConstructor();
        contrutorDeclarado.setAccessible(true);

        var agenda1 = contrutorDeclarado.newInstance();
        var agenda2 = contrutorDeclarado.newInstance();

        System.out.println("Agenda 1: " + agenda1.hashCode());
        System.out.println("Agenda 2: " + agenda2.hashCode());
        System.out.println("São a mesma instância? " + (agenda1 == agenda2)); //exception
    }

    /**
     * A diferença principal entre os padrões Singleton Eager e Lazy está no momento
     * em que a instância única da classe é criada.
     * Eager Singleton cria a instância no momento em que a classe é carregada,
     * enquanto o Lazy Singleton cria a instância somente quando ela é realmente
     */
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        testeAgendaComSingletonEager();
        testeAgendaComSingletonLazy();
        testeAgendaSingletonComReflection();
        testeAgendaSingletonSemReflection();
    }

}
