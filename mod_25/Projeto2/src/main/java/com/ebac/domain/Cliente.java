
package com.ebac.domain;

import anotacao.TipoChave;
import com.ebac.reflections.anotacao.cadastro.domain.Persistente;

/**
 *
 * @author tote1i
 */
public class Cliente extends Persistente{
    @TipoChave("getCpf")
    private long cpf;
    private String nome;
    private long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    //  Métodos
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
