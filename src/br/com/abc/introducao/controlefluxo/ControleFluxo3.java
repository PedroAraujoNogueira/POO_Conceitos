package br.com.abc.introducao.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        //Na instrução switch os tipos que sao validos dentro do parenteses da instruçao sao:
        //int, byte, short, char, enum e String.
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break; //Comando que faz o programa sair daquele bloco de instruçoes após ser encontrado.
                       //Nesse caso sairemos do bloco de instruçao switch, nao testando porem as instruçoes seguintes.
                       //O comando break so pode ser usado se estiver dentro dos laços while, do..while,
                       //for e do controle de
                       //fluxo switch, direta ou indiretamente dentro, no caso de estruturas aninhadas.
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
        }
        char sexo = 'F'; //Poderiamos usar o tipo por referencia String tambem, apenas lembrando de trocar as aspas
                         //simples por aspas duplas.
        switch(sexo){
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default: // comando usado no switch para caso nenhum dos case tenha sido encontrado.
                     //A opçao default nao precisa ser necessariamente a ultima, porem costuma-se colocar ele por
                     //ultimo por questao de organizaçao e facilidade de leitura.
                System.out.println("Opçao invalida");
        }
    }
}
