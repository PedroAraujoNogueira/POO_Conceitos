package br.com.abc.javacore.Csobrecargametodos.teste;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro","042.551.493-56",1400.50, "2009001990" );
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
        funcionario2.imprime();
    }
}
