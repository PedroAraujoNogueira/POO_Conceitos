package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 18;
        String status;

        /*if (idade < 18){
            status = "Não adulto";
        }
        else{
            status = "Adulto";
        }
        */
        //Na linha de baixo está o operador ternário que pode substituir um ou varios IF e ELSE.
        //Uma condição que retorna um valor booleano é avaliada antes do ponto de interrogação, se
        //a expressão retornar verdadeiro entao o primeiro resultado(o que está antes dos dois pontos) será executado
        //se a expressão retornar um valor falso entao o valor apos os dois pontos será execultado e transferido para
        //a variavél.
        status = idade < 18? "Não adulto" : "Adulto";
        System.out.println(status);

        // (idade < 15) infantil
        // (idade >=15 && idade < 18) juvenil
        // (idade >= 18) adulto

        status = idade < 18? "Infantil" : (idade >=15 && idade < 18) ? "Juvenil" : "Adulto";
        System.out.println(status);
        //Os tipos das respostas tem que bater com o tipo da variavel status, que nesse caso é uma String.
    }
}
