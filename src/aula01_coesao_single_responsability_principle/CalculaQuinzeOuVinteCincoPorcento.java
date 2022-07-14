package aula01_coesao_single_responsability_principle;

public class CalculaQuinzeOuVinteCincoPorcento implements RegraDeCalculoInterface{
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		}
		else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}
}
