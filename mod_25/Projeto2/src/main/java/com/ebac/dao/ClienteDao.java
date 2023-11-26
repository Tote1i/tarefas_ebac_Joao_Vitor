
package com.ebac.dao;

import com.ebac.domain.Cliente;
import com.ebac.reflections.anotacao.cadastro.dao.generic.GenericDao;

/**
 *
 * @author tote1i
 */
public class ClienteDao extends GenericDao<Cliente, Long> implements IClienteDao {

	public ClienteDao() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}



}