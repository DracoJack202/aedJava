package aed.individual3;

import java.util.Iterator;

public class Utils {
  public static boolean isArithmeticSequence(Iterable<Integer> l) {
	  
	  Iterator<Integer> it = l.iterator();
	  boolean esSecuencia = true;
	  Integer ant = 0; Integer post = 0; int index = 0;
	  int diferencia = 0;
	  
	 
	  while(it.hasNext()&&esSecuencia) {
		  // He decidido usar un contador index para saber en qué parte
		  // del ciclo estoy. Esto me ayudará a hacer acciones en particular
		  // dependiendo de dónde se encuentre. Como solo hay que comparar 
		  // la diferencia cuando hay 3 o más elementos. Si no tiene 3 o
		  // más, siempre será una secuencia.
		  if(index==0) {
			  // Almaceno el primer valor en una variable "anterior" (ant).
			  ant = it.next();
		  }
		  if(index==1) {
			  // Almaceno el segundo valor en una variable "posterior" (post).
			  post = it.next();
		  }
		  if(index==2) {
			  // Consigo el valor de la diferencia entre el primer valor y el segundo.
			  diferencia = post-ant;
		  }
		  if(index>1) {
			  // Este es el bucle principal si hay +3 elementos.
			  if(ant!=null&&post!=null) {
				  esSecuencia = (diferencia == post-ant);
				  ant = post; post = it.next();
			  }
			  else {
				  if (ant!=null) {
					  post=it.next();
				  }
				  else {
					  ant = post;
					  post = it.next();
				  }
			  }
		  }
		  index++;
		  if(!it.hasNext()&&esSecuencia&&(ant!=null&&post!=null)&&index>2) {
			  esSecuencia = (diferencia==post-ant);
		  }
	  }

	  return esSecuencia;
  }
}
