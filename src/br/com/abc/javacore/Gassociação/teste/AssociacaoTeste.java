package br.com.abc.javacore.Gassociação.teste;

import br.com.abc.javacore.Gassociação.classes.Aluno;
import br.com.abc.javacore.Gassociação.classes.Professor;
import br.com.abc.javacore.Gassociação.classes.Seminario;
import br.com.abc.javacore.Gassociação.classes.Local;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 21);
        Aluno aluno2 = new Aluno("Priscila", 22);
        Seminario seminario1 = new Seminario("Como ser um programador fera.");
        Professor professor1 = new Professor("Michael Jordan", "habilidade de jogo");
        Local local1 = new Local("Manoel Firmino Sampaio", "Guararapes");


        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno1.imprime();
        aluno2.imprime();

        professor1.setSeminarios(new Seminario[]{seminario1}); // Uma das formas de se criar um array passando por argumento.
        professor1.imprime();
        local1.imprime();


        seminario1.setProfessor(professor1);
        seminario1.setLocal(local1);


  /*      Aluno[] alunosSala = new Aluno[2]; // o comentario da pergunta: Pq nao funciona?. Seria caso o indice do vetor fosse 3.
        alunosSala[0] = new Aluno(); // Uma forma de inicializar essa posiçao do vetor, criando um objeto.
        alunosSala[1] = aluno1; // Outra forma de inicializar uma posiçao de um vetor, atribuindo uma variavel de referencia ja instanciada.
        alunosSala[0].setNome("Pedro Araujo Nogueira");
        alunosSala[1].setNome("Priscila Araujo Nogueiraaaa");
        // alunosSala[2].setNome("Priscila Araujo TESTE DE ERRO"); // pq nao funciona? Pq essa posiçao do array nao foi inicializada ainda,
        // quando inicializado o vetor de 3 posiçoes acima isso nao quer dizer que as posiçoes do vetor do tipo refence
        // tmb foram inicializadas, pelo contrario elas ainda tem o valor padrao null, entao devemos inicializa-las antes de usar-las,
        // fazemos isso atribuindo elas pra algum objeto de um tipo consistente com o do vetor e ja existem ou criando outro objeto,
        // tmb de um tipo consistente com o do vetor.
        seminario1.setAlunos(alunosSala);
        seminario1.imprime();
        System.out.println(alunosSala.length);
        System.out.println(alunosSala);
        System.out.println(alunosSala[0]);// Para mostrar que cada posiçao do array de um tipo reference aponta pra um outro objeto.
        // ou seja, na verdade um array de um tipo reference guarda varios endereços compativeis onde estao objetos compativeis com seu tipo.
        System.out.println(alunosSala[1]);
*/


        seminario1.setAlunos(new Aluno[]{aluno1, aluno2}); // Outra maneira de se criar um array passando por argumento.
        seminario1.imprime();



// Associaçao é o que nos permite criar sistemas, sem a associaçao nao poderiamos criar sistemas completos como temos hoje em dia.
// Associaçao é o relacionamento que temos entre uma ou mais classes.
// Associaçao usa o termo TEM_UM.


    }
}
