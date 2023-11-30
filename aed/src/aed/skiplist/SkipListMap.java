package aed.skiplist;

import java.util.Random;
import java.util.Iterator;
import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.InvalidKeyException;
import es.upm.aedlib.map.Map;

import es.upm.aedlib.positionlist.*;


public class SkipListMap<K extends Comparable<K>,V> implements Map<K,V> {

	private K min;  // Un valor menor que cada valor que podria tener una clave
	private K max;  // Un valor mayor que cada valor que podria tener una clave
	private PositionList<PositionList<Node<K,V>>> skipList;
	private Random rnd;

	public SkipListMap(K min, K max) {
		this.min = min;
		this.max = max;
		this.skipList = new NodePositionList<>();
		addEmptyList();
		this.rnd = new Random();
	}

	public int size() {
		// Miramos los elementos distintos a min y max que hay en la última
		// capa de la skipList (La capa con todos los elementos)
		if(!trueEmpty()) { return skipList.last().element().size()-2; }
		else return -1;
	}
	
	public boolean isEmpty() {
		// Nos aseguramos que haya valores distintos a min y a max en la última
		// capa de la skipList.
		return size()<=0;
	}

	public boolean containsKey(Object objKey) throws InvalidKeyException {
		// No hace falta modificar este metodo
		throw new UnsupportedOperationException();
	}

	public V put(K key, V value) throws InvalidKeyException {
		// Lanzar errores si los hubiera
		if(key==null) { throw new InvalidKeyException("Inválido"); }
		if(key.compareTo(min)<=0||key.compareTo(max)>=0) {
			throw new InvalidKeyException("Inválido");}
		// Almaceno el camino recorrido por el search
		PositionList<Position<Node<K,V>>> camino = search(key);
		// Si no ha encontrado la key en el mapa, se lo añadimos
  		if(!busqExitosa(camino, key)) {
  			addNewNode(key, value, camino);
  			return null;
  		} 
  		// De lo contrario, modificamos en la lista el valor de la key dada
  		else {
  			return modificar(camino, key, value);
  		}
	}

	public V get(K key) throws InvalidKeyException {
		// Lanzar errores si los hubiera
		if(key==null) { throw new InvalidKeyException("Inválido"); }
		if(key.compareTo(min)<=0||key.compareTo(max)>=0) {
			throw new InvalidKeyException("Inválido");}
		// Almaceno el camino recorrido en el search
		PositionList<Position<Node<K,V>>> camino = search(key);
		// Si no se ha encontrado la key, devuelve null
  		if(!busqExitosa(camino,key)) {
  			return null;
  		}
  		// Si lo ha encontrado devuelve el valor del key dado
		return camino.last().element().element().getValue();
	}

	public V remove(K key) throws InvalidKeyException {
		// Lanzar errores si los hubiera
		if(key==null) { throw new InvalidKeyException("Inválido"); }
		if(key.compareTo(min)<=0||key.compareTo(max)>=0) {
			throw new InvalidKeyException("Inválido");}
		// Almaceno el camino que se ha recorrido en el search
		PositionList<Position<Node<K,V>>> camino = search(key);
		// Si no está la key en el mapa no hacemos nada.
  		if(!busqExitosa(camino,key)) {
  			return null;
  		} 
  		// Pero si está la eliminamos
  		else {
  			return eliminarKey(camino, key);
  		}
	}
                                                    
	public Iterable<K> keys() {
		
		PositionList<K> listK = new NodePositionList<>();
		Iterator<Entry<K,V>> it = iterator();
		
		// Bucle principal para sacar el Iterable<K> a partir del iterator()
		while(it.hasNext()) {
			K key = it.next().getKey();
			listK.addLast(key);
		}
		return listK;
	}

