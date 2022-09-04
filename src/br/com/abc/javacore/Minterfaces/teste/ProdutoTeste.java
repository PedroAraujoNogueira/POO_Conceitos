package br.com.abc.javacore.Minterfaces.teste;

import br.com.abc.javacore.Minterfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3000, 4);
        produto.calcularImposto();
        produto.calculaFrete();
        System.out.println(produto);
    }
}
