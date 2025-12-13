
import factory.ProdutoDigital;
import factory.ProdutoFactory;
import factory.ProdutoFisico;
import factory.TipoProdutoEnum;

public class TesteFactory {

    static void testeProdutoSemFactory() {
        var produtoFisico = new ProdutoFisico();
        var produtoDigital = new ProdutoDigital();

        produtoFisico.setPossuiDimensoesFisicas(true);
        produtoDigital.setPossuiDimensoesFisicas(false);

        System.out.println("Sem Factory");
        System.out.println(produtoFisico.toString());
        System.out.println(produtoDigital.toString());

    }

    static void testeProdutoComFactory() {
        var produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        var produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        System.out.println("Por Factory");
        System.out.println(produtoFisico.toString());
        System.out.println(produtoDigital.toString());

    }

    public static void main(String[] args) {
        testeProdutoSemFactory();
        testeProdutoComFactory();
    }

}
