package com.fabio.serializacao;

import java.io.Serializable;

public class Pessoa implements Serializable{
  private String nome;
  private String sobreNome;
  private int idade;
  private double salario;
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getSobreNome() {
    return sobreNome;
  }
  
  public void setSobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public double getSalario() {
    return salario;
  }
  
  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Nome: "+nome + ",Sobre nome: "+sobreNome;
  }
  
  
}
