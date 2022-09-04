package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Pedro");
        estudante.setIdade(-2);
        estudante.setNotas(new double[]{1.8,6.5,9.8});

        estudante.imprimirDados();
        estudante.statusDeAprovaçao();

        System.out.println(estudante);
        System.out.println(estudante.getNotas());
    }
}
// Alto acoplamento é uma coisa ruim, ou seja quanto mais uma classe "sabe" de outra classe é ruim. Uma classe deve interferir
// o menos possivel a outra.