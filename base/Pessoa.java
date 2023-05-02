package base;

public class Pessoa{
    protected Data nascimentoData;
    protected String nomeString, emailString, enderecoString, cpfString;

    //Construtores
    public Pessoa (String nome, String email, String cpf, String endereco,int dia, int mes, int ano){
        nomeString = nome;
        emailString = email;
        cpfString = cpf;
        enderecoString = endereco;
        nascimentoData = new Data(dia, mes, ano);
    }

    public Pessoa (String nome, String email, String cpf, Data data){
        nomeString =  nome;
        emailString = email;
        cpfString = cpf;
        nascimentoData = data;        
    }

    //Gette's and Sette's
    public Data getNascimentoData() {
        return nascimentoData;
    }

    public void setNascimentoData(Data nascimentoData) {
        this.nascimentoData = nascimentoData;
    }

    public String getNomeString() {
        return nomeString;
    }

    public void setNomeString(String nomeString) {
        this.nomeString = nomeString;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public String getCpfInt() {
        return cpfString;
    }

    public void setCpfString(String cpfString) {
        this.cpfString = cpfString;
    }
    
    @Override
    public String toString (){
        return "Nome: " + nomeString + "\n" + "E-mail: " + emailString + "CPF: " + cpfString + "\n"
         + nascimentoData.infoDateExt();
    }
}