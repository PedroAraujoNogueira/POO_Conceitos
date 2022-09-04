package br.com.abc.javacore.IsobreescritaOUoverride.classes;

public class Pessoa extends Object {
    private String nome;
    private int idade;

    @Override //É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
    public String toString(){
        return "Nome da pessoa: " + nome + " e idade: " + idade;
    }

    public String getNome()
    {
        // System.out.println(super.toString()); Embora o método toString tenha sido sobrescrito, o metodo toString da classe pai ainda pode ser
        // usado, basta para isso usarmos o super.toString, lembrando que o método super deve ser invocado dentro de uma
        // classe filha.
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
