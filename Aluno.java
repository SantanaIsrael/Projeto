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
}
