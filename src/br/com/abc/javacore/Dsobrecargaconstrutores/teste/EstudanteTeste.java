package br.com.abc.javacore.Dsobrecargaconstrutores.teste;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Pedro","1810431",new double[]{9,5,7,3},"08/11/2018");
        Estudante estuda = new Estudante();
        estudante.imprime();
        //Estudante estudante1;
        //estudante1.imprime();

    }
}
