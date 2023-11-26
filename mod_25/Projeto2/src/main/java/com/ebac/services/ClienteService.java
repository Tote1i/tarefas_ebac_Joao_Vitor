
package com.ebac.services;

import com.ebac.dao.ClienteDao;
import com.ebac.dao.IClienteDao;
import com.ebac.domain.Cliente;
import com.ebac.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;
import com.ebac.reflections.anotacao.cadastro.service.generic.GenericService;
/**
 *
 * @author tote1i
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDao clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}


	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}



}