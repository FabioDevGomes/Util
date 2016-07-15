package com.fabio.SOLID.srp;


public class QuizeOuVinteCincoPorcento implements RegraCalculo{

  @Override
  public double calcula(Funcionario funcionario) {
    if(funcionario.getSalarioBase() > 4000.0){
      return funcionario.getSalarioBase() * 0.75;
    }else{
      return funcionario.getSalarioBase() * 0.85;
    }
  }

}
