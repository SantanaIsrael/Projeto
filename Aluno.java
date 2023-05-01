import java.util.Arrays;

import base.*;

public class Aluno extends Pessoa{
    protected int matricula;
    protected float[] notas;
    protected int creditosAcumulados = 0;
    private Disciplina[] disciplinas;

    //Construtores
    public Aluno (String nome, String email, int cpf, int matricula, String endereco,int dia, int mes, int ano){
        super(nome, email, cpf, endereco, dia, mes, ano);
        this.matricula = matricula;
    }

    //Getter's
    public void setMatricula (int matricula){
        this.matricula = matricula;
    }
    
    //Setter's
    public int getMatricula (){
        return matricula;
    }

    private boolean validaDisciplina (Disciplina disc){
        if(disc.getCredito() - this.creditosAcumulados > 0) return true;
        else return false;
    }

    public void cadastrarDisciplina (Disciplina disc){
        if(validaDisciplina(disc)) disciplinas[0] = disc;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", notas=" + Arrays.toString(notas) + ", creditosAcumulados="
                + creditosAcumulados + ", disciplinas=" + Arrays.toString(disciplinas) + "]";
    }
}
