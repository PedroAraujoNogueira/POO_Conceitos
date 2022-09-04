package br.com.abc.javacore.Gassociação.classes;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(){
    }

    public void imprime(){
        System.out.println("-----------Relatorio Aluno---------");
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Idade do aluno: " + this.idade);
        if(this.seminario != null) { // O if é necessario pois se tentarmos acessar o getTitulo de um seminario que nao existe, isso gerará
                                     // um erro em tempo de execuçao, ou seja, se tentarmos acessar um metodo de um objeto que ainda nao existe
            // isso gerará um erro em tempo de execuçao.

            System.out.println("Aluno participa do seminario: " + this.seminario.getTitulo());
        }
        else{
            System.out.println("Esse aluno nao está cadastrado em nenhum seminario.");
        }
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public Seminario getSeminario(){
        return seminario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    public void setIdade(int idade){
        this.idade =idade;
    }

    public int getIdade(){
        return idade;
    }

}

