package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);// Passa uma copia dos valores de num1 e num2, portanto oq for anterado
                                           // em num1 e num2 dentro do metodo nao terá efeito em num1 e num2 fora do
                                           // metodo.
        System.out.println("Dentro do teste.");
        System.out.println(num1);
        System.out.println(num2);

    }
}
