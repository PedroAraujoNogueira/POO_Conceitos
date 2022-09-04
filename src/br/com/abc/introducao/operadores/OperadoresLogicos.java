package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // && = and
        // || = or
        // & e | para operaçoes de AND e OR bit a bit.
        int idade = 18;
        float salario = 1000f;
        System.out.println(idade > 20 && salario < 2000);
        System.out.println(idade >=18 && salario > 900);
        System.out.println(idade > 10 || salario < 900);
        System.out.println(idade < 18 || salario > 2000);

    }
}
