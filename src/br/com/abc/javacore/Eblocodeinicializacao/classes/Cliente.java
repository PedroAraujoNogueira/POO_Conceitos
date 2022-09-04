package br.com.abc.javacore.Eblocodeinicializacao.classes;


public class Cliente {
    //REGRA DE INICIALIZAÇAO DO JAVA:
    //1 - Alocação de espaço na memória para o objeto que será criado.
    //2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explícitos.
    //3 - Bloco de iniciaização é executado.
    //4 - O construtor é executado.

    //CARACTERISTICAS DO BLOCO DE INICIALIZAÇÃO:
    // Uma outra forma que temos para inicializar objetos alem dos construtores.
    // Blocos não-estáticos são usados quando se quer acrescentar um comportamento
    // a ser executado por todos os construtores dessa classe.
    //1. Não recebe parametros, não possuem retorno, nem nome, nem modificador de acesso.
    //2. É executado antes do construtor.
    //3. As boas praticas dizem para cria-lo antes do construtor, porem independente de onde
    //   ele for criado dentro da classe ele será executado antes do construtor.
    //4. Para criar um bloco de inicialização basta apenas abrir e fechar chaves {}.
    //5. Um bloco de inicializaçao nao estatico pode acessar atributos estaticos.
    private int[] parcelas;


    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de incialização.");
        for(int i = 1; i <= 100; i++){
            parcelas[i -1] = i;
        }
        /*for (int auxParcela : this.parcelas) {
            System.out.print(auxParcela + " ");*/
    }
    public Cliente() {
        /*System.out.println("Dentro do construtor.");
        for (int auxParcela : this.parcelas) {
            System.out.print(auxParcela + " ");
        }*/
    }
    public void setParcelas(int[] alteraParcelas){
        this.parcelas = alteraParcelas;
    }
    public int[] getParcelas(){
        return this.parcelas;
    }
}
