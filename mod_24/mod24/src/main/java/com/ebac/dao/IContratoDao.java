
package com.ebac.dao;

import com.ebac.models.Contrato;

/**
 *
 * @author tote1i
 */
public interface IContratoDao {
    void salvar();

    public Contrato buscarContrato(int id);

    public void salvarContrato(Contrato contrato);

    public void excluirContrato(int id);

    public void atualizarContrato(Contrato contrato);
}
