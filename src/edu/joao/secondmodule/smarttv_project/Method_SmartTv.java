package edu.joao.secondmodule.smarttv_project;

public class Method_SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume alterado para:" + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume alterado para:" + volume);
    }


    public void aumentarCanal(){
        canal++;
    }

     public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
