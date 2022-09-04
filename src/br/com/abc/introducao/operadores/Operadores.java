package br.com.abc.introducao.operadores;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // Ficar atento aos parenteses pois após escrever algo no print todos os simbolo de "+" apos o texto
        // deixam de significar soma e passam a significar concatenaçao.
        System.out.println(num1+num2);
        System.out.println("A soma é " + (num1+num2));
        System.out.println("A multiplicaçao é " + (num1*num2));
        System.out.println("A divisão é " + (num1/num2)); // divisao entre dois numeros inteiros gerará um numero inteiro
        System.out.println("O resto da divisão é " +(num1%num2));
        int resto = 20%2;
        System.out.println(resto);
    }
}
