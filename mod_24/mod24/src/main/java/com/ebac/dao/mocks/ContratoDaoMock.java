
package com.ebac.dao.mocks;

import com.ebac.dao.IContratoDao;
import com.ebac.models.Contrato;

/**
 *
 * @author tote1i
 */
import java.util.ArrayList;
import java.util.List;

public class ContratoDaoMock implements IContratoDao {
    private final List<Contrato> contratos = new ArrayList<>();

    @Override
    public void salvarContrato(Contrato contrato) {
        // Simule a persistência em uma lista
        contratos.add(contrato);
    }

    @Override
    public Contrato buscarContrato(int id) {
        // Simule a busca na lista
        for (Contrato contrato : contratos) {
            if (contrato.getId() == id) {
                return contrato;
            }
        }
        return null; // Retorne null se o contrato com o ID fornecido não for encontrado
    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void excluirContrato(int id) {
    // Simule a exclusão do contrato da lista
    contratos.removeIf(contrato -> contrato.getId() == id);
}

    @Override
    public void atualizarContrato(Contrato contrato) {
    // Verifique se o contrato possui um ID válido
    if (contrato.getId() <= 0) {
        throw new IllegalArgumentException("ID de contrato inválido");
    }

    // Encontre o contrato existente na lista de contratos pelo ID
    for (int i = 0; i < contratos.size(); i++) {
        Contrato contratoExistente = contratos.get(i);
        if (contratoExistente.getId() == contrato.getId()) {
            // Atualize os dados do contrato existente com os dados do contrato fornecido
            contratoExistente.setDescricao(contrato.getDescricao());
            return;
        }
    }

    // Se o contrato não foi encontrado, lance uma exceção ou realize outra ação apropriada
    throw new IllegalArgumentException("Contrato não encontrado com o ID fornecido");
}


}