	public Iterable<Entry<K,V>> entries() {
		// Defino la lista final de entries y luego, para no iterar
		// tanto el programa, almaceno las variables
		PositionList<Entry<K,V>> listEnt = new NodePositionList<>();
  		PositionList<Node<K,V>> listElement = skipList.last().element();
  		Position<Node<K,V>> pos = listElement.next(listElement.first());
  		
  		// Bucle principal, recorre la útlima lista y añade los valores distintos
  		// -infinito y +infinito.
  		// Razonamiento: Como las listas sí o sí se inician con AddEmptyList(), 
  		// cosa que hemos asegurado que ocurra. Siempre tiene al menos dos elementos
  		// -infinito y +infinito, así que empezamos siempre por el elemento después
  		// del -infinito, y si comprobamos que después de ese elemento es null, es porque
  		// el elemento en el que estamos situados es +infinito.
  		while (listElement.next(pos)!=null) {
  			listEnt.addLast(pos.element());
  			pos = listElement.next(pos);
  		}
  		
		return listEnt;
	}

	public Iterator<Entry<K,V>> iterator() {
		return entries().iterator();
	}

  	public String toString() {
  		return skipList.toString();
  	}

  
  // Métodos auxiliares recomendados
  	private PositionList<Position<Node<K,V>>> search(K key){
  		// Siguiendo la guía
  		PositionList<Position<Node<K,V>>> camino = new NodePositionList<>();
  		Position<PositionList<Node<K,V>>> list = skipList.first();
  		PositionList<Node<K,V>> listElement = list.element();
  		Position<Node<K,V>> pos = list.element().first();
  		boolean terminado = false;
  		
  		do {
  			while (compararConKeySearch(list.element().next(pos),key)) {
  				// Nos aseguramos de que el sig elemento de pos, sea menor 
  				// o igual que nuestra key. Si es así seguimos buscando.
  				// hasta llegar a un elemento que sea estrictamente mayor que pos
  				pos = listElement.next(pos);
  			}
  			// Cuando haya terminado el bucle anterior lo añade al camino
  			camino.addLast(pos);
  			// Almaceno el below para facilitar lectura
  			Position<Node<K,V>> below = pos.element().getBelow();
  			if (below!=null) {
  				// Si sigue habiendo elementos below, continúa la búsqueda en
  				// la siguiente lista a partir del below del pos actual.
  				pos = below;
  				list = skipList.next(list);
  				listElement = list.element();
  			} 
  			// Si no hay elementos below, termina la búsqueda
  			else terminado = true;
  			
  		} while (!terminado);
  		
  		return camino;
  	}
  	private boolean compararConKeySearch(Position<Node<K,V>> pos, K key) {
  		return pos.element().getKey().compareTo(key)<=0;
  	}
  	private boolean busqExitosa (PositionList<Position<Node<K,V>>> list, K key) {
  		return compararConKey(list.last(),key);
  	}
	private void addEmptyList() {
		PositionList<Node<K,V>> list = new NodePositionList<>();
		// Si la lista está vacía vacía añadimos una lista con min y max apuntando a null
		if(trueEmpty()) {
			list.addLast(new Node<K,V>(min, null, null));
			list.addLast(new Node<K,V>(max, null, null));
			skipList.addFirst(list);
		}
		// Si la lista no está vacía añadimos una lista con min y max apuntando a los 
		// min y max anteriores
		else {
			Position<Node<K,V>> minBelow = skipList.first().element().first();
			Position<Node<K,V>> maxBelow = skipList.first().element().last();
			list.addLast(new Node<K,V>(min, null, minBelow));
			list.addLast(new Node<K,V>(max, null, maxBelow));
			skipList.addFirst(list);
		}
	}
  	
	// Método auxiliar para addEmptyList();  	
	private boolean trueEmpty() {
		return skipList.last() == null;
	}

