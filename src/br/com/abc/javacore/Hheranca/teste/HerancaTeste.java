package br.com.abc.javacore.Hheranca.teste;

import br.com.abc.javacore.Hheranca.classes.Endereço;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTeste {
    //SEQUENCIA DE INICIALIZAÇAO DE OBJETOS QUE ESTENDEM DETERMINADA CLASSE:
    // Quando criamos um objeto de uma classe filha, a JVM primeiro carrega
    // 1. O bloco de inicializaçao estatico da classe Pai.
    // 2. O bloco de inicializaçao estatico da classe filha.
    // 3. O restante da classe Pai, ou seja, os seus blocos de inicializaçao normais e o construtor.
    // 4. O restante da classe Filha, ou seja, os seus blocos de inicializaçao normais e o construtor.

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pedro");
        Endereço end = new Endereço();
        p.setCpf("04255149356");
        end.setBairro("Patriolino Ribeiro");
        end.setRua("Manoel Firmino Sampaio");
        p.setEndereco(end);
        p.imprime();
        System.out.println("----------------");
        Funcionario funcionario = new Funcionario();
        // Funcionario funcionario1 = new Funcionario("Priscila");
        funcionario.setNome("Pedro Araujo");
        funcionario.setCpf("111122223333");
        funcionario.setEndereco(end);
        funcionario.setSalario(15000);
        funcionario.imprime();

    }
}
// De forma geral a herança deve ser pouco utilizada. Atualmente a composição é considerada muito superior à herança na maioria dos
// casos pois entre as suas principais vantagens a composição permite mudar a associação entre classes em tempo de execução,
// os objetos podem assumir mais de um comportamento, os projetos são mais simples e reutilizáveis, além de descartar os problemas
// envolvendo a herança como o acoplamento entre as classes e outros problemas discutidos.
