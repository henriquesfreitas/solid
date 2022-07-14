package aula02_acoplamento_estabilidade;

public class NotaFiscalDao implements AcaoAposGerarNotaInterface{

	@Override
	public void executa(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("teste");
	}

}
