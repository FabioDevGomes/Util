package com.fabio.SOLID.ocp;


public class FreteCorreios implements ServicoDeEntrega{

  @Override
  public double calcularFrete(String cidade){
    if("SAO PAULO".equals(cidade.toUpperCase())){
      return 15;
    }
    return 30;
  }
}
