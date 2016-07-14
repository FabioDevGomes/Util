package com.fabio.SOLID.acoplamento.refatorado;


public class EnviadorDeEmail implements AcaoAposGerarNota{
  
  public void enviarEmail(NotaFiscal notaFiscal){
    System.out.println("E-mail enviado");
  }

  @Override
  public void executar(NotaFiscal notaFiscal) {
    enviarEmail(notaFiscal);
    
  }

}
