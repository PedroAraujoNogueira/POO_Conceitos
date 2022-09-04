package br.com.abc.javacore.Aintroducaoclasses.teste;
import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.matricula = "1111";
        professor.rg = "111";
        professor.cpf = "11";
        professor.nome = "Pedro";

        System.out.println(professor.matricula);
        System.out.println(professor.nome);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        Professor professor2 = new Professor();
        professor2.matricula = "2222";
        professor2.rg = "222";
        professor2.cpf = "22";
        professor2.nome = "Priscila";

        System.out.println(professor2.matricula);
        System.out.println(professor2.nome);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);

        professor = professor2; // IMPORTANTE: Professor recebe referencia ao mesmo objeto que a variavel de referencia professor2,
                                // logo o objeto que estava sendo referenciado por professor
                                // nao tera mais nenhuma variavel de referencia referenciando(apontando) ele, entao
                                // esse objeto deixará de existir e sera limpo da memoria.

        System.out.println("Após professor receber a mesma referencia de professor2.");
        System.out.println(professor.matricula);
        System.out.println(professor.nome);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
