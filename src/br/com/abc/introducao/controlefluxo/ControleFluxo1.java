package br.com.abc.introducao.controlefluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {
        // (idade < 15) infantil
        // (idade >=15 && idade < 18) juvenil
        // (idade >= 18) adulto
        int idade = 18;
        String categoria;
        if(idade < 15){
            categoria ="infantil";
        }
        else if (idade >=15 && idade < 18){
            categoria = "juvenil";
        }
        else{
            categoria = "adulto";
        }
        //categoria = "adulto";
        System.out.println(categoria);
        if(categoria == "adulto"){
            System.out.println("JA FOI");
        }
        //OBS: todas as vezes que declararmos uma variavel em um metodo ou em um bloco de codigo ela deve ser
        //inicializada em alguma parte do bloco ou metodo. Se houver alguma possibilidade de ela nao ser inicializada
        //dentro do metodo ou bloco entao haverá um erro de compilaçao.
        //Por exemplo: se tirarmos o ultimo else do nosso codigo acima haverá um erro de compilaçao msm que o o valor
        //da idade seja menor que 15 ou entre 15 e 18, pois o compilador consegue identificar que pode(existe a possibilidade)
        //acontecer de a categoria nao ser inicializada.
    }
}
