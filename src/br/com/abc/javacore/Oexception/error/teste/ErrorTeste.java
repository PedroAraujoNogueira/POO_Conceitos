package br.com.abc.javacore.Oexception.error.teste;

public class ErrorTeste {
    public static void main(String[] args) {

        stackOverFlowError();

    }

    public static void stackOverFlowError(){
        stackOverFlowError();
    }

}
//Exceçoes no java acontecem quando o codigo nao flui naturalmente. As exceçoes foram criadas para tratarmos os imprevistos
//que podem acontecer no nosso codigo.

/*
Exceçoes sao classes e todas elas sao filhas da classe throwable(jogável). As duas classes filhas
de throwable sao: Error e Exception, onde na classe Exception sao as exceçoes que podem ou devem ser tratadas e
na classe Error sao as "exceçoes" que afetam drasticamente o programa, nao podendo ser tratadas e
fazendo o programa parar de funcionar.
*/

/*
Quando temos um problema de stackOverFlowError significa que a pilha estourou o espaço disponivel na memoria, normalmente
acontece quando um metodo chama ele mesmo repetitivamente, e para esse imprevisto nao temos oq fazer,
seu programa irá parar de funcionar, logo entra na "exceçao" da classe Error. Stack é como chamamos uma pilha em java.
*/

/*
Error ate pode tentar ser tratado, porem nao adianta.
Error e Exceptions sao lançados, significa que quando temos um metodo no topo da pilha e caso esse metodo lance uma
exceçao ou error e essa exceçao ou error nao for tratada a responsabilidade de tratar passará para o metodo que o chamou(como se fosse
um return, ou seja, o metodo que nao foi tratado sai da pilha e nao é mais executado), e isso acontecerá até que algum metodo trate
aquela exceçao ou error ou, caso chegue na MAIN e nem a MAIN nem qualquer outro metodo trate essa exceçao ou error o seu programa
ira parar de funcionar. Por isso que dizemos que Exception e Error sao lançados. Error ate pode tentar ser tratado, porem nao adianta,
logo msm que tentemos tratar error ele mesmo assim chegará no metodo MAIN sem ser tratado e será inevitavel que o programa
pare de funcionar.
*/

//A classe Error tecnicamente para termos de certificaçao nao é considerado uma Exception, ou seja, nao é considerada uma exceçao de fato,
//pois nao é filha desta classe(Exception), ela apenas é considerada uma "exceçao" pois é algo imprevisto que acontece no programa, mas
//tecnicamente deve ser chamada apenas de erro e nao de exceçao.

/*
  Temos duas palavras mto importantes quando estamos trabalhando com exceçoes: checked(checado) e unchecked(nao checado).
- Nas exceçoes do tipo checked nos sempre seremos obrigados a criar algum tipo de tratamento para aquela exceçao, caso
  contrario nao conseguiremos compilar nosso programa. Sao exceçoes que estao alem do controle do programador. Exceçoes do tipo
  checked: todas as exceçoes(incluindo a Exception) filhas de Exception sao do tipo checked.
- Nas exceçoes do tipo unchecked nos nao precisamos criar nenhum tipo de tratamento para o codigo compilar. Geralmente
  a maioria das exceçoes unchecked sao erros de logica de programçao, ou seja, erros do programador. Exceçoes do
  tipo unchecked: todas as exceçoes(incluindo a RunTimeException) filhas de RunTimeException sao consideradas unchecked.
*/

