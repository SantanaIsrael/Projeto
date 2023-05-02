import base.Pessoa;

public class main {
    public static void main(String[] args) {
        Pessoa professor = new Pessoa("Carlos", "santosislva@gmail.com", "07451834506", "Rua costa Brito", 02, 05, 2023);
        Disciplina[] d = new Disciplina[3];
        d[0] = new Disciplina ("Estrutura de dados", "CET305", professor, 3, 80);
    }
}