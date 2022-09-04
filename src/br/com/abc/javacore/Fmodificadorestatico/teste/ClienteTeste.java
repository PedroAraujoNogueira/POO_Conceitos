package br.com.abc.javacore.Fmodificadorestatico.teste;


import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis.");
//        for(int auxParcela : c.getParcelas()){
//            System.out.print(auxParcela + " ");
//        }
        System.out.println("Tamanho: " + Cliente.getParcelas().length);

    }
}
