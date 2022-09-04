package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtracaoDoisNumeros();
        calc.multiplicacaoDoisNumeros(5,5); // Passagem de argumentos;

        System.out.println(calc.divideDoisNumeros(220.765, 2));

        double result = calc.divideDoisNumeros(37.98, 10);
        System.out.println(result);

        System.out.println("Continuando a execução.");

        int[] numeros = {1,2,9,10,5};
        calc.somaArray(numeros);

        // Usando o metodo com parametro do tipo varags ele aceita como argumento tanto ARRAYs como uma sequencia
        // de numeros aleatoria, pois dentro do parametro ele vai organizar esses numeros em sequencia
        // em um array da mesma forma, essa é a grande vantagem de se usar varargs.

        calc.somaVarargs(numeros);
        calc.somaVarargs(1,5,15);
    }
}
