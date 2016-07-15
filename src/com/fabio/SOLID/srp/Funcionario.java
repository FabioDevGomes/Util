package com.fabio.SOLID.srp;


public class Funcionario {

  private Enum cargo;
  private double salarioBase;

  public Enum getCargo() {
    return cargo;
  }

  public void setCargo(Enum cargo) {
    this.cargo = cargo;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }
  
}
