package br.com.abc.javacore.Hheranca.classes;

public class Endereço {
    private String rua;
    private String bairro;

    public void imprime(){
      /*
        System.out.println("Rua: " + this.rua);
        // System.out.println("Rua: " + super.nome); // Nao funciona pois a classe endereço nao herda de pessoa.
        Pessoa p = new Pessoa();
        p.nome = "Rafael"; // So para provar que conseguimos acessar os atributos da classe Pessoa sem usar os metodos set e get
        // pois o modificador de acesso dos atributos da classe Pessoa sao protected, logo podemos acessa-los diretamente
        // se estivermos no mesmo pacote da classe Pessoa(que é esse o caso) ou se a classe for filha(subclasse) da classe Pessoa.
        Funcionario f = new Funcionario();
        f.nome = "Pedro";
      */
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
