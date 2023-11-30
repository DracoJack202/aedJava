package aed.individual5;

import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.*;

public class Utils {
  
  public static <E> PositionList<E> deleteRepeated(PositionList<E> l) {
	  
	  PositionList<E> listFinal = new NodePositionList<E>();
	  Position<E> pos = l.first();
	  
	  if(pos!=null) {
		  listFinal.addFirst(pos.element());
		  pos = l.next(pos);
	  
		  while(pos!=null) {
			  
			  boolean fin = false;
			  Position<E> poslF = listFinal.first();
			  
			  while(!fin) {
				  if(poslF!=null&&igual(poslF,pos)) {
					  fin = true;
				  }
				  else if(poslF!=null) {
					  poslF = listFinal.next(poslF);
				  }
				  else {
					  listFinal.addLast(pos.element());
					  fin = true;
				  }
			  }
			  
			  pos = l.next(pos);
		  }
	  }
	  
	  return listFinal;
  }
  

  
  public static <E> PositionList<E> compactar (Iterable<E> lista) {
	  
	  PositionList<E> listFinal = new NodePositionList<E>();
	  
	  if(lista==null) {
		  throw new IllegalArgumentException("null");
	  }
	  Iterator<E> it = lista.iterator();
	  
	  if(it.hasNext()) {
		  E cursor = it.next();
		  E added = cursor;
		  listFinal.addLast(cursor);
 
		  while(it.hasNext()) {
			  cursor = it.next();
			  if(!igual(cursor, added)) {
				  listFinal.addLast(cursor);
				  added = cursor; }
		  }
	  }
	  
	  return listFinal;
  }
  
  public static Map<String,Integer> maxTemperatures(TempData[] tempData) {
	  
	  Map<String, Integer> mapa = new HashTableMap<String, Integer>();
	  
	  if(tempData.length>0) {
		  TempData tD = tempData[0];
		  String lugar = tD.getLocation();
		  Integer temp = tD.getTemperature();
		  
		  mapa.put(tD.getLocation(), tD.getTemperature());
		  int i = 1;
		  
		  while (i<tempData.length) {
			  
			  tD = tempData[i]; 
			  lugar = tD.getLocation(); 
			  temp = tD.getTemperature();
			  Integer tempYa = mapa.get(lugar);
			  
			  if(tempYa!=null&&tempYa<temp){
				  mapa.put(lugar, temp);
			  }
			  else if(tempYa==null) { mapa.put(lugar, temp); }
			  
			  i++;
		  }
//		  for(Entry<String, Integer> e : mapa.entries()){
//			  
//		  }
	  }
	  
	  return mapa;
  }
  
  // Métodos auxiliares que he utilizado
  private static <E> boolean igual(Position<E> p1, Position<E> p2) {
	  E ep1 = p1.element();
	  E ep2 = p2.element();

	  return igual(ep1, ep2);
  }
  
  private static <E> boolean igual(E ep1, E ep2) {
	  boolean unNull = ep1==null||ep2==null;
	  boolean ambosNull = ep1==null&&ep2==null;
	  
	  if(unNull) { return ambosNull; }
	  else { return ep1.equals(ep2); }
  }
  

}


