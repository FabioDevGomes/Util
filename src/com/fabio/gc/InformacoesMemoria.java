package com.fabio.gc;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

public class InformacoesMemoria {

  public static final int MEGA = 1024 * 1024;
  public static final String FORMAT = " (%.2fmb)";
  
  public static void main(String[] args) {
    MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
    
    System.out.println("::: Mem�ria heap :::\n");
    MemoryUsage heapMemory = memoryMXBean.getHeapMemoryUsage();
    System.out.println("Tamanho inicial: "+ heapMemory.getInit() + String.format( FORMAT, (double) heapMemory.getInit() / MEGA));
    System.out.println("Tamanho atual: "+ heapMemory.getCommitted() + String.format( FORMAT, (double) heapMemory.getCommitted() / MEGA));
    System.out.println("Usado: "+ heapMemory.getUsed() + String.format( FORMAT, (double) heapMemory.getUsed() / MEGA));
    System.out.println("M�ximo: "+ heapMemory.getMax() + String.format( FORMAT, (double) heapMemory.getMax() / MEGA));
    
    System.out.println("\n");
    System.out.println("::: Mem�ria non-heap :::\n");
    MemoryUsage nonheapMemory = memoryMXBean.getNonHeapMemoryUsage();
    System.out.println("Tamanho inicial: "+ nonheapMemory.getInit() + String.format( FORMAT, (double) nonheapMemory.getInit() / MEGA));
    System.out.println("Tamanho atual: "+ nonheapMemory.getCommitted() + String.format( FORMAT, (double) nonheapMemory.getCommitted() / MEGA));
    System.out.println("Usado: "+ nonheapMemory.getUsed() + String.format( FORMAT, (double) nonheapMemory.getUsed() / MEGA));
    System.out.println("M�ximo: "+ nonheapMemory.getMax() + String.format( FORMAT, (double) nonheapMemory.getMax() / MEGA));

    System.out.println("\n");
    System.out.println("::: Pool de mem�rias (organiza��o JVM) :::\n");
    List<MemoryPoolMXBean> list = ManagementFactory.getMemoryPoolMXBeans();
    for (MemoryPoolMXBean memoryPoolMXBean : list) {
      
      System.out.println("\n");
      System.out.println("Nome do pool: "+ memoryPoolMXBean.getName());
      System.out.println("Grupo: "+ memoryPoolMXBean.getType());
      System.out.println();
      
      MemoryUsage usage = memoryPoolMXBean.getUsage();
      
      System.out.println("Tamanho inicial: "+ usage.getInit() + String.format( FORMAT, (double) usage.getInit() / MEGA));
      System.out.println("Tamanho atual: "+ usage.getCommitted() + String.format( FORMAT, (double) usage.getCommitted() / MEGA));
      System.out.println("Usado: "+ usage.getUsed() + String.format( FORMAT, (double) usage.getUsed() / MEGA));
      System.out.println("M�ximo: "+ usage.getMax() + String.format( FORMAT, (double) usage.getMax() / MEGA));
    }
    
    
  }

}