  	// Método auxiliar del put() para añadir nuevos nodos al mapa y modificarlos
  	private void addNewNode(K key, V value, PositionList<Position<Node<K,V>>> camino){
  		
  		Position<Position<Node<K,V>>> pos = camino.last();
  		Position<Node<K,V>> ipos = null;
		Position<PositionList<Node<K,V>>> listActual = skipList.last();
  		PositionList<PositionList<Node<K,V>>> listaFinal = new NodePositionList<>();
  		boolean terminado = false;
  		
  		while(!terminado) {
  			// Creamos un nodo para ir añadiendolo cuando sea necesario.
  			Node<K,V> nodo = new Node<K,V>(key,value,ipos);
  			
  			// Comprobamos que pos no sea null
  			if(pos==null) {
  				// Cuando es null, añadimos una lista vacía y añadimos una nueva pos
  				// al camino y volvemos a obtener el valor pos.
  				addEmptyList();
  				listActual = skipList.first();
  				camino.addFirst(listActual.element().first());
  				pos = camino.first();
  			}
			// Añadimos el nodo después de pos, añadimos a la listaFinal, 
  			// almacenamos el dato below y vamos a la siguiente lista.
			listActual.element().addAfter(pos.element(), nodo);
			listaFinal.addFirst(listActual.element());
			ipos = listActual.element().next(pos.element());
			listActual = skipList.prev(listActual);
				
  			// Coinflip
  			if(rnd.nextBoolean()) {
  				// Terminamos el proceso de ir añadiendo
  				terminado=true;
  				// Nos aseguramos de que la listaFinal tiene todos los elementos del
  				// skipList original, para poder sustituirlo.
  				while(listActual!=null) {
  					listaFinal.addFirst(listActual.element());
  					listActual = skipList.prev(listActual);
  				}
  			} 
  			else {
  				// Continuamos el proceso de añadir
  				pos = camino.prev(pos);
  			}
  		}
		// Sustituyo el skipList actual por la listaFinal.
		skipList = listaFinal;
  	}
  	private V modificar(PositionList<Position<Node<K,V>>> camino, K key, V value) {
  		
  		Position<Position<Node<K,V>>> pos = camino.last();
  		Position<Node<K,V>> ipos = null;
  		V valor = pos.element().element().getValue();
		Position<PositionList<Node<K,V>>> listActual = skipList.last();
		// Creamos una lista nueva que sustituirá a la skipList actual
  		PositionList<PositionList<Node<K,V>>> listaFinal = new NodePositionList<>();
  		
  		// Bucle principal para modificar, similar a eliminar
		while(listActual!=null) {
			// Comprobamos que pos no sea null y comparamos las keys para modificarlos
			if(pos!=null&&compararConKey(pos,key)) {
				// Todas las veces que en el camino hayamos encontrado el nodo con el 
				// key que queremos modificar el value, lo modificamos en la nueva lista.
				// Para modificar la lista, añadimos un nuevo nodo y eliminamos el antiguo.
				listActual.element().addAfter(pos.element(), new Node<K,V>(key,value,ipos));
				ipos = listActual.element().next(pos.element());
				listActual.element().remove(pos.element());
				pos = camino.prev(pos);
			}
			// Vamos añadiendo la lista modificada o sin modificar a la listaFinal.
			listaFinal.addFirst(listActual.element());
			listActual = skipList.prev(listActual);
		}
		// Devolvemos el valor que hemos eliminado y sustituido
		return valor;
  	}
  	
  	// Métodos auxiliares del remove()
	private V eliminarKey(PositionList<Position<Node<K,V>>> camino, K key) {

		Position<Position<Node<K,V>>> pos = camino.last();
		V valor = pos.element().element().getValue();
		Position<PositionList<Node<K,V>>> listActual = skipList.last();
		// Creamos una nueva lista que sustituirá a nuestra skipList actual con los
		// nodos de valor key eliminados
		PositionList<PositionList<Node<K,V>>> listaFinal = new NodePositionList<>();
		
		while(listActual!=null) {
			// Buscamos los nodos con el mismo Key que el key que tenemos y pasamos
			// al nodo previo en el camino.
			if(pos!=null&&compararConKey(pos,key)) {
				listActual.element().remove(pos.element());
				pos = camino.prev(pos);
			}
			// Nos aseguramos de añadir todas las listas antes de sustituir skipList
			listaFinal.addFirst(listActual.element());
			listActual = skipList.prev(listActual);
		}
		// Sustituyo skipList y devuelvo el valor de los keys eliminado
		skipList = listaFinal;
		return valor;
	}
	private boolean compararConKey(Position<Position<Node<K,V>>> pos, K key) {
		return pos.element().element().getKey().compareTo(key)==0;
	}
}