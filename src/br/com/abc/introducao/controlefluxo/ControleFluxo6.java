package br.com.abc.introducao.controlefluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //porém as parcelas nao podem ser menores que 1000 reais.

        double valorTotal = 30000;
        for(int parcela = (int) valorTotal;  parcela >= 1; parcela-- ) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela <= 1000) {
                continue;
                //Se colocarmos uma mensagem ou comando abaixo desse continue teremos um erro, pois essa
                //instruçao nunca será avaliada.
            }
            System.out.println("O valor da parcela " + parcela + " é " + valorParcela);

        }
    }

}

//O comando continue faz o bloco ir para a proxima iteração do bloco
// pulando os comandos restantes daquela iteraçao.