package singleton;

public enum DiaDaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda"),
    TERCA("Terca"),
    QUARTA("Quarta"),
    QUINTA("Quinta"),
    SEXTA("Sexta"),
    SABADO("Sabado");

    private String dia;

    DiaDaSemana(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }
}