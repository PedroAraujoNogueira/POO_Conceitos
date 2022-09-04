package br.com.abc.javacore.Gassociação.classes;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void imprime() {
        System.out.println("--------- Relatorio do professor-------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminarios ministrados: ");
        if (seminarios != null && seminarios.length > 0) { // O teste "seminarios != null" deve vir primeiro, pois se
            // colocassemos "seminarios.length > 0" primeiro e seminarios == 0 entao teriamos um erro em tempo de compilaçao, pois
            // estariamos tentando acessar um atributo de um objeto que nao existe. E no caso de "seminarios != null" vir primeiro
            // isso resolve o problema, pois caso "seminarios == null" entao pela regra do curto circuito a expressao
            // logica "seminarios.length > 0" nem chegaria a ser testada, logo nao gerará erro, pois ela so será testada caso a primeira
            // expressao lógica seja verdadeira.
            for (Seminario aux : this.seminarios) {
                System.out.println(aux.getTitulo());
            }
        }
        else{
            System.out.println("Este professor nao está ministrando nenhum seminario.");
        }
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
