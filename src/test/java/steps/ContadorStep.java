package steps;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ContadorStep {

	private Integer contador = 0;

	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) {
		contador = int1;
	}

	@Quando("eu incrementa-lo em {int}")
	public void euIncrementaLoEm(Integer int1) {
		contador += int1;
	}

	@Então("o valor será {int}")
	public void oValorSerá(Integer int1) {
		assertEquals(int1, contador);
	}

}
