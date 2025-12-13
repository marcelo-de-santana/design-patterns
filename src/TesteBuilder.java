import java.time.LocalDate;

import builder.Pessoa;

public class TesteBuilder {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Marcelo",
        "Santana",
        "123.456.789-00",
        "marcelo.santana@gmail.com",
        "Marcelinho",
        LocalDate.of(2000, 01, 01));

        var pessoaBuilder = Pessoa.builder()
                .nome("Marcelo")
                .sobrenome("Santana")
                .documento("123.456.789-00")
                .email("marcelo.santana@gmail.com")
                .apelido("Marcelinho")
                .dataNascimento(LocalDate.of(2000, 01, 01))
                .build();

                System.out.println("Pessoa: " + pessoa.toString());
                System.out.println("Pessoa Builder:" + pessoaBuilder.toString());
    }
}
