package br.com.abc.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2]; // O java so exige que seja definido um numero no primeiro colchete.
                                      // Nesse caso temos um array de 2 posiçoes onde cada posiçao referencia outro
                                      // array de duas posiçoes.
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]); // Nessa linha é impresso o endereço de memoria de cada posiçao do array original;
            for(int j = 0; j < dias[i].length;j++)
            {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------------");
        for(int[] aux1 : dias) // aux1 é uma referencia a um array de inteiros.
        {
            System.out.println(aux1);
            for(int aux2: aux1)
            {
                System.out.println(aux2);
            }
        }

    }
}
