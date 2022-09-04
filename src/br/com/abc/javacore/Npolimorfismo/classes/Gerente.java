package br.com.abc.javacore.Npolimorfismo.classes;

public class Gerente extends Funcionario {

    private double pnl;

    public Gerente(String nome, double salario, double pnl){
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public double calculaPagamento(){
        this.salario = this.salario + pnl;
        return 0;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
