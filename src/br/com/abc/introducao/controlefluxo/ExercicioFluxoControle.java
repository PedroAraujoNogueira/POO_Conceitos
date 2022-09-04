package br.com.abc.introducao.controlefluxo;

public class ExercicioFluxoControle {
    public static void main(String[] args) {
        //Crie uma variavel salario e imprima se imposto:
        //Para salario < 1000 o imposto é de 5%
        //Para salario >= 1000 e salario < 2000 o imposto é de 10%
        //Para salario >= 2000 e salario < 5000 o imposto é de 15%
        //Para salario > 5000 o imposto é de 20%
        float salario = 1500f;
        double imposto;
        if (salario < 1000){
            imposto = salario * 0.05;
        }
        else if (salario >= 1000 && salario < 2000){
            imposto = salario * 0.10;
        }
        else if(salario >= 2000 && salario < 5000){
            imposto = salario * 0.15;
        }
        else{
            imposto = salario * 0.20;
        }
        System.out.println(imposto);
    }
}
