package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // Operadores de atribuição:
        // =
        // += , exemplo: x += y é equivalente a colocarmos x = x + y
        // -= , exemplo: x -= y é equivalente a colocarmos x = x - y
        // *= , exemplo: x *= y é equivalente a colocarmos x = x * y
        // /= , exemplo: x /= y é equivalente a colocarmos x = x / y
        // %= , exemplo: x %= y é equivalente a colocarmos x = x % y
        int salario = 1800;
        salario += 1000;
        System.out.println(salario);
    }
}
