package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa { //Funcionario é uma sub-classe da classe Pessoa, logo
    // Funcionario é uma Pessoa. Funcionario estende Pessoa.
    // Herança utiliza o conceito É UM.
    // A classe Pessoa é a classe Pai(superclasse) e a classe Funcionario é a classe filho(subclasse).
    // Todos os atributos e metodos da classe Pai, automaticamente fazem parte da classe Filho(no caso de serem atributos private existem
    // algumas restriçoes).
    // OBS: Nao existe multipla herança em java, uma classe pode possuir apenas um pai. Porem pode possuir avo e assim por diante.
    // Todas as vezes que quisermos acessar algo da superClasse atraves da classe filha usamos a referencia super. Apesar de chamarmos o
    // metodo da classe Pai, os valores serao executados para o objeto/classe que o chamou.

    /* SobreEscrita de metodos:
    Um metodo com o mesmo modificador de acesso, mesmo tipo de retorno e mesmo nome do metodo
    e mesma quantidade, tipo e ordem dos parametros, ou seja, mesma assinatura de metodo.
    Na sobreEscrita é substituido o metodo da classe Pai por o metodo da propria classe.
    Chamar um metodo da classe Pai: para acessarmos algo da classe pai podemos usar a referencia super, mesmo que o metodo tenha sido
    sobre escrito.
    */

   private double salario; //Se colocarmos super em algo DEFINIDO na própria classe, o Intellij apontará um erro de compilação, já que
    // neste caso ele procurará na classe Pai e não encontrará tal atributo.


   public void imprime(){

       super.imprime(); // Todas as vezes que quisermos acessar algo da superClasse atraves da classe filha devemos usar a palavra
       // super. Isso nao vai funcionar se o metodo ou atributo da classe Pai forem private. Apesar de chamarmos o metodo da classe Pai,
       // os valores serao executados referentes ao objeto/classe que o chamou.

       //System.out.println(nome); // TAMBEM FUNCIONA.
       //System.out.println(this.nome); // TAMBEM FUNCIONA.
       System.out.println(super.nome); // O this, além de guardar a referência para mexermos nos atributos do objeto, para o desenvolvedor,
       // significa que o atributo deve estar definido nesta classe. Entretanto, neste caso o nome não está definido na classe Funcionario, e sim
       // na classe mãe, ou super classe, Pessoa. Para deixarmos isso explícito em nosso código, ou seja, que o atributo nome vem da superClasse,
       // há uma outra palavra que podemos utilizar, que é super. OBS: as duas formas acima TAMBEM FUNCIONAM, porem é mais bem visto usarmos
       // o super.

       //System.out.println(getCpf());
       //super.setCpf("eita doida"); // So para testar se quando fazemos isso o cpf alterado seria msm da classe filha e realmente é.
       //System.out.println(getCpf()); // Imprimindo teste.
       //System.out.println("O salario desse funcionario é "+ this.salario);
       imprimeReciboPagamente();
   }


   public Funcionario(){
   }

    //public Funcionario(String nome){ // Se criarmos um construtor diferente do construtor padrao na superclasse, entao devemos
      // super(nome);                  // obrigatoriamente dizer na subclasse que construtor da superclasse devemos chamar, fazemos isso
                                       // atraves do metodo super().
    //}                                // O metodo super() serve para chamarmos um construtor da superclasse e so pode ser usado
                                       // dentro de um construtor.
                                       // O metodo super() devera ser a primeira instruçao dentro do construtor, logo nao podemos chamar o super() e o this() no mesmo construtor.
                                       // Construtores nao sao herdados automaticamente. Lembra-se, não existe herança de construtores,
                                       // apenas podemos fazer uma chamada explicita para acessa-lo.


    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }

    public void imprimeReciboPagamente() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario); // Agora podemos acessar diretamente
        // os atributos da classe Pessoa pois o modificador de acesso da classe Pessoa esta protected entao pode ser acessado diretamente
        // pela classe filha(que é esse o caso) ou por qualquer classe que esteja dentro do mesmo pacote que Pessoa.
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
// Quando os atributos ou metodos da classe Pai sao private so podemos acessa-los e/ou altera-los, para a classe filha, em tempo de execuçao
// atraves de metodos publicos que foram herdados da classe pai(usando os "originais"), porem nao podemos acessar os atributos diretamente
// da classe filha, para isso temos o modificador de acesso protected.

// No caso em que os atributos da classe Pai sao privados, embora nao possamos altera-los diretamente atraves da classe filha,
// quando alteramos seus valores usando de um objeto da classe filha para chamar um metodo ou um metodo da classe pai atraves da
// classe filha(usando o super), os valores alterados sao referentes aos atributos da classe filha, pois foi quem os chamou.