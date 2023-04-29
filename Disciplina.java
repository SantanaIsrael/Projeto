import base.Pessoa;

abstract class Disciplina {
    protected String nomeDisciplina, codigoDisciplina;
    protected Pessoa nomeProfessor;

    //construtor
    public Disciplina (String nomeDisciplina, String codigoDisciplina, Pessoa nomeProfessor){
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.nomeProfessor = nomeProfessor;
    }
    
    //getter's
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public Pessoa getNomeProfessor() {
        return nomeProfessor;
    }

    //setter's
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public void setNomeProfessor(Pessoa nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
