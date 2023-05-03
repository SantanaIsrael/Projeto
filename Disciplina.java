import base.Pessoa;

public class Disciplina {
    protected String nomeDisciplina, codigoDisciplina;
    protected Pessoa Professor;
    protected float[] notas;
    protected int cargaHoraria, creditos = 0;
    private static boolean status = false;
    private static int cont = 0;
    
    // construtor
    public Disciplina(String nomeDisciplina, String codigoDisciplina, Pessoa nomeProfessor, int creditos,
    int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.Professor = nomeProfessor;
        this.cargaHoraria = cargaHoraria;
        if(verificarCreditos(creditos))
            this.creditos = creditos;
    }

    // getter's
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public Pessoa getProfessor() {
        return Professor;
    }

    public int getCredito(){
        return creditos;
    }

    // setter's
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public void setProfessor(Pessoa nomeProfessor) {
        this.Professor = nomeProfessor;
    }

    //Métodos
    private boolean verificarCreditos(int creditos) {
        if (creditos > 0) return true;
        else return false;
    }

    public void adicionaNota (float nota){
        if(cont <= creditos) notas[cont++] = nota;
    }

    public String toString (){
        return "Cod: " + codigoDisciplina + " Disciplina " + nomeDisciplina + " C/Horaria: " + cargaHoraria +
        "Creditos: " + creditos + "\n" + "Docente: " + Professor.getNomeString();
    }
}
