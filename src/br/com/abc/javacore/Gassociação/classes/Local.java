package br.com.abc.javacore.Gassociação.classes;

public class Local {
    private String rua;
    private String bairro;

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    public void imprime(){
        System.out.println("-----------Relatorio Local---------");
        System.out.println("O seminario fica na rua: " + this.rua + " no bairro "+ this.bairro);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
