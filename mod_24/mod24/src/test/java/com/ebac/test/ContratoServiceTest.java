package com.ebac.test;

import com.ebac.dao.mocks.ContratoDaoMock;
import com.ebac.dao.IContratoDao;
import com.ebac.models.Contrato;
import com.ebac.service.ContratoService;
import com.ebac.service.IContratoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContratoServiceTest {

    private IContratoService contratoService;
    private IContratoDao contratoDao;

    @BeforeEach
    public void setUp() {
        // Inicializa uma instância de IContratoDao mock
        contratoDao = new ContratoDaoMock(); 

        // Inicializa a instância de ContratoService com o IContratoDao mock
        contratoService = new ContratoService(contratoDao);
    }

    @Test
    public void testBuscarContrato() {
    // Crie um contrato de exemplo
    Contrato contrato = new Contrato();
    contrato.setId(1);
    contrato.setDescricao("Contrato de exemplo");

    // Chame o método salvarContrato para salvar o contrato
    contratoService.salvarContrato(contrato);

    // Chame o método buscarContrato do serviço
    Contrato contratoEncontrado = contratoService.buscarContrato(1); // Suponhamos que estamos buscando pelo contrato com ID 1

    // Verifique se o contrato foi encontrado
    assertNotNull(contratoEncontrado);
    assertEquals(1, contratoEncontrado.getId());
    assertEquals("Contrato de exemplo", contratoEncontrado.getDescricao());
}

    @Test
    public void testExcluirContrato() {
    // Crie um contrato de exemplo e salve-o
    Contrato contrato = new Contrato();
    contrato.setId(1);
    contrato.setDescricao("Contrato de exemplo");
    contratoService.salvarContrato(contrato);

    // Exclua o contrato
    contratoService.excluirContrato(1); // Suponhamos que estamos excluindo o contrato com ID 1

    // Verifique se o contrato foi excluído
    Contrato contratoExcluido = contratoService.buscarContrato(1); // Tente buscar o contrato excluído

    assertNull(contratoExcluido); // Verifique se o contrato não foi encontrado (deve retornar null)
    }

    @Test
    public void testAtualizarContrato() {
    // Crie um contrato de exemplo e salve-o
    Contrato contrato = new Contrato();
    contrato.setId(1);
    contrato.setDescricao("Contrato de exemplo");
    contratoService.salvarContrato(contrato);

    // Modifique os dados do contrato (por exemplo, atualize a descrição)
    contrato.setDescricao("Nova descrição do contrato");

    // Atualize o contrato
    contratoService.atualizarContrato(contrato);

    // Verifique se o contrato foi atualizado corretamente
    Contrato contratoAtualizado = contratoService.buscarContrato(1); // Suponhamos que estamos buscando pelo contrato com ID 1

    assertNotNull(contratoAtualizado);
    assertEquals(1, contratoAtualizado.getId());
    assertEquals("Nova descrição do contrato", contratoAtualizado.getDescricao());
}


    
}
