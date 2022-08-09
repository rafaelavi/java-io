package br.alura.java.io;

import java.io.Serial;
import java.io.Serializable;

/**
 *Classe que representa um cliente no bytebank
 *
 * @author Rafaela
 * @version 0.1
 */
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = -7065646203182013960L;
    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
