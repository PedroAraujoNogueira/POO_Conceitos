package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {
    private String nome; // O modificador de acesso private serve para proteger o atributo, somente
    private int idade;   // permitindo que ele seja modificado dentro de sua propria classe, pois os atributos
    private double[] notas;// so estao visiveis para ela.
    private boolean aprovado;

    public void imprimirDados() {
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("A idade do aluno é: " + getIdade());
        //System.out.println("As notas do aluno são: " + notas + "\n"); // O \n serve para pular linha.
        System.out.println("As notas de " + nome + " sao: ");
        if (notas != null) {
            for (double aux : notas) {
                System.out.println(aux);
            }
        }
    }

    public void statusDeAprovaçao() {
        double notas = 0;
        double media;
        if (this.notas == null) {
            System.out.println("Esse aluno nao possui notas.");
            return;
        }
        for (double aux : this.notas) {
            notas += aux;
        }
        media = notas / this.notas.length;
        if (media > 6) {
            aprovado = true;
            System.out.println("\nParabens, você foi aprovado."); // O \n serve para pular linha.
            return;
        }
        aprovado = false;
        System.out.println("Sinto muito, você foi reprovado.");
    }

    public void setNome(String alteraNome) {
        this.nome = alteraNome;
    }

    public void setIdade(int alteraIdade) {
        if (alteraIdade < 0) {
            System.out.println("Essa idade nao é valida.");
            return;
        }
        this.idade = alteraIdade;

    }

    public void setNotas(double[] alteraNotas) {
        this.notas = alteraNotas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
            return this.idade;
    }
    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado(){ // Para valores booleanos o get é substituido por is(convenção).
        return this.aprovado;
    }
    // Quando estamos usando valores booleanos ao invez de usar getAprovado por exemplo, é muito comum que se utilize
    // isAprovado. Podemos usar o setAprovado normalmente, esse costume descrito é para o get.
}
    // Uma forma mais rápida e fácil de transitar no projeto que está sendo desenvolvido
    // é manter pressionado atalho "Ctrl", com isso, o Eclipse e o Intellij irão transformar muitos elementos em links.
    // Ao clicarmos em um dos links, seremos transportados para o código referente ao método ou
    // classe que estamos acionando.