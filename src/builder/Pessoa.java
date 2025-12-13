package builder;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, String documento, String email, String apelido,
            LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", documento=" + documento + ", email=" + email
                + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento + "]";
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public static class PessoaBuilder extends Pessoa {

        public PessoaBuilder nome(String nome) {
            super.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            super.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder documento(String documento) {
            super.documento = documento;
            return this;
        }

        public PessoaBuilder email(String email) {
            super.email = email;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            super.apelido = apelido;
            return this;
        }

        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            super.dataNascimento = dataNascimento;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(super.nome, super.sobrenome, super.documento, super.email, super.apelido,
                    super.dataNascimento);
        }
    }
}
