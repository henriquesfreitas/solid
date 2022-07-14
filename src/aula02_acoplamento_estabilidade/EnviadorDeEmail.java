package aula02_acoplamento_estabilidade;

public class EnviadorDeEmail implements AcaoAposGerarNotaInterface{

	@Override
	public void executa(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("Envia email");
	}

}
