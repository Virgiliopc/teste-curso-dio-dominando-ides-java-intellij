package br.com.digital.innovation.one;

import java.util.function.Function;

public class Aula {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
        };
        funcao1.gerar("Joao Paulo");


       /* Funcao1 funcao1 = valor -> valor;
        System.out.println(funcao1.gerar("Joao Paulo"));*/

        /*Function<Integer, Object> buscarUsuario = idUsuario ->
                //busca meu usuario
                new Object();
        System.out.println(buscarUsuario(15));*/

        /*        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3; //um conceito do paradigma funcional
        int valor = 10;
        System.out.println("O resultado é :: " + calcularValorVezes3.apply(10));*/
//        int valor = 10;
//        int resultado = valor * 3;
//        System.out.println("O resultado é:: "+resultado);
    }
    /*public void calcular(somar(x,y)) {

    }
    public int somar(int x, int y) {
        return x + y;
    }*/
}
interface Funcao1 {
    void gerar(String Valor); // substituido o String pelo void
/*@FunctionalInterface
interface Funcao1 {
    String gerar(String valor);*/
   /* Intereger gerarNumero(String valor);*/
}
