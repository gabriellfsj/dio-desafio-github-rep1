package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String numCartao;
    private ArrayList<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("O endereço não pode ser nulo");
        }
        if(endereco.cep == null){
            throw new NullPointerException("O CEP não pode ser nulo!");
        }
        getEndereco().add(endereco);
    }

    private List<Endereco> getEndereco(){
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

}
