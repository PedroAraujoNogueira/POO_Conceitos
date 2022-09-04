package br.com.abc.javacore.Jmodificadorfinal.classes;

public class Carro {
    public static final double VELOCIDADE_FINAL = 250;
    private final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String placa;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
/*
O modificador final tem varias utilidades dependendo de onde se usa: voce pode usa-lo em metodos, em atributos e ainda na declaraçao
da classe.
 - Quando colocamos um modificador final em um atributo somos obrigados a inicializalo, pq nao podemos mudar esse valor futuramente entao nao
   poderiamos, por exemplo, deixar o valor padrao do atributo e depois atribuir um valor, temos que obrigatoriamente inicializalo. Podemos ini
   cializalo tmb no construtor caso o atributo nao seja static final, caso seja podemos inicializalo em um bloco de inicializaçao static.
 - porque eu nao posso inicializar variaveis finais ( CONSTANTES ) em metodos?﻿ Pq antes de você usar uma variável final ela tem que
   estar iniciada, e não dá pra garantir que um método sempre será executado.﻿
 - Atributos finais sao escritos em letras maiusculas e com o separador "_"(anderline) entre palavras(palavras compostas).
 - Nas variaveis finais nao podemos mudar seu valor apos o valor ter sido atribuido, no caso de variaveis de referencias finais nao
 podemos atribuir uma nova variavel de referencia a ela, porem podemos alterar os valores dentro do objeto.
 - Quando utilizamos o modificador final em classes significa que aquela classe nao poderá ser estendida, ou seja, aquela classe nao
 poderá ser pai de ninguem, logo tmb nao poderao ser modificados os metodos dessa classe atraves de sobrescrita.
 - Quando utilizamos o modificador final em um metodo isso impede que esse metodo seja sobrescrito, ou seja, é util para quando temos
uma classe que nao é final, porem queremos que algum ou alguns metodos daquela classe nao sejam sobrescritos, entao usamos o modificador
final naquele metodo impedindo que ele seja sobrescrito. Podemos ate fazer a sobrecarga, mas nao a sobrescrita daquele metodo.
*/