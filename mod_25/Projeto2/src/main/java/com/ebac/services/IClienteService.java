
package com.ebac.services;

import com.ebac.domain.Cliente;
import com.ebac.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;

/**
 *
 * @author tote1i
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
