package br.com.abc.javacore.Aintroducaoclasses.teste;
import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro); // Imprime um endereço pra o objeto carro.
        carro.modelo = "Fusca";
        carro.placa = "QMJ1029";
        carro.velocidadeMaxima = 120f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
