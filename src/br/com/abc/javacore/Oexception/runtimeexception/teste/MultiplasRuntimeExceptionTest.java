package br.com.abc.javacore.Oexception.runtimeexception.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }
        // Regra: quando temos multiplos catch devemos colocar sempre os catch das super classes abaixo dos catch das classes filhas, ou
        // seja, devemos começar com os catch de classes mais especificas e posteriormente colocar os catch de classes mais genericas,
        // caso contrario haverá um erro em tempo de compilação.
        catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }
        catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        // Quando temos multiplos catch o JAVA vai procurando em qual deles a exceção se encaixa. A exceção pode ser tratada somente
        // por um catch, que será aquele que primeiro se encaixar com a exceção.
        // Caso a exceção nao se encaixe em nenhum dos catch, então a exceção nao será tratada e o programa para de funcionar.

        try{
            talvezLanceUmaExcecao();
        }
        catch(SQLException e){

        }
        catch(FileNotFoundException e) { // Se comentarmos esse catch teremos um erro em tempo de compilação, pois
            // o método "talvezLanceUmaExcecao" pode lançar dois tipos de exceçoes e devemos colocar catch para tratar qualquer
            // uma das duas caso elas ocorram.

        }
    }
    private static void talvezLanceUmaExcecao() throws SQLException, FileNotFoundException{

    }
}