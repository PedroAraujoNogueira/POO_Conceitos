package br.com.abc.javacore.Aintroducaoclasses.teste;
import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;
// Foi preciso dar um import em br.com.abc.javacore.Aintroducaoclasses.classes.Estudante porque uma classe so consegue
// encontrar outra que seja publica E que esteja no seu mesmo pacote.
public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante joao = new Estudante(); // Objeto é uma instancia de uma classe.
        // Estudante joao; Quando fazemos apenas a declaraçao da variavel, ela apenas faz uma referencia, nao temos ainda
                //um objeto criado e tambem nao temos ainda um espaço na memoria destinada para essa variavel,
                //temos apenas um nome(joao) que sabe que fará referencia a um espaço na memoria que sera um objeto do tipo
                // Estudante(ou sub-classe de Estudante).

        // Para ler dados:
        joao.nome = "joao";
        joao.matricula = "1212";
        joao.idade = 15;

        // Para imprimir dados:
        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);

    }
}
//Baixa coesa é ruim, pois significa que estamos colocando muitas coisas em um lugar(classe) só, logo, alta coesao é bom pois
//estamos colocando somente coisas especificas daquela classe.
