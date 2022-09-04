package br.com.abc.javacore.Oexception.runtimeexception.teste;

public class RunTimeExceptionTeste {
    public static void main(String[] args) {

        Object o = null;
       // System.out.println(o.toString()); // NullPointerException

//        int a = 10;
//        int b = 0;
//        if(b != 0){
//            int c = a/b;
//            System.out.println(c);
//        }

        try {
            int[] z = new int[2];
            System.out.println(z[2]); // Lembrando que por ser uma exceçao do tipo RuntimeException nao seria obrigatorio que houvesse
            //um tratamento. Porem se esse codigo nao estivesse dentro de um try/catch ele geraria um erro em tempo de execuçao e o
            //programa pararia de funcionar, porem como esta dentro de um try/catch ele gera um erro, mas o codigo nao para de executar,
            //apenas segue o caminho do catch e apos o catch continua a executar o programa.
        }
        //      RuntimeException tmb funcionaria, porem é uma classe mais generica para esse problema, logo deve ser evitada.
        catch(ArrayIndexOutOfBoundsException e){ //Sempre tente pegar as classes das exceçoes mais especificas possiveis, pois ela
            //pode conter informaçoes valiosas sobre o erro, alem de outras vantagens.
            e.printStackTrace();
        }
        System.out.println("Fora do bloco catch");
        try{
              divisao(10,0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());//O getMensage() retorna uma String com o valor que foi passado no nosso construtor quando
            //criamos o IllegalArgumentException();
            e.printStackTrace();
        }

    }

    public static void divisao(int num1,int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Divisao por 0 nao é permitido."); //IllegalArgumentException é usada quando argumentos
            //"nao permitidos" sao passados. Dentro dos construtor podemos passar uma mensagem indicando o erro.
            //Quando o codigo encontra a palavra throw ele simplesmente para naquela linha e volta para o metodo que o chamou, é como se
            //fosse um return, logo as instruçoes abaixo dele nao serao mais executadas.
            //Como essa exceçao é do tipo RuntimeException entao nao precisamos criar um tratamento para ela no metodo que a chamou.
        }
        int resultado = num1/num2;
        System.out.println(resultado);
    }
}

/*
Exceçoes filhas da classe RunTimeException:
- Sao exceçoes que ocorrem em tempo de execuçao.
- ArithmeticException acontece quando tentamos fazer uma condiçao aritmetica que nao é permitida, por exemplo, um inteiro
  dividido por 0.
- NullPointerException acontece quando tentamos acessar um metodo ou atributo atraves de uma variavel de referencia,
  porem que essa variavel de referencia nao tem nenhum objeto em memoria sendo referenciado.
- ClassCastException acontece quando tentamos fazer casting utilizando polimorfismo e o objeto nao pode ser referenciado
  por aquela variavel de referencia. Visto em Polimorfismo.
- ArrayIndexOutOfBoundsException: acontece quando tentamos acessar um array em uma posiçao que nao existe.
*/