package aed.individual2;

import es.upm.aedlib.indexedlist.*;

public class IndexedListCheckSumUtils {

  // a no es null, podria tener tamaño 0, n>0
  public static IndexedList<Integer> indexedListCheckSum(IndexedList<Integer> list, int n) {
	
    IndexedList<Integer> finalList = new ArrayIndexedList<Integer>();
    
    // Compruebo que la lista no tiene tamaño 0.
    // Empiezo el bucle si es cierto que no tiene tamaño 0.
    if (list.size() != 0) {
	    for (int indexList = 0, iFinalList = 0, checkSum = 0; indexList<list.size(); 
	    		indexList++, iFinalList++) {
	    	
	    	// checkSum es una variable que almacenará el valor de la suma
	    	int temp = list.get(indexList);
	    	checkSum += temp;
	    	
	    	finalList.add(iFinalList, temp);
	    	
	    	// Compruebo si tengo que añadir el sumatorio al finalList
	    	if (((indexList+1)%n == 0) && (indexList != list.size()-1)) {
	    		iFinalList++; 
	    		finalList.add(iFinalList, checkSum); 
	    		checkSum = 0;
	    		}
	    	else if (indexList == list.size()-1) {
	    		finalList.add(iFinalList+1, checkSum);
	    		}
	    	}
	    }
    
    return finalList;
  }

  
  
  // list no es null, podria tener tamaño 0, n>0
  public static boolean checkIndexedListCheckSum(IndexedList<Integer> list, int n) {
	  
	  // Inicio variable booleana correcto
	  boolean correcto = true;
	  int size = list.size();
	  
	  if (size!=0) {
		  
		  // indexList sirve para recorrer la lista entera
		  // nConteo sirve para contar la cantidad de números
		  for (int indexList = 0, nConteo = 0, checkSum = 0, aux = 0; 
				  indexList<size && correcto; indexList++) {
			  
			  // Compruebo que el indice esté en el checkSum
			  if (nConteo == n && indexList!=size-1) {
				  correcto = (checkSum == list.get(indexList)); 
				  aux++;
			  }
			  else if (indexList==size-1) {
				  correcto = (checkSum == list.get(indexList));
			  }
			  
			  // Cuando estamos en el checkSum nos lo queremos saltar
			  if (aux==0 && indexList!=size-1 && correcto) { 
				  checkSum += list.get(indexList); 
				  nConteo++;
			  }
			  else {
				  aux = 0; checkSum = 0; nConteo = 0; 
			  }
		  }    	
	  }
	 
	  return correcto;
  }
}

