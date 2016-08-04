package com.fabio.SOLID.ocp;


public class TabelaDePrecoDiferenciado implements TabelaDePreco{

  @Override 
  public double calcularDesconto(double valor){
    if(valor > 5000){
      return 0.04;
    }
    if(valor > 1000){
      return 0.05;
    }
    return 0;
  }
  
}
