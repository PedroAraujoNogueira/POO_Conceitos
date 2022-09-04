package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    // Com o comando ALT +  INSERT temos acesso aos atalhos de criaçao de setters, getters, Construtor, entre outros(no Intellij).

    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome, matricula, notas);       // O metodo this() é usado para chamar outro contrutor
                                            // e o construtor que será chamado vai variar de acordo com oq houver
                                            // dentro dos parenteses.
                                            // Um construtor so pode ser chamado dentro de outro metodo construtor
        this.dataMatricula = dataMatricula; // e a chamada deve ser feita na primeira linha do construtor, se essas condiçoes nao
                                            // forem atendidas causa erro em tempo de compilaçao.
    }

    public Estudante() {
        imprime();  // Contrutores podem chamar metodos dentro deles.
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
      //  for (double aux : notas) {
      //      System.out.println(aux);
      //  }
        System.out.println(this.notas);
        System.out.println(this.dataMatricula);
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
