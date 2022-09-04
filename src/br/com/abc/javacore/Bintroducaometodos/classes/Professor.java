package br.com.abc.javacore.Bintroducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(Professor aux){

        System.out.println(aux.matricula);
        System.out.println(aux.nome);
        System.out.println(aux.rg);
        System.out.println(aux.cpf);
        aux.nome = "Esse nome foi alterado.";
    }
    public void imprime(){
        System.out.println(this.matricula); // A palavra this.nomeDoAtributo é utilizada quando queremos pegar os valores
        System.out.println(this.nome);      // dentro do proprio objeto, ou seja, serve para os atributos daquele objeto.
        System.out.println(this.rg);
        System.out.println(this.cpf);
        this.nome = "Esse nome foi alterado.";
    }
}
