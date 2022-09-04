package br.com.abc.javacore.Fmodificadorestatico.teste;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;
import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class CarroTeste {
    // private String teste; Se criarmos essa variavel, entao...
    public static void main(String[] args) {
        // System.out.println(teste); ... nao poderiamos acessar ela dentro desse metodo pois ele é static
        // Carro.setVelocidadeLimite();
        // Carro.getVelocidadeLimite(); // Pode ser feito antes mesmo da criaçao de um objeto, pois
        // o atributo static e os metodos static estao vinculados a classe e nao ao objeto. O mesmo serve para metodos static.

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        // Cliente.getParcelas(); // caso nao houvesse sido criados as variaveis de referencias cliente e cliente1 os blocos de inicializaçao
        // estaticos seriam sido chamados da msm forma se houvesse alguma chamada a um atributo ou metodo estatico, ou seja, basta a classe
        // ser carregada de alguma forma pela JVM que o bloco de inicializaçao estatico será executado, diferente do bloco de inicializaçao
        // normal que precisa da criaçao de um objeto.

        // Cliente cliente2; Dessa forma o bloco de inicializaçao estatico nao vai ser carregado pois nesse caso a classe nao foi carregada,
        // existe apenas uma expectativa de que ela seja carregada.

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("##################");

        // c1.setVelocidadeLimite(220); // Problematico mudar o atributo velocidade limite dessa forma,
        // pois, embora funcione, da a entender que irá modificar apenas o objeto c1, quando na verdade todos os objetos
        // terão seus valores alterados para 220 pois o atributo velocidadeLimite é static, logo pertence
        // a classe.

        Carro.setVelocidadeLimite(200, cliente); // Como o atributo velocidadeLimite é static, entao para alterarmos
        // seu valor é aconselhavel chamar a classe, pois todo atributo static percente a classe.


        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}
