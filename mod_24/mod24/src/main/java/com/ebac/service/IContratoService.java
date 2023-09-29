/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebac.service;

import com.ebac.models.Contrato;

/**
 *
 * @author tote1i
 */
public interface IContratoService {
    String salvar();

    public void salvarContrato(Contrato contrato);

    public Contrato buscarContrato(int id);

    public void excluirContrato(int id);

    public void atualizarContrato(Contrato contrato);

}
