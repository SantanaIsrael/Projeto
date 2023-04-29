import base.*;

public class Aluno extends Pessoa{
    protected int matricula;
    protected float[] notas;
    private static int contNota = 0;

    public Aluno (String nome, String email, int cpf, int matricula, String endereco,int dia, int mes, int ano){
        super(nome, email, cpf, endereco, dia, mes, ano);
        this.matricula = matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public int getMatricula (){
        return matricula;
    }

    private boolean validarNota(){
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0) return true;
        }
        return false;
    }

    public void nota (float nota){
        notas[contNota++] = nota;
    }
    //Mas isso não deveria estar em disciplinas
}
