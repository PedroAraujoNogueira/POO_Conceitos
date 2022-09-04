package br.com.abc.javacore.Oexception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    public static void main(String[] args) {

        try{
            criarArquivo();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        abrirArquivo();
    }

    public static void criarArquivo()  throws IOException { //throws e throw são coisas diferentes, throws você diz que aquele
        //método pode lançar uma exceção, e quem chamar já sabe e pode se preparar. Throw você está realmente lançando a exceção.
        //Se você LANÇAR uma exceção do tipo checked você obrigatoriamente precisa declarar no throws. Diferente de quando LANÇAMOS
        //uma exceçao do tipo unchecked onde é opcional declarar ou nao o throws.﻿


        File file = new File("teste.txt"); //Entre parenteses colocarmos o nome do arquivo que queremos criar.
        //OBS: aqui ainda nao criamos um arquivo, apenas criamos uma variavel de referencia e um objeto do tipo arquivo.

        try { //O try tenta executar as instruçoes dentro do seu bloco e caso nao consiga ele lança uma exceçao.

            //System.out.println("O arquivo foi criado? " + file.createNewFile()); tipo de retorno do metodo file.createNewFile() é boolean
            //e mesmo que ele esteja dentro de um System.out.println() ele criará um arquivo.

            file.createNewFile();//Aqui criamos um arquivo.
            //Somos obrigados a tratar essa instruçao ou relança-la usando o THOWS na assinatura do metodo, caso contrario nao irá
            //compilar, pois o metodo createNewFile() pode lançar uma exceçao do tipo checked(IOException).
            //Para fazermos o tratamento dessa exceçao podemos colocar em um bloco de segurança que "diz": tente executar essas instruçoes,
            //caso nao consiga siga por este outro caminho. Esse bloco é chamado de try{}catch{}.

            System.out.println("Arquivo criado."); //Caso ocorra tudo bem na instruçao que pode gerar uma exceçao, ou seja, caso nao
            //seja lançada uma exceçao, entao essa linha será executada e o catch será ignorado, porem se algo der errado, ou seja,
            //se for lançada uma exceçao, entao todo o restante do codigo dentro do try
            //será ignorado(nao será mais executado, nem mesmo apos o tratamento da exceçao) e o catch será executado.
        }
        catch(IOException e){ //Caso tenha alguma exceçao o catch irá pegar.
            //Dentro do parenteses deve ser criada uma variavel de referencia do tipo de exceçao que esse catch deve capturar.
            //Caso seja lançada alguma exceçao o próprio Java vai se encarregar de criar um objeto do tipo do THROWS do método que
            //gerou a exceçao, e fará a variavel de referencia do catch referenciar esse objeto, por isso a variavel de referencia criada no
            //parenteses do catch deve ser de um tipo(Classe) consistente com a possivel exceçao lançada, ou seja, do mesmo tipo(Classe)
            //ou de um tipo(Classe) mais generica(SuperClasse).

            e.printStackTrace();
            //BOA PRATICA DE PROGRAMAÇAO: NUNCA crie um catch sem nada dentro, apesar de nao gerar erro, isso dificulta para o cliente
            //ou outro programador entender oq aconteceu de errado. Para resolvermos esse problema podemos chamar a variavel de referencia
            //para chamar o metodo printStackTrace(). Esse metodo da um caminho ate o erro, indicando tudo que aconteceu ate a chemada do
            //problema. Cuidado: o metodo printStackTrace() tem o tipo de retorno void, logo nao podemos coloca-lo dentro de
            //um System.out.println(), pois gerará erro ja que nao podemos colocar dentro de um System.out.println() nenhum metodo que retorne
            //void.
            throw e; //Mesmo apos tratar a exceçao é interessante que ela seja relançada para que o metodo que a chamou tambem possa dar
            //a essa exceçao um tratamento de acordo com o que ele considere adequado.

        }
        /*Quando estamos lidando com exceçoes temos duas opçoes:
        - primeira: relançamos com thows para que o problema seja tratado no metodos que o chamou.
        - segunda: cria um try/catch para tratar essa exceçao.
        */
    }
    public static String abrirArquivo() { //Na verdade nao vamos abrir um arquivo, é somente para exemplificar o uso do bloco
                                                          //finally.
        try{
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //throw new IOException();
            //System.out.println("Escrevendo no arquivo");
            //System.out.println("Fechar o arquivo ou banco de dados");
            return "ValorQualquer";
        }catch(Exception e){
            //System.out.println("Fechar o arquivo ou banco de dados");
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally{//O bloco finally sempre será executado, independente se o try executou normalmente, ou se teve alguma exceçao e caiu no
            //catch ou ate mesmo se tivermos um return no try ou no catch.
            //No caso de haver um return o bloco finally será executado antes de o return voltar para o método que o chamou.
            /*O finally tem duas opçoes:
            - primeira: vir depois do catch. Essa é a opçao usual, bem mais comum.
            - segunda: vir depois do try, porem nesse caso removeriamos o catch.
             */
            //Nunca podemos criar um try sozinho, sempre tem que ter pelo menos o catch ou o finally acompanhando o try.

            System.out.println("Fechar o arquivo ou banco de dados");//Evita duplicaçao de codigo.
        }
        return "ValorQualquer";
        /*
        Para que serve um try-finally (sem o catch)? Se a intenção do try é executar um código que pode lançar uma exceção, por que
        nos absteríamos do bloco de código que captura essa exceção(vulgo catch) e colocaríamos apenas o finally? Sendo assim pq
        o try-finally ao invés de simplesmente deixar a exceção ocorrer?﻿
        Resposta do DevDojo:
        - É muito raro o uso, eu particularmente nunca usei, porém existem casos aonde você não consegue tratar a exceção no catch e precisa
        relançar ela. Então é comum você ver por aí códigos com catch que só relança a exceção. O try - finally entraria no caso aonde
        você não tem como tratar a exceção no momento, vai apenas relançar, porém precisa limpar um recurso, fechar uma conexão etc. aí
        você usa o try-finally.﻿
         */

    }
}
