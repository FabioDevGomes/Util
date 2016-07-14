package com.fabio.SOLID.acoplamento;


public class Fatura {
  private double valorMensal;
  
  public Fatura(double valorMensal) {
    this.setValorMensal(valorMensal);
  }

  public double getValorMensal() {
    return valorMensal;
  }

  public void setValorMensal(double valorMensal) {
    this.valorMensal = valorMensal;
  }
}
