package steps;

import io.cucumber.java.pt.Dado;

public class TicketStep {
	
	@Dado("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketE(String tipo, String ticket) {
		System.out.println("Ticket: " + ticket);
	}

	@Dado("^que o valor da passagem é R\\$ (\\d+[,]\\d+)$")
	public void queOValorDaPassagemERS(Double valor) {
		System.out.println("Valor: " + valor);
	}

	@Dado("^que o nome do passageiro é (.{5,20})$")
	public void queONomeDoPassageiroE(String nomePassageiro) {
		System.out.println("Nome do Passageiro: " + nomePassageiro);
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroE(String telefone) {
		System.out.println("Telefone: " + telefone);
	}

}
