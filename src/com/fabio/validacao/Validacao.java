package com.fabio.validacao;

public class Validacao {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
  
  private boolean validarInclusao() {
    try {
      //Todos os campos s�o obrigat�rios no BD
      validarCampoTextbox(txtbxCodigoFornecedor);
      validarCampoTextbox(txtbxDescricao);
      validarCampoTextbox(txtbxTelefone);
      validarCampoTextbox(txtbxContato);
      
      if(cmbTipo.getValue() == null || cmbTipo.getValue().equals("")){
        Clients.wrongValue(cmbTipo, "Campo obrigat�rio");
        cmbTipo.setFocus(true);
        return false;
      }
    } catch (Excecao e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  }

  private void validarCampoTextbox(Textbox input) throws Excecao {
    if(input.getValue() == null || input.getValue().equals("")){
      Clients.wrongValue(input, "Campo obrigat�rio");
      input.setFocus(true);
      throw new Excecao("PGT900: Erro de valida��o");
    }
  }

}
