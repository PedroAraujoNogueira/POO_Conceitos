package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //REGRA DE INICIALIZAÇAO DO JAVA:
    //1 - O bloco de inicializaçao estatico será executado quando a JVM carregar a classe.
    //2 - Alocação de espaço na memória para o objeto que será criado.
    //3 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explícitos.
    //4 - Bloco de iniciaização é executado.
    //5 - O construtor é executado.

    //CARACTERISTICAS DO BLOCO DE INICIALIZAÇÃO:
    //1. Não recebe parametros.
    //2. É executado antes do construtor.
    //3. As boas praticas dizem para cria-lo antes do construtor, porem independente de onde
    // ele for criado dentro da classe ele será executado antes do construtor.
    //4. Para criar um bloco de inicialização basta apenas abrir e fechar chaves {}.
    //5. Para criar um bloco de inicialização estatico basta apenas abrir e fechar chaves {} apos a palavra static.
    private static int[] parcelas; // = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    {
        System.out.println("Bloco de inicializaçao nao estatico.");
    }
    // Cada bloco de inicializaçao estatico é executado apenas uma vez, msm que haja varios objetos dessa Classe. Se houver mais de um bloco
    // de inicializaçao estatico eles serao executados na ordem em que aparecem e serao executados antes
    // dos blocos de inicializacao nao estaticos.
    // Um bloco de inicializaçao nao estatico pode acessar atributos estaticos.
    static{
        parcelas = new int[100];
        System.out.println("Dentro do bloco de incialização estatico 1.");
        for(int i = 1; i <= 100; i++){
            parcelas[i -1] = i;
        }
        /*for (int auxParcela : this.parcelas) {
            System.out.print(auxParcela + " ");*/
    }
    static {
        System.out.println("Bloco de inicializaçao estatico 2");
    }
    static {
        System.out.println("Bloco de inicializaçao estatico 3");
    }
    public Cliente() {
        /*System.out.println("Dentro do construtor.");
        for (int auxParcela : this.parcelas) {
            System.out.print(auxParcela + " ");
        }*/
    }
    public static int[] getParcelas(){
        return parcelas;
    }
}
