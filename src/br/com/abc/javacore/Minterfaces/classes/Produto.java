package br.com.abc.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Transportavel {

    private String nome;
    private double preço;
    private double peso;
    private double preçoFinal;
    private double valorFrete;

    public Produto(String nome, double preço, double peso){
        this.nome = nome;
        this.preço = preço;
        this.peso = peso;
    }

    @Override
    public void calcularImposto() {
        this.preçoFinal = preço  + (preço*TRIBUTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preço/peso*0.1;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                ", peso=" + peso +
                ", preçoFinal=" + preçoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public double getPreçoFinal() {
        return preçoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
//Interface é como se fosse um contrato que vai dizer oq uma determinada classe deve fazer, mas nao como ela deve fazer.
//A interface é como se fosse uma classe abstrata, so que completamente abstrata, logo so poderá ter metodos abstratos na interface.
//Utilizamos interface pq ela pode servir como uma comunicaçao.
//Normalmente quando se cria uma interface se coloca um nome com terminaçao de adjetivo ou utiliza-se o I na frente da palavra.
//O objetivo da interface é ser implementada(implements).
//Em uma interface, por mais que vc nao coloque, todos os metodos vao ser considerados public e abstract, logo se tentarmos colocar corpo(codigo)
//em um metodo de uma interface isso gerará um erro de compilaçao.
//Todos os atributos de uma interface sao considerados CONSTANTE e estaticos, ou seja sao todos public static final.
//Quando implementamos uma interface somos obrigados a implementar os metodos, se a classe filha for abstract entao podemos somente
//copiar a assinatura do metodo abstract e passar a responsbilidade de realmente implementar o metodo para a proxima classe e assim por diante.
//Podemos implentar mais de uma interface em uma classe, enquanto so podemos estender uma classe abstrata em uma classe.
//Produto É UM tributavel É UM transportavel.
//REGRA DA SOBRESCRITA:
//Quando criamos um metodo que está sendo sobrescrito em uma sub-classe o modificador de acesso no metodo da sub-classe
//nao pode ser mais restritivo do que o modificador de acesso do metodo na classe Pai(Tambem serve para interfaces), logo todo metodo
//sobrescrito de uma interface tmb deve ter seu modificador de acesso public.
//Podemos criar uma variavel de referencia do tipo interface, porem nao podemos criar um objeto do tipo interface(interfaces
//nao sao instaciadas).
//Em Java apenas as Interfaces não possuem construtores.
//É possível usar o extends e o implements na mesma classe, por exemplo, poderia ser feito:
//public class Biscoito extends Produto implements Tributavel, Transportavel{..........}