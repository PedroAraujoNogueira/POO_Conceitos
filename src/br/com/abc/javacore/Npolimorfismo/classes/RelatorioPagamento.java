package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para a gerencia.");
//        gerente.calculaPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario: " + gerente.getSalario());
//
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para os vendedores.");
//        vendedor.calculaPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){ //Parametro polimorfico se da quando ao inves de declararmos um parametro
        //especifico nós declaramos um parametro mais genérico, no qual este parametro pode fazer referencia a objetos mais específico, ou seja,
        //objetos de suas sub-classes.

        System.out.println("Gerando relatorio de pagamento para os vendedores.");
        funcionario.calculaPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        if(funcionario instanceof Gerente){ //O operador instaceof retorna verdadeiro ou falso dependendo se o objeto, na qual a variavel de
                                            //referencia testada aponta, é de um tipo/classe igual ou consistente(mesma classe ou classe filha)
                                            //ao da classe que está há direita do operador.


            // Gerente g = (Gerente) funcionario; //Para fazermos a atribuiçao de uma variavel de referencia de um tipo mais genérico para
                                                  //uma variável de referência de um tipo mais específico precisamos de um casting explícito.
                                                  //caso contrário haverá erro em tempo de compilaçao;
            System.out.println("A participaçao nos lucros foi de: " +  ((Gerente)funcionario).getPnl());
        }
        if(funcionario instanceof Vendedor){
            // Vendedor v = (Vendedor) funcionario; //Para fazermos a atribuiçao de uma variavel de referencia de um tipo mais genérico para
                                                    //uma variável de referência de um tipo mais específico precisamos de um casting explícito.
                                                    //caso contrário haverá erro em tempo de compilaçao;
            //OBS: mesmo com o casting explícito há a possibilidade de haver erro em tempo de execuçao, caso funcionario esteja apontando para
            //uma variavel de referencia diferente de vendedor, como por exemplo outra classe filha de funcionario que nao seja vendedor ou
            //filha de vendedor.

            System.out.println("A participaçao nos lucros foi de: " + ((Vendedor)funcionario).getTotalVendas()); //Podemos fazer um casting
            //direto, ou seja, sem precisar instanciar uma variavel de referencia. Quando fazemos ((Vendedor)funcionário) entao tudo isso é como
            //se fosse uma variavel do tipo Vendedor, logo podemos chamar getTotalVendas que é um método da classe Vendedor.
        }
    }

}
//Casting Widening: é quando uma variavel de referencia de um tipo de uma superClasse, ou seja uma classe mais generica, faz referencia
//a uma sub-Classe(variavel mais específica). Nao gera erro de compilaçao.
//Para fazermos a atribuiçao de uma variavel de referencia de um tipo mais genérico para
//uma variável de referência de um tipo mais específico precisamos de um casting explícito.
//caso contrário haverá erro em tempo de compilaçao;
//OBS: mesmo com o casting explícito há a possibilidade de haver erro em tempo de execuçao, caso funcionario esteja apontando para
//uma variavel de referencia diferente de vendedor, como por exemplo outra classe filha de funcionario que nao seja vendedor ou
//filha de vendedor.