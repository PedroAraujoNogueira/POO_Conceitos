package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
       /*
       As variaveis de instancia de tipo primitivo sao inicializadas por
       padrao - byte, short, int, double, float e long sao inicializadas como 0, as variaveis boolean
       sao inicializadas como false e as variaveis char sao inicializadas com vazio(' ').
       Lembre - se de que as variaveis locais nao sao inicializadas por padrao. */
       /*
       As variaveis de instancia de tipo por referencia sao inicializadas por padrao com o valor null(uma palavra
       reservada que representa uma "referencia a nada".
       */
       String[] nomes = new String[4]; //primeira regra do array: Sempre que criar um array deve definir o tamanho dele.
                                       //segunda regra do array: nao pode ser mudado o tamanho do array em tempo
                                       //de execuçao(uma vez criado).
        System.out.println(nomes.length); //nomes.length retorna o tamanha do array nomes
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Pedro";
        nomes[3] = "Priscila";

        for(int i = 0; i < nomes.length; i++){

            System.out.println(nomes[i]);
        }
        nomes = new String[5];  //Nessa linha é criado um novo espaço na memoria com 5 posiçoes e entao o antigo array
                                //"nomes" deixa de existir, pois aquela referencia ao array de 4 posiçoes nao existe mais,
                                //logo nao é mais possivel acessar os valores que estavam na antiga referencia.
                                //O proprio programa java vai se encarregar de apagar o antigo array da memoria pois nao
                                //é mais possivel acessa-lo.

    }
}
