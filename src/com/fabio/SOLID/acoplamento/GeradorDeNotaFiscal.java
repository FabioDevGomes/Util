package com.fabio.SOLID.acoplamento;


public class GeradorDeNotaFiscal {
  
  private final EnviadorDeEmail enviadorDeEmail;
  private final NotaFiscalDao dao;
  
  public GeradorDeNotaFiscal(EnviadorDeEmail enviadorDeEmail, NotaFiscalDao dao) {
    this.enviadorDeEmail = enviadorDeEmail;
    this.dao = dao;
  }
  
  public NotaFiscal gerar(Fatura fatura){
    double valor = fatura.getValorMensal();
    
    NotaFiscal nf = new NotaFiscal(valor, impostoSimple(valor));
    
    enviadorDeEmail.enviarEmail(nf);
    dao.persistir(nf);
    
    return nf;
  }

  private double impostoSimple(double valor){
    return valor * 0.06;
  }
  
}
