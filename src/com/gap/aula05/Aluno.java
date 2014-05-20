package com.gap.aula05;

import java.io.Serializable;

public class Aluno implements Serializable{

    private String id, nome, dre;

    public Aluno(String id, String nome, String dre){
        this.id = id;
        this.nome = nome;
        this.dre = dre;
    }

    //para ArrayAdapter<Aluno>
    @Override
    public String toString() {
        return getId()+": "+getNome()+" - "+getDre();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDre() {
        return dre;
    }

    public void setDre(String dre) {
        this.dre = dre;
    }
}
