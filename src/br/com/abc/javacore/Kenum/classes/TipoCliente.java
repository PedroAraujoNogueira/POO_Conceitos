package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    // constant specific class body: serve para quando por exemplo tivermos multiplas constantes enum(nesse caso temos 2, PESSOA_FISICA
    // e PESSOA_JURIDICA, mas poderiamos ter 4 ou 5 por exemplo) e quisermos que em apenas uma dessas constantes
    // o metodo getId retorne "B", nesse caso usamos constant specific class body para sobrescrever o metodo getId somente para
    // essa constante, continuando as outras constantes retornando "A" normalmente.

    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };


    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }

    public String getNome(){
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

}


/*
* Enumeraçao é um tipo especial de classe e como toda classe podemos adicionar atributos e metodos.
* As contantes de enumeraçao precisam ser a primeira coisa na enumeraçao, ou seja outros atributos podem ser criados
  contanto que sejam criados depois das constantes de enumeraçao.
* Nos nunca poderemos chamar ou inicializar o construtor de uma enumeraçao, ele proprio vai se chamar.
* Regras para a construçao de construtores enum:
  primeira: nao podemos criar um construtor public em enum, podemos ate coloca-los como privados porem seria redundante pois
  eles ja sao considerados privados por padrao.
* É muito útil pois evita que valores indesejados sejam colocados, pois so averá a opçao de colocar como valores os atributos que
  estão definidos na enum TipoCliente.
* Temos duas formas de criarmos enumeraçoes,
  Primeira: Podemos criar dentro da propria classe.(a chamada para essa enum na classe main é feita com o nome da classe em que foi
  criado ponto nome do "metodo enum" ponto nome do atributo enum.
  Segunda(MELHOR): Criar a enumeraçao em um arquivo separado(Para passar um argumento do tipo TipoCliente
  devemos colocar TipoCliente.ATRIBUTODESEJADO).
  OBS: nao podemos em hipotese alguma criar enumeraçoes dentro de metodos.
* */