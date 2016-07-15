package com.fabio.SOLID.srp;


public class CalculadoraDeSalario {
  
  public double calcula(Funcionario funcionario){
    if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())){
//      return dezOuVintePorcento(funcionario);
//      return new DezOuVintePorcento().calcula(funcionario);
      return Cargo.DESENVOLVEDOR.getRegra().calcula(funcionario);
    }
    if(Cargo.DBA.equals(funcionario.getCargo())){
//      return quizeOuVinteCincoPorcento(funcionario);
//      return new QuizeOuVinteCincoPorcento().calcula(funcionario);
      return Cargo.DBA.getRegra().calcula(funcionario);
    }
    
    throw new RuntimeException("Funcionário inválido");
  }
  
  /** Extraído para uma classe separada */
//  private double dezOuVintePorcento(Funcionario funcionario){
//    if(funcionario.getSalarioBase() > 3000.0){
//      return funcionario.getSalarioBase() * 0.8;
//    }else{
//      return funcionario.getSalarioBase() * 0.9;
//    }
//  }
  
    /** Extraído para uma classe separada */
//  private double quizeOuVinteCincoPorcento(Funcionario funcionario){
//    if(funcionario.getSalarioBase() > 4000.0){
//      return funcionario.getSalarioBase() * 0.75;
//    }else{
//      return funcionario.getSalarioBase() * 0.85;
//    }
//  }

}
