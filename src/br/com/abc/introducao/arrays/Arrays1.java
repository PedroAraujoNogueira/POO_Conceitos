package br.com.abc.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //Todo array em java é considerado um objeto.
        //Não é possivel criar um array sem tamanho em java.
        //Só é possível utilizar a palavra new com tipos primiticos quando estivermos criando arrays
        //pois a palavra new é utilizada para criar objetos, por isso todo array em si é um objeto.

        //int[] idade; Quando fazemos apenas a declaraçao da variavel, ela apenas faz uma referencia, nao temos ainda
        //um objeto criado e tambem nao temos ainda um espaço na memoria destinada para essa variavel,
        //temos apenas um nome que sabe que fará referencia a um espaço na memoria que sera um array
        //de int.
        int[] idade = new int[3];// Agora ja temos espaço na alocado memoria, pois uma das
        // formas de se fazer isso é declarando o new.

        //int idade[] = new int[3]; Podemos utilizar os colchetes depois da variavel tmb, porem
                         // essa forma de declarar nao é recomendada pois fica confuso o coódigo.
        idade[0] = 20;
        idade[1] = 15;
        idade[2] = 30;
        // idade[3] = 40; //Esse termo nao gera erro no processo de compilação pois o compilador nao sabe o tamanho
                          //do array, porém terá um erro em tempo de execução, pois estamos tentando acessar uma
                          //posição do array que nao existe.
        System.out.println("Idade 1 é: " + idade[0]);
        System.out.println("Idade 2 é: " + idade[1]);
        System.out.println("Idade 3 é: " + idade[2]);

        //A bibblioteca java.util.Arrays, possui varios metodos para manipulaçao de arrays,
        //como por exemplo a Arrays.sort(idade) que serve para deixar os valores dentro do vetor
        //idade em ordem crescente.
        //Outro exemplo é o metodo Arrays.binarySearch(idade,15), esse metodo procura o valor 15 no
        //vetor idade e retorna a posiçao onde o numero 15 se encontra dentro do vetor. Caso o valor
        //procurado nao exista dentro do vetor entao a funçao vai retornar um valor invalido para a
        //posiçao do array, como -1 por exemplo.
        //Outro exemplo é o método Arrays.fill(idade,0), esse metodo preenche automaticamente todos
        //os espaços do vetor idade com 0.

        //OBS: no Java uma String e um vetor de char sao duas coisas diferentes.
    }
}
