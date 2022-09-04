package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();


        prof1.matricula = "1111";
        prof1.rg = "111";
        prof1.cpf = "11";
        prof1.nome = "Pedro";

        prof2.matricula = "2222";
        prof2.rg = "222";
        prof2.cpf = "22";
        prof2.nome = "Priscila";

        System.out.println("Dentro do metodo imprime:");

        prof1.imprime(prof1); // Quando passamos um tipo reference como argumento, estamos passando na verdade
                              // o endereço do objeto, entao ao mudarmos algo no parametro estaremos alterando tmb
                              // o argumento, diferente do que acontece quando passamos tipos primitivos.
        System.out.println("---------------");
        prof1.imprime(prof2); // Observe que foi chamado o metodo imprime atraves de prof1.imprime e nao de
                              // prof2.imprime, acontece que tanto faz pq o metodo imprime é o mesmo, a diferença
                              // vai estar em quem esta sendo passado como argumento.
        System.out.println("---------------");
        System.out.println("Após a mudança dentro do metodo imprime.");
        System.out.println("O nome foi alterado para: " + prof1.nome);
        System.out.println("O nome foi alterado para: " + prof2.nome);
        System.out.println();
        System.out.println("Acessando endereço sem a passagem de parametros.");
        prof1.imprime();
        prof2.imprime();

    }
}
