
package com.ebac.test;

/**
 *
 * @author tote1i
 */
import com.ebac.models.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Rodrigo");
		cli.adicionarNome1("Rodrigo");

		Assert.assertEquals("Rodrigo", cli.getNome());
	}
}
