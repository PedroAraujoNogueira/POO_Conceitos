package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while(contador <10){
            System.out.println(contador);
            contador++;
        }
        contador = 0;
        do{
            System.out.println(contador);
            contador++;
        }while(contador < 10);

        for(contador = 0; contador < 10; contador++){
            System.out.println("O valor de contador é " +contador);
        }
    }

}
