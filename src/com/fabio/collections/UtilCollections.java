package com.fabio.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UtilCollections {

  public static void main(String[] args) {
    
    UtilCollections util = new UtilCollections();
    
    //Usar LinkedHashMap para garantir a ordem de inclusão
    Map<String, String> mapTipoFornec = new LinkedHashMap<String, String>(); 
    
    util.ordenarPorValor(mapTipoFornec);

  }
  
  private void ordenarPorValor(Map<String, String> map){
    List<Entry<String, String>> lista = new LinkedList<Entry<String, String>>(map.entrySet());
    Collections.sort(lista, new Comparator<Entry<String, String>>() {
      @Override
      public int compare(Entry<String, String> o1, Entry<String, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    });
    
    map.clear();
    for (Entry<String, String> entry : lista) {
      map.put(entry.getKey(), entry.getValue());
    }
  }

}
