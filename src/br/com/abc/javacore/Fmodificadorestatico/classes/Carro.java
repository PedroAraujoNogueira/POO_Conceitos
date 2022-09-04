package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    // Supomos que existe uma lei que diz que a velocidade limite deve ser de 240km/h.
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240; // Atributos static fazem parte da classe e nao de um objeto isolado,
    // logo se trocarmos o valor de um atributo static para um objeto, todos os objetos daquela classe
    // terao seu msm atributo trocado para o mesmo valor.
    // static private double velocidadeLimite = 240; Para criarmos atributos estaticos ou metodos estaticos
    // podemos colocar o static antes ou depois do modificador de acesso.

    public void imprime() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + velocidadeLimite); // O this serve para referenciar
        // o objeto da classe que chamou o metodo imprime, porem como velocidadeLimite é um atributo
        // static, ou seja, nao faz parte do objeto e sim pertence a classe, entao nao podemos colocar o this.
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /* public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
    */
    // Metodos static tambem pertencem a classe, nao a um objeto especifico.
    // Dentro de metodos static nao podemos acessar atributos nao static DA CLASSE e nem fazer chamadas a outros
    // metodos da mesma classe que nao sejam estaticos.
    // Podemos transformar qualquer metodo em metodo static contanto que eles nao estejam acessando
    // atributos de classe, ou seja, contando que eles nao estejam acessando atributos nao static(ou metodos nao estaticos).

    public static void setVelocidadeLimite(double velocidadeLimite, Cliente cliente){
        //System.out.println(this.nome); Da erro pois este é um atributo nao static da classe e pela ordem de inicializaçao do java
        // esse atributo ainda nao existe.
        System.out.println(cliente.getNome());// Nao gera erro pois é uma variavel criada na declaraçao do metodo, ou seja, uma variavel
        // local criada junto com a criaçao do metodo.
        String nome = "Pedro"; // nao gera erro pois é uma variavel local logo ela é criada junto com o metodo static.
        System.out.println(nome);
        Carro.velocidadeLimite = velocidadeLimite; // colocamos o Carro na frente da variavel de Classe  para o compilador saber que
        // queremos usar a variavel Static da classe e nao a variavel local do metodo ja que a variavel local do metodo tem preferencia.
    }

    // static private void setVelocidadeLimite(double velocidadeLimite); Para criarmos metodos estaticos podemos colocar o static
    // antes ou depois do modificador de acesso.

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

}
