package edu.joao.secondmodule.smarttv_project;

public class Usuario {

    public static void main(String[] args) throws Exception {

        Method_SmartTv smartTV = new Method_SmartTv();

        System.out.println("TV ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual ? :" + smartTV.canal);
        System.out.println("Volume Atual ? :" + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.ligar();
        System.out.println("Novo Status---->TV ligada ? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status---->TV ligada ? " + smartTV.ligada);

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual ? : " + smartTV.canal);
    }
}
