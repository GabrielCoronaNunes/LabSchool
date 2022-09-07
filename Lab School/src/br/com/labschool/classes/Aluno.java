package br.com.labschool.classes;

public class Aluno extends Pessoa {

    private StatusMatricula statusMatricula;
    private Double notaEntrada;
    private int totalAtendimentosPedagogicos;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf, StatusMatricula statusMatricula, Double notaEntrada) {
       super(nome, telefone, dataNascimento, cpf);

        this.statusMatricula = statusMatricula;
        if (notaEntrada < 0 || notaEntrada > 10) {
            throw new IllegalArgumentException("Nota inválida: " + notaEntrada);
        }
        this.notaEntrada = notaEntrada;



    }


    public void getStatusMatricula() {
        System.out.println(statusMatricula);
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public void getid(){
        System.out.println(this.id);
    }
}
