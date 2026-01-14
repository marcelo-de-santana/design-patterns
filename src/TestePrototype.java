import prototype.BotaoRegistry;

public class TestePrototype {
    public static void main(String[] args) {
        var botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        var botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        var botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");

        System.out.println(botaoVermelho.toString());
        System.out.println(botaoAzul.toString());
        System.out.println(botaoAmarelo.toString());

        botaoAmarelo.setLargura(200);

        System.out.println("Depois de alterar a largura do botão amarelo:");
        System.out.println(botaoAmarelo.toString());

        var botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO_AMARELO");
    
        System.out.println("Novo botão amarelo do registry:");
        System.out.println(botaoAmarelo2.toString());
    }
}
