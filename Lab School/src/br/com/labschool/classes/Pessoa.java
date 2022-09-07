package br.com.labschool.classes;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Pessoa {

    protected String nome;
    protected String telefone;
    protected String dataNascimento;
    protected String cpf;
    protected static Integer id = 0;

    public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.id = geraCodigo();
    }

    public static int geraCodigo() {
        return id++;
    }

    public void getId() {
        System.out.println(id);
    }
}
