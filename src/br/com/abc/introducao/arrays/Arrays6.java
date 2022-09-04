package br.com.abc.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int i = 5;
        int[][] arrInt = new int[i][]; // Criei um array multi-dimensional porém só defini o primeiro colchete
                                       // (que é obrigatorio ser definido), e pelo visto por ser definido através
                                       // de uma variavel pré definida.

        arrInt[0] = new int[2]; // Aqui sao definidos arrays com tamanhos diferentes, sao 5 arrays, cada um
        arrInt[1] = new int[3]; // com referencia a um espaço do primeiro colchetes.
        arrInt[2] = new int[6];
        arrInt[3] = new int[10];
        arrInt[4] = new int[i];

        for(int[] aux1 : arrInt){
            System.out.println(aux1);
            for(int aux2 : aux1){
                aux2 = i*1;
                i++;
                System.out.println(aux2);

            }
        }

        for(int a = 0; a < arrInt.length; a++){
            System.out.println(arrInt[a]); // Nessa linha é impresso o endereço de memoria de cada posiçao do array original;
            for(int j = 0; j < arrInt[a].length;j++)
            {
                System.out.println(arrInt[a][j]);
            }
        }

         int[][] arrInt2 = {{4,3},{11,23},{1,5}};//Aqui temos um array de 3 posiçoes onde cada posiçao faz referencia a outro array.
         int[][] arrInt3 = new int[][]{{0,20,3},{40,5,5,9,0},{30,31,31,32,33,34,35}};

    }
}
