package br.com.abc.javacore.Gassociação.classes;



public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    private String titulo;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(){
    }

    public void imprime(){
        System.out.println("-----------Relatorio Seminario---------");
        System.out.println("Titulo do seminario: " + this.titulo);
        if(this.local != null) {
            System.out.println("Local do seminario, rua: " + this.local.getRua() +
                    " ,bairro: " + this.local.getBairro());
        }
        else{
            System.out.println("Este seminario ainda nao possui um local.");
        }
        if(this.professor != null) {
            System.out.println("O Professor desse seminario é: " + this.professor.getNome());
        }
        else{
            System.out.println("Este seminario ainda nao possui um professor.");
        }
        System.out.println("Alunos participantes desse seminario: ");
        if(this.alunos != null && alunos.length > 0) {
            for (Aluno aux : this.alunos) {
                    System.out.println(aux.getNome());
            }
        }
        else{
            System.out.println("Nao existem alunos cadastrados nesse seminario.");
        }
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    public Aluno[] getAlunos(){
        return alunos;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor(){
        return professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
