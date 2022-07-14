package aula01_coesao_single_responsability_principle;

public class CalculaDezOuVintePorcento implements RegraDeCalculoInterface {
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}
