package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        //Formas de inicializar um array:

        int[] numeros = new int[3]; //cria um array de 3 possiçoes e inicializa as posiçoes com o valor padrao.
        int[] numeros2 = {20, 25, 30}; // cria um array de 3 posiçoes(o java identifica isso automaticamente)
                                      // e ja inicializa as posiçoes com os respectivos valores entre as chavez.
        int[] numeros3 = new int[]{20,25,30};//Uma mistura dos dois primeiros, cria e inicializa automaticamente.
        // OBS: No terceiro modelo nao podemos colocar um valor dentro do segundo colchete pois ocasionará um erro
        // de compilaçao, tendo em vista que o java reconhece o tamanho automaticamente de acordo com a quantidade
        // de termos dentro das chavez.

        //Outro tipo de for: foreach
        for(float aux : numeros2) // O tipo da variavel aux deve ser compativel com o do array numeros2 e é
                                  // obrigatorio que o tipo seja declarado dentro do for.
                                  // O foreach pega cada valor do vetor numeros2 e joga na variavel aux, um a cada iteraçao, com
                                  // começando do index 0 e indo ate o ultimo.
        {
            System.out.println(aux);
        }
    }
}
