package br.com.abc.javacore.Npolimorfismo.classes;

public abstract class Funcionario {
    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String toString(){
        return "Nome: " + nome + ", salario: " + salario;
    }

    public abstract double calculaPagamento();

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
