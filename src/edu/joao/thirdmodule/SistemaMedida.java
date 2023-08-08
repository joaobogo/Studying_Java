package edu.joao.thirdmodule;

public class SistemaMedida {

    public static void main(String[] args) {

        String sigla = "A";

        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
            }
            case "G":{
                System.out.println("GRANDE");
            }
            default:{
                System.out.println("INDEFINIDO");
        }

    }
}
