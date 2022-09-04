package br.com.abc.javacore.Lclassesabstratas.teste;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Raquel", "203040", 1000);
        Vendedor vendedor = new Vendedor("Pedro", "1810431", 1000, 5000);
        gerente.calculaSalario();
        Funcionario f = new Vendedor();
        vendedor.calculaSalario();
        System.out.println(gerente);
        System.out.println(vendedor);

    }
}
