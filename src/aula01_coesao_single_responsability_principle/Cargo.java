package aula01_coesao_single_responsability_principle;

public enum Cargo {
    DESENVOLVEDOR(new CalculaDezOuVintePorcento()),
    DBA(new CalculaDezOuVintePorcento()),
    TESTER(new CalculaQuinzeOuVinteCincoPorcento());
    
    private RegraDeCalculoInterface regra ;

	Cargo(RegraDeCalculoInterface regra) {
    	this.regra = regra;
    }

	public RegraDeCalculoInterface getRegra() {
		return regra;
	}

}


