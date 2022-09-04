package br.com.abc.javacore.Npolimorfismo.teste;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedro", 5000, 2000 );
        Vendedor vendedor = new Vendedor("Priscila", 2000, 20000 );
        RelatorioPagamento relatorio = new RelatorioPagamento();
        // relatorio.relatorioPagamentoGerente(gerente);
        // System.out.println("---------------------------");
        // relatorio.relatorioPagamentoVendedor(vendedor);

        relatorio.relatorioPagamentoGenerico(gerente);
        System.out.println("---------------------------");
        relatorio.relatorioPagamentoGenerico(vendedor);

       //Funcionario funcionario = gerente;
       // System.out.println("##################");
       // System.out.println(funcionario.getSalario());

    }
}
//Polimorfismo só é possível quando trabalhamos com herança.

//            PARAMETROS POLIMORFICOS:
//Podemos passar como argumento gerente ou vendedor apesar de a funçao ter como parametro uma variavel do tipo funcionario,
//pois funcionario é uma superClasse de gerente e vendedor.
//Podemos criar uma variavel de referencia de uma super classe e essa variavel referenciar um objeto da subClasse, assim como tambem
//podera chamar os metodos da subClasse, contanto que esses metodos tmb estejam na superClasse.
//A variavel de referencia é como se fosse um controle remoto, ela diz oq pode ser feito, ou seja, so poderá ser feito oq tiver definido no
//tipo da classe da variavel de referencia, porem quem executa a açao é sempre o objeto.
//A vantagem de programar orientado a interface, porque temos um codigo com mais facilidade de manutençao.
//Casting Widening: é quando uma variavel de referencia de um tipo de uma superClasse, ou seja uma classe mais generica, faz referencia
//a uma sub-Classe(variavel mais específica). Nao gera erro de compilaçao.
