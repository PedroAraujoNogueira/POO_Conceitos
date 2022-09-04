package br.com.abc.javacore.Npolimorfismo.teste;


import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoGenerico = new ArquivoDAOImpl();
        arquivoGenerico.save();

    }
}
