package aula01_coesao_single_responsability_principle;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}
