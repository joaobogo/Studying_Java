package edu.joao.fifthmodule.lanchonete.atendimento.cozinha;

public class Cozinheiro {
    
public void adicionarLancheNoBalcao(){
    System.out.println("ADICIONANDO LANCHE NATURAL NO BALCAO");
}

public void adicionarSucoNoBalcao(){
    System.out.println("ADICIONANDO SUCO NATURAL NO BALCAO");
}


public void adicionarComboNoBalcao(){
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
}

private void prepararLanche(){
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
}

private void prepararVitamina(){
    System.out.println("PREPARANDO SUCO");
}

private void prepararCombo(){
    prepararLanche();
    prepararVitamina();
}

private void selecionarIngredienteLanche(){
    System.out.println("SELECIONANDO O PÃO,SALADA,OVO E CARNE");
}

private void selecionarIngredienteVitamina(){
    System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
}

private void lavarIngredientes(){
    System.out.println("LAVANDO INGREDIENTES");
}


private void baterVitaminaLiquidificador(){
    System.out.println("BATENDO VITAMINA EM LIQUIDIFICADOR");
}

public void fritarIngredienteLanche(){
    System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
}



private void pedirParaTrocarGas(Almoxarife meuAmigo){
    meuAmigo.trocarGas();
}

private void pedirIngredientes(Almoxarife almoxarife){
    almoxarife.entregarIngredientes();
}

}
