package com.fabio.SOLID.acoplamento.refatorado;

import java.util.List;

public class GeradorDeNotaFiscal {
  
  // Uso do padrão Observer
  private final List<AcaoAposGerarNota> acoes;
  
  //  private final EnviadorDeEmail enviadorDeEmail;
  //  private final NotaFiscalDao dao;
  
  // Registro dos observadores
  public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
    this.acoes = acoes;
    
    //    this.enviadorDeEmail = enviadorDeEmail;
    //    this.dao = dao;
  }
  
  public NotaFiscal gerar(Fatura fatura){
    double valor = fatura.getValorMensal();
    
    NotaFiscal nf = new NotaFiscal(valor, impostoSimple(valor));
    
    // Notifica observadores
    for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
      acaoAposGerarNota.executar(nf);
    }
    
    //    enviadorDeEmail.enviarEmail(nf);
    //    dao.persistir(nf);
    
    return nf;
  }

  private double impostoSimple(double valor){
    return valor * 0.06;
  }
  
}
