package br.com.abc.introducao.controlefluxo;

public class ControleFluxo5 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //porém as parcelas nao podem ser menores que 1000 reais.
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = 1;parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("O valor da parcela " + parcela + " é " + valorParcela);
        }
        //O comando continue faz o bloco ir para a proxima iteração do bloco
        // pulando os comandos restantes daquela iteraçao.
    }
}
// O comando break faz sair do bloco de iteraçao mais interno, ou do switch mais interno.
