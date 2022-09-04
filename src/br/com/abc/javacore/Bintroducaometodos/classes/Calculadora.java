package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtracaoDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicacaoDoisNumeros(int num1, int num2) // Declaraçao de parametros;
    {
        System.out.println(num1 * num2);
    }
    // No Java a sintaxe para criarmos metodos é a seguinte:
    // Primeiro: precisamos de um modificador de acesso(public, private, protected).
    // Segundo: o tipo de retorno.
    // Terceiro: o nome do método, começando com letras minusculas e seguindo a tecnica de camelCase para as palavras seguintes.
    // OBS: todo metodo deve ter parenteses.
    // OBS: O tipo do metodo pode ser um tipo primitivo ou qualquer variavel do tipo reference.
    // OBS: um metodo public significa que ele pode ser acessado de qualquer lugar(classe).

    public double divideDoisNumeros(double num1, double num2) {
        //double resultado = num1/num2;
        //return resultado;
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0; // Um return sem nada (ex: return;) serve para dar um break em um metodo do tipo void.
        // OBS: Nao é obrigatorio que apos esse metodo terminar sua execuçao o returno seja armazenado em algum canto da
        // classe principal, ou seja, temos apenas que garantir que tenha um retorno, mas nao é obrigado que ele seja usado
        // ou sequer armazenado por alguma variavel da classe que o chamou.
    }

    public void alteraDoisNumeros (int num1, int num2){
            num1 = 30;
            num2 = 40;
        System.out.println("Dentro do alteraDoisNumeros.");
        System.out.println(num1);
        System.out.println(num2);
    }
    //OBS: Nao podemos colocar dentro de um System.out.println a chamada há um metodo que retorne void.
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int aux : numeros){
         soma += aux;
        }
        System.out.println(soma);
    }
    public void somaVarargs (int... numeros){
        int soma = 0;
        for(int aux : numeros){
            soma += aux;
        }
        System.out.println(soma);
    }
    // Em algumas situações podemos querer criar uma função que não sabemos de antemão quantos argumentos
    // serão necessários. Veja como exemplo um programa que calcule uma soma. Em determinado momento
    // você quer somar só dois números, mas em outro momento pode querer somar 7 números.
    // Varargs (vários argumentos) serve exatamente para isso.

    // Os três pontos significam que você está usando varargs e que pode aceitar vários argumentos. Os tres pontos precisam ser
    // obrigatoriamente depois do tipo da variavel.
    // Os argumentos que forem passados vão ficar armazenados em um vetor. O Varargs
    // se encarrega de por baixo dos panos fazer um array com a quantidade de argumentos passados para o Varargs .O codigo em
    // si do metodo que tem um parametro Varargs nao muda em nada comparado ao codigo caso estivesse usando uma referencia
    // ha um vetor.

    // Você também pode combinar tipos diferentes de parametros, mas a regra é que o ultimo parametro
    // declarado deve ser o varargs. Tambem so podemos ter um varargs por assinatura de metodo.



}
