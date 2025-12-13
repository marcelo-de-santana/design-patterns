package factory;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                var produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                var produtoDigital = new ProdutoDigital();
                produtoDigital
                        .setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto inválido");
        }
    }
}