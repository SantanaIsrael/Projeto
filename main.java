import base.Pessoa;

public class main {
    public static void main(String[] args) {
        Pessoa professor = new Pessoa("Carlos", "santosislva@gmail.com", "07451834506", "Rua costa Brito", 02, 05, 2023);
        Pessoa professor2 = new Pessoa("Sussana", "santosislva@gmail.com", "07451834506", "Rua costa Brito", 02, 05, 2023);
        Pessoa professor3 = new Pessoa("Silva", "santosislva@gmail.com", "07451834506", "Rua costa Brito", 02, 05, 2023);
        Disciplina[] d = new Disciplina[3];
        d[0] = new Disciplina ("Estrutura de dados", "CET305", professor, 3, 80);
        d[1] = new Disciplina ("Ingles", "CET309", professor2, 3, 80);
        d[2] = new Disciplina ("LP3", "CET305", professor3, 3, 80);

        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
    }
}