/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebac.reflections.anotacao.cadastro.exception;

/**
 *
 * @author tote1i
 */
public class TipoChaveNaoEncontradaException extends Exception {
    
	private static final long serialVersionUID = -1389494676398525746L;

	public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}