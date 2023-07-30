import br.edu.unicesumar.Pessoa;

/*
Crie uma classe Java (versão 17) Pessoa com os atributos Nome, Data de Nascimento e Idade.
Crie no mínimo três Construtores e métodos (getters e setters).
*/

public class Main {
    public static void main(String[] args) {
        Pessoa aluno = new Pessoa("Amanda","19/05/2003",20);
        System.out.println(aluno.getIdade());
        
        Pessoa aluno2 = new Pessoa("Amanda");
        System.out.println(aluno2.getNome());
        aluno2.setIdade(20);
        System.out.println(aluno2.getIdade());

        Pessoa aluno3 = new Pessoa("19/05/2003", "amanda");
        System.out.println(aluno3.getNome());
    }
}