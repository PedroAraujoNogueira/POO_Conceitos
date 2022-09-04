package br.com.abc.javacore.Npolimorfismo.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(String nome, double Salario, double totalVendas){
        super(nome, Salario);
        this.totalVendas = totalVendas;
    }



    @Override
    public double calculaPagamento(){
       return this.salario = this.salario +(totalVendas*0.05);
    }


    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
