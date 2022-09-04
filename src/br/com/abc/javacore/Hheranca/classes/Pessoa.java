package br.com.abc.javacore.Hheranca.classes;

public class Pessoa extends Object {

    //Herança é utilizada em java por basicamente dois motivos:
    //1- poder reaproveitar o codigo.
    //2- Voce utilizar polimofismo.
    protected String nome;        //O modificador de acesso protected é usado para acessar atributos diretamente dentro do mesmo pacote
    private String cpf;         //ou para classes filhas(subclasses), ou seja, o protected foi feito para liberar o acesso ao atributo
    // para os filhos ou classes pertencentes ao mesmo pacote, e deixar privado para todas as outras classes. Ou seja, quem não é uma
    // Pessoa ou nao está no mesmo pacote da classe Pessoa não verá os atributos protected.
    protected Endereço endereco;
    protected int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(){
   }


    public void imprime() {
        System.out.println("O nome da pessoa é " + this.nome);
        System.out.println("O CPF da pessoa é " + this.cpf);
        System.out.println("O endereço da pessoa é, bairro: " + this.endereco.getBairro() +
                " rua " + this.endereco.getRua());
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public Endereço getEndereco() {
        return endereco;
    }




}