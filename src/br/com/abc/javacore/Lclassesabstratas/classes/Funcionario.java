package br.com.abc.javacore.Lclassesabstratas.classes;

public abstract class Funcionario extends Pessoa {

    protected String clt;
    protected double salario;

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public abstract void calculaSalario();

    @Override
    public void imprime() {
        System.out.println("Dentro do imprime de funcionario.");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

//  Classes abstratas:
//- Nunca poderemos criar uma instancia(objeto) de uma classe abstrata, ou seja nunca poderemos usar new usando como Tipo
//  uma classe abstrata, porem podemos declarar um objeto na qual a variavel de referencia seja do tipo de uma classe abstrata e o objeto seja
//  do tipo de uma classe nao abstrata. Se tentarmos criar uma instancia(objeto) de uma classe abstrata teremos um erro em tempo de
//  compilação.
//- Classes abstratas sao criadas como uma decisao arquitetural.
//- Classes abstratas podem conter metodos abstratos.
//- Metodos abstratos sao metodos que nao possuem implementaçao, ou seja, nao possuem corpo(codigo).
//- Classes abstratas sao feitas exclusivamente para serem estendidas, logo nao podemos usar o modificador final e o abstract
//  na mesma declaraçao da classe.
//- Quando criamos um metodo abstrato obrigatoriamente temos que transformar a classe em abstrata, ou seja, uma classe abstrata
//  pode nao ter nenhum metodo abstrato, porem se tivermos um metodo abstrato aquela classe obrigatoriamente devera ser abstrata.
//- Metodos abstratos sao metodos que deverao ser obrigatoriamente sobrescritos, ou seja, quando criamos um metodo
//  abstrato deveremos OBRIGATORIAMENTE sobrescrever esse metodo na classe filha nao abstrata seguinte, ha nao ser que a classe abstrata que
//  possui esse metodo abstrato tenha uma classe filha tmb abstract que sobrescreva esse metodo tornando-o nao abstract, dessa forma
//  nao sera mais obrigatoria a sobrescrita na primeira filha nao abstract.
//- Teremos metodos nao abstratos em uma classe abstrata quando esse metodo for utilizado por todas as classes filhas da mesma forma.
//- Classes abstratas podem estender outras classes abstratas ou classes nao abstract.