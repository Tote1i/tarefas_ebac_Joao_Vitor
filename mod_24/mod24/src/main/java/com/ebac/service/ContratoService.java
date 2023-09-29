
package com.ebac.service;

import com.ebac.dao.IContratoDao;
import com.ebac.models.Contrato;

/**
 *
 * @author tote1i
 */
public class ContratoService implements IContratoService {
    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        try {
            contratoDao.salvarContrato(new Contrato());
            return "Sucesso";
        } catch (Exception e) {
            return "Erro: " + e.getMessage(); 
        }
    }

    @Override
    public void salvarContrato(Contrato contrato) {
    try {
        contratoDao.salvarContrato(contrato);
    } catch (Exception e) {
        throw new RuntimeException("Erro ao salvar contrato: " + e.getMessage());
    }
}

    @Override
    public Contrato buscarContrato(int id) {
        return contratoDao.buscarContrato(id);
    }

    @Override
    public void excluirContrato(int id) {
        contratoDao.excluirContrato(id);
    }

    @Override
    public void atualizarContrato(Contrato contrato) {
    contratoDao.atualizarContrato(contrato);
}

    
}
