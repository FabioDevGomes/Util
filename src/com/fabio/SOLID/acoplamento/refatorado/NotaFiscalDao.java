package com.fabio.SOLID.acoplamento.refatorado;


public class NotaFiscalDao implements AcaoAposGerarNota {
  
  public void persistir(NotaFiscal notaFiscal){
    System.out.println("Acessando recursos do BD e persistindo objeto");
  }

  @Override
  public void executar(NotaFiscal notaFiscal) {
    persistir(notaFiscal);
  }

}
