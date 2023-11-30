package aed.individual4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

// Versión mejorada
public class OrderedIterator implements Iterator<Integer> {

  PositionList<Integer> list;
  Position<Integer> yaDado;
  Position<Integer> actual;
  
  public OrderedIterator(PositionList<Integer> list) {
	  this.list = ordenado(list);
	  actual = this.list.first();
  }

  public boolean hasNext() {
	  return actual!=null;
  }
  
  public Integer next() {

	  if(hasNext()) {
		  yaDado = actual;
		  actual = list.next(actual);
	  }
	  else {
		  throw new NoSuchElementException("");
	  }
	  return yaDado.element();
  }
  
  // Antiguo código
  
//  // Implementa los metodos que hace falta
//  public boolean hasNext() {
//	  boolean tiene = false;
//	  Integer intDado = intDado();
//	  Integer comparar = null;
//	  // Si no hay intDado, pasa al return directo.
//	  if(intDado!=null) {
//		  // Comprobamos que el actual y el yaDado no sea lo mismo
//		  if(yaDado!=null&&yaDado.equals(actual)) {
//			  actual = list.next(actual);}
//		  // Comprobamos que el actual no sea null, puede haberse cambiado
//		  // en el paso anterior.
//		  if(actual!=null) {
//			  // Utilizo sigOrd para no tener que modificar actual
//			  sigOrd = actual;
//			  
//			  while(sigOrd!=null&&!tiene) {
//				  comparar = sigOrd.element();
//				  tiene = comparar >= intDado;
//				  
//				  if(!tiene) {
//					  sigOrd = list.next(sigOrd); }
//			  }
//		  }
//	  }
//	  return tiene;
//  }
  
  // Obtengo el elemento intDado que hemos dado, si no hemos dado
  // ningún elemento intDado() devuelve el primer elemento de la lista si no es null
//  private Integer intDado() {
//	  Integer intDado = null;
//	  if(yaDado!=null) {
//		  intDado = yaDado.element();
//	  }
//	  else if(list.first()!=null){
//		  intDado = list.first().element();
//	  }
//	  return intDado;
//  }
  
  // EDIT: Mejorado el TAD, cambio a la introducción de la lista, haciendo
  // que sea más fácil usar next() y hasNext().
  private PositionList<Integer> ordenado (PositionList<Integer> list) {
	  
	  PositionList<Integer> res = new NodePositionList<Integer>();
	  Position<Integer> cursor = list.first();
	  
	  while(cursor!=null) {
		  Integer elem = cursor.element();
		  res.addLast(elem);
		  cursor = list.next(cursor);
		  
		  while(cursor!=null&&cursor.element().compareTo(elem)<0)
		  cursor = list.next(cursor);
	  }
	  
	  return res; 
  }
}
