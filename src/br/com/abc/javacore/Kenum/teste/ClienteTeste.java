package br.com.abc.javacore.Kenum.teste;

import br.com.abc.javacore.Kenum.classes.Cliente;
import br.com.abc.javacore.Kenum.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
