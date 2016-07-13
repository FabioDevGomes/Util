package com.fabio.serializacao;

import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoDeObjetos {

  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Fábio");
    pessoa.setSobreNome("Alves Gomes");
    pessoa.setIdade(30);
    pessoa.setSalario(12200.2);
    
    escrever(pessoa);
    escreverEmXML(pessoa);
    
    Pessoa pessoaLida = ler("ArquivoGerado.fabio");
    System.out.print(pessoaLida);
    
  }
  
  public static void escreverEmXML(Pessoa pessoa){
    try { 
      FileOutputStream fileOutputStream = new FileOutputStream("ArquivoGerado.xml");
      XMLEncoder xmlEncoder = new XMLEncoder(fileOutputStream);
      xmlEncoder.writeObject(pessoa);
      xmlEncoder.close();
      fileOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void escrever(Pessoa pessoa){
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("ArquivoGerado.fabio");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(pessoa);
      objectOutputStream.close();
      fileOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static Pessoa ler(String nomeArquivo){
    Pessoa pessoa = null;
    try {
      FileInputStream fileInputStream = new FileInputStream(nomeArquivo);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      pessoa = (Pessoa) objectInputStream.readObject();
      fileInputStream.close();
      objectInputStream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return pessoa;
  }

}
