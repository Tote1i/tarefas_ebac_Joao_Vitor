
package com.ebac.dao;

import com.ebac.models.Contrato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tote1i
 */
public class ContratoDao implements IContratoDao {

    private final List<Contrato> contratos = new ArrayList<>();

    @Override
    public Contrato buscarContrato(int id) {
        for (Contrato contrato : contratos) {
            if (contrato.getId() == id) {
                return contrato; // Contrato encontrado
            }
        }
        return null; // Contrato com o ID fornecido não encontrado
    }

    @Override
    public void salvarContrato(Contrato contrato) {
        contratos.add(contrato);
    }


    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Not supported yet.");
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
            // Você pode atualizar outros campos conforme necessário

            // Saia do loop, pois encontramos o contrato e o atualizamos
            return;
        }
    }

    // Se o contrato não foi encontrado, lance uma exceção ou realize outra ação apropriada
    throw new IllegalArgumentException("Contrato não encontrado com o ID fornecido");
}


}

