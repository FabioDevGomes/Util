package com.fabio.validacao;

public class Validacao {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
  
  private boolean validarInclusao() {
    try {
      Textbox txtbxCodigoFornecedor;
      Textbox txtbxDescricao;
      Textbox txtbxTelefone;
      Textbox txtbxContato;
      //Todos os campos são obrigatórios no BD
      validarCampoTextbox(txtbxCodigoFornecedor);
      validarCampoTextbox(txtbxDescricao);
      validarCampoTextbox(txtbxTelefone);
      validarCampoTextbox(txtbxContato);
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  }

  private void validarCampoTextbox(Textbox input) throws Exception {
    if(input.getValue() == null || input.getValue().equals("")){
      Clients.wrongValue(input, "Campo obrigatório");
      input.setFocus(true);
      throw new Excecao("PGT900: Erro de validação");
    }
  }

}
