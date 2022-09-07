package br.com.labschool;

import br.com.labschool.classes.Aluno;
import br.com.labschool.classes.StatusMatricula;

public class Main {
    public static void main(String[] args) {

      Aluno gabriel = new Aluno("Gabriel", "49998067919", "17/02/2001",
              "011.830.919.66", StatusMatricula.ATIVO, 9d);
      Aluno maciel = new Aluno("Gabriel", "49998067919", "17/02/2001",
              "011.830.919.66", StatusMatricula.ATIVO, 9d);

       gabriel.getid();
       maciel.getid();
    }
}
