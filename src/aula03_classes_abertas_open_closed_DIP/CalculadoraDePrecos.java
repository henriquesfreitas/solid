package aula03_classes_abertas_open_closed_DIP;

public class CalculadoraDePrecos {
	private TabelaDePrecoInterface tabela;
	private ServicoDeEntregaInterface entrega;

	public CalculadoraDePrecos(TabelaDePrecoInterface tabela, ServicoDeEntregaInterface entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
