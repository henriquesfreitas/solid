package aula05_heranca_vs_composicao;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {
	public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150));
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
}
