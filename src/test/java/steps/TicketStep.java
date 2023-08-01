package steps;

import io.cucumber.java.pt.Dado;

public class TicketStep {
	
	@Dado("^que o ticket é (A.\\d{3})$")
	public void queOTicketÉ(String string) {
		System.out.println("Ticket: " + string);
	}

	@Dado("^que o ticket especial é (A.\\d{3})$")
	public void queOTicketEspecialÉ(String string) {
		System.out.println("Ticket Especial: " + string);
	}

	@Dado("^que o valor da passagem é [R][$] (\\d+[,]\\d+)$")
	public void queOValorDaPassagemÉR$(Double double1) {
		System.out.println("Valor: " + double1);
	}

	@Dado("^que o nome do passageiro é (\\D+ \\D+ \\D+)$")
	public void queONomeDoPassageiroÉ(String string) {
		System.out.println("Nome do Passageiro: " + string);
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}[-]\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(String string) {
		System.out.println("Telefone: " + string);
	}

}
