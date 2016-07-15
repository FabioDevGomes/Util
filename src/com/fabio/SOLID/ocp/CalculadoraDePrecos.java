package com.fabio.SOLID.ocp;


public class CalculadoraDePrecos {

  public double calcula(Compra produto){
    TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
    Frete correios = new Frete();
    
    double desconto = tabela.decontoPara(produto.getValor());
    double frete = correios.para(produto.getCidade());
    
    return produto.getValor() * (1 - desconto) + frete;
  }
  
  private boolean regra1(){
    return true;
  }

  private boolean regra2(){
    return true;
  }
}
