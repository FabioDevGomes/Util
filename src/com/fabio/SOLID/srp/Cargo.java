package com.fabio.SOLID.srp;


public enum Cargo {
  DESENVOLVEDOR(new DezOuVintePorcento()),
  TESTER(new QuizeOuVinteCincoPorcento()),
  DBA(new QuizeOuVinteCincoPorcento());
  
  private RegraCalculo regra;
  
  private Cargo(RegraCalculo regra) {
    this.regra = regra;
  }

  public RegraCalculo getRegra() {
    return regra;
  }

}
