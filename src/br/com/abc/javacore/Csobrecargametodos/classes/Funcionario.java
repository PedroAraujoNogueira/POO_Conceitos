package br.com.abc.javacore.Csobrecargametodos.classes;

public class Funcionario {
     private String nome;
     private String cpf;
     private double salario;
     private String rg;

     // Objetos sao construidos e os responsaveis pela criaçao desses objetos sao os construtores.
    //CARACTERISTICAS DE UM CONSTRUTOR:
    // Um construtor nao tem tipo de retorno, nem void nem qualquer outro tipo. Possui apenas modificador de acesso e o nome do Construtor.
    // O nome do metodo construtor tem qe ser igual ao nome da Classe.
    // É obrigatorio passar todos os argumentos na criaçao de um objeto que tenha construtor com parametros.
    // Não é permitido chamar um construtor para um objeto, você só usa o construtor no momento da
    // inicialização do objeto.
    // Construtores representam uma oportunidade de inicializar seus dados de forma organizada. A inicialização de atributos é
    // a principal responsabilidade do construtor.
    // Tambem podemos fazer sobreCarga para metodos Construtores.
    // Contrutores podem chamar metodos dentro deles.

    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;

    }
    public Funcionario(){ // Aplicando a sobrecarga de metodos no construtor.
    }
     public void iniciandoVariaveis(String nome, String cpf, double salario){
         this.nome = nome;
         this.cpf = cpf;
         this.salario = salario;
     }
     // Imagine que apos seu sistema estar terminado, seu chefe fala que agora vc precisa adicionar um atributo privado rg
     // na classe Funcionario, porem imagine que esse é um sistema grande com varias classes e varias pessoas trabalhando nele,
     // entao nao seria recomendado anterar a assisnatura do metodo iniciandoVariaveis para que ele recebesse outro parametro, pois
     // isso poderia travar o codigo de diversas outras classes, e seus programadores, que estivessem utilizando esse metodo, logo
     // uma soluçao é a sobreCarga de metodo, pois dessa forma naquele momento nao afetaria em nada o procedimento das outras
     // classes e poderia ser feito o ajuste pedido pelo chefe sem que a aplicaçao precisasse parar de funcionar ate ser
     // completado o ajuste.

     public void iniciandoVariaveis(String nome, String cpf, double salario, String rg) {
         iniciandoVariaveis(nome, cpf, salario); // Para evitar a duplicaçao de codigo.
         this.rg = rg;
                               // sobrecarga de metodos(method overload) é quando temos metodos com o mesmo nome, porém que se
                               // diferenciam quanto a quantidadde de parametros ou
                               // quanto ao tipo de parametros ou ambos,
     }                         // o tipo de retorno e modificador de acesso nao importam na sobrecarga de metodos. O Java
                               // sabe o metodo que sera executado ainda em tempo de compilaçao, de acordo com a analise dos
                               // argumentos passados para a funçao.

     public void imprime(){
         System.out.println(this.nome);
         System.out.println(this.cpf);
         System.out.println(this.salario);
         System.out.println(this.rg);
     }

     public void setNome(String alteraNome){
         this.nome = alteraNome;
     }
     public void setCpf(String alteraCpf){
         this.cpf = alteraCpf;
     }
     public void setSalario(double alteraSalario){
     }
    public void setRg(String alteraRg){
         this.rg = alteraRg;
    }

     public String getNome(){
         return this.nome;
     }
     public String getCpf(){
         return this.cpf;
     }
     public double getSalario(){
         return this.salario;
     }
     public String getRg(){
         return this.rg;
     }
}
// O this é como se fosse uma variavel de referencia que faz referencia para o proprio
// objeto, a diferença é que ele consegue enchegar tanto os atributos quanto os métodos independente se eles sao privados ou nao
// ou seja, ele encherga tudo daquele objeto.