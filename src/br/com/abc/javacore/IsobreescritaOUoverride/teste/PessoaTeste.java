package br.com.abc.javacore.IsobreescritaOUoverride.teste;

import br.com.abc.javacore.IsobreescritaOUoverride.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        p.setNome("Pedro Araujo");
        p2.setNome("Raquel");
        p.setIdade(300);
        p2.setIdade(300);
        //System.out.println(p.getNome());
        System.out.println(p);
        System.out.println(p2);
    }
}
//Todas as classes sao filhas da classe Object.
//Por convençao métodos sobrescritos costumam ter em cima o termo: @override, para indicar que esse metodo foi sobrescrito.
/*
Por padrao do JAVA toda vez que tentamos imprimir uma variavel de referencia, o java chama um metodo da classe Object(ou da classe na qual esse
metodo foi sobrescrito) chamado de toString. Podemos modificar esse metodo para que sejam mostradas outras informaçoes ao inves de mostrar o
endereço da variavel de referencia.
 */
/*
Características da sobrescrita:
 - Na sobrescrita precisamos definir a assinatura do metodo exatamente igual como esta escrito na super classe.
   modificador de acesso: mesmo modificador de acesso ou um modificador de acesso menos restrito do que o da super classe.
   tipo de retorno: mesmo tipo de retorno ou um tipo de retorno variante da super classe.
 - Na sobreEscrita é substituido o metodo da classe Pai por o metodo da propria classe.
*/
