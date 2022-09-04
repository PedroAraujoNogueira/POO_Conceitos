package br.com.abc.javacore.Jmodificadorfinal.teste;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        // Carro.VELOCIDADE_FINAL = 100; ocorreu um erro em tempo de compilaçao, pois o atributo VELOCIDADE_FINAL é final, logo nao
                                      // pode ser alterado.
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
    }
}
