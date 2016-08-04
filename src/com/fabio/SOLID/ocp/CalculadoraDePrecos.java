package com.fabio.SOLID.ocp;


public class CalculadoraDePrecos {
  private ServicoDeEntrega entrega;
  private TabelaDePreco tabela;
  
  public CalculadoraDePrecos(ServicoDeEntrega entrega, TabelaDePreco tabela){
    this.entrega = entraga;
    this.tabela = tabela;
  }

  public double calcula(Compra produto){
    double desconto = tabela.calcularDesconto(produto.getValor());
    double frete = entrega.calcularFrete(produto.getCidade());
    
    return produto.getValor() * (1 - desconto) + frete;
  }
  
  private boolean regra1(){
    return true;
  }

  private boolean regra2(){
    return true;
  }
}
