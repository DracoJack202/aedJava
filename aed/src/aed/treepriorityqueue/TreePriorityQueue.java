package aed.treepriorityqueue;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.tree.*;


public class TreePriorityQueue<K extends Comparable<K>,V> implements PriorityQueue<K,V> {

  public BinaryTree<Entry<K,V>> t;
  private Position<Entry<K,V>> lastPos;

  public TreePriorityQueue() {
	  t = new LinkedBinaryTree<>();
	  lastPos = null;
  }

  public int size() {
	  return t.size();
  }

  public boolean isEmpty() {
	  return size() == 0;
  }

  public Entry<K,V> first() throws EmptyPriorityQueueException {
	  if(isEmpty()) throw new EmptyPriorityQueueException();
	  return t.root().element();
  }

  public void enqueue(K k, V v) {
	  addLast(conector(lastPos, true), new EntryImpl<K,V>(k,v));
	  ordenarPost(t.root());
  }
  
  public Entry<K,V> dequeue() throws EmptyPriorityQueueException {
	  if(isEmpty()) throw new EmptyPriorityQueueException();
	  Entry<K,V> first = first();
	  removeUlt();
	  if(!isEmpty()&&lastPos!=first()) ordenarPre(t.root());
	  return first;
  }

  public String toString() {
	  return t.toString();
  }

  @Override
  public Iterator<Entry<K, V>> iterator() {
		return t.iterator();
  }
  
  
  // Método auxiliar para añadir al final del tree
  
  private Position<Entry<K,V>> addLast(Position<Entry<K,V>> conector, Entry<K,V> elem) {
	  
	  if(conector==null) return lastPos = t.addRoot(elem);
	  
	  Position<Entry<K,V>> left = t.left(conector);
	  Position<Entry<K,V>> right = t.right(conector);
	  
	  if(left==null) {
		  t.insertLeft(conector, elem); 
		  return lastPos = t.left(conector);
	  }
	  if(right==null) {
		  t.insertRight(conector, elem); 
		  return lastPos = t.right(conector);
	  }
	  if(t.isExternal(left)) {
		  return addLast(left, elem);
	  }
	  return addLast(right,elem);
  }
  
  // Método auxiliar para eliminar el último del tree.
  
  private void removeUlt() {
	  exConLast();
	  Position<Entry<K,V>> conector = conector(lastPos, false);
	  t.remove(lastPos);
	  buscarUlt(conector);
  }
  // Busco el nuevo último después de eliminar el actual último
  private Position<Entry<K,V>> buscarUlt(Position<Entry<K,V>> conector) {
	  
	  if(isEmpty()) return lastPos = null;
	  
	  Position<Entry<K,V>> left = t.left(conector);
	  Position<Entry<K,V>> right = t.right(conector);
	  
	  if(left!=null&&right==null) {
		  return lastPos = t.left(conector);
	  }
	  if(left==null) {
		  return lastPos = conector;
	  }
	  if(t.isInternal(left)&&t.isExternal(right)) {
		  return buscarUlt(left);
	  }
	  else return buscarUlt(right);
  }
  
  // Métodos auxiliares para ordenar
  
  // Ordena en postorden
  private void ordenarPost(Position<Entry<K,V>> nodo) {
	  
	  Position<Entry<K,V>> left = t.left(nodo);
	  Position<Entry<K,V>> right = t.right(nodo);
	  
	  if (left!=null) ordenarPost(left);
	  if(menorK(left, nodo)) {
		  exchange(left, nodo);
	  }
	  if (right!=null) ordenarPost(right);
	  if(menorK(right, nodo)) {
		  exchange(right, nodo);
	  }
  }
  // Ordena en preorden
  private void ordenarPre(Position<Entry<K,V>> nodo) {
	  
	  Position<Entry<K,V>> left = t.left(nodo);
	  Position<Entry<K,V>> right = t.right(nodo);
	  
	  if(left==null) return;
	  if(left!=null&&menorK(left, nodo)) {
		  exchange(left, nodo);
	  }
	  if (left!=null) ordenarPost(left);
	  if(right!=null&&menorK(right, nodo)) {
		  exchange(right, nodo);
	  }
	  if (right!=null) ordenarPost(right);
  }
  // Compara las keys, si key del nodo1 < key nodo2 devuelve true.
  private boolean menorK(Position<Entry<K,V>> nodo1, Position<Entry<K,V>> nodo2) {
	  if(nodo1==null||nodo2==null) return false;
	  return nodo1.element().getKey().compareTo(nodo2.element().getKey())<0;
  }
  
  // Métodos auxiliares para intercambiar posiciones de nodos.
  
  // exConLast cambia el root con el lastPos
  private void exConLast () {
	  exchange(t.root(), lastPos);
  }
  private void exchange (Position<Entry<K,V>> nodo1, Position<Entry<K,V>> nodo2) {
	  Entry<K,V> aux = nodo1.element();
	  t.set(nodo1, nodo2.element());
	  t.set(nodo2, aux);
  }
  
  // Método conector, auxiliar usado en addLast y removeUlt
  
  // Busca un nodo especial el cual servirá para que el algoritmo no falle
  // Si el modo es true, dará el padre del nodo del primer nodo que esté a la izq
  // de su padre, o el leftMost(). 
  // Si el modo es false, dará el padre del nodo del primer nodo que esté a la der
  // de su padre o el root del tree.
  private Position<Entry<K,V>> conector(Position<Entry<K,V>> nodo, boolean modo){
	  
	  if(nodo==null) return null;
	  
	  boolean esRoot = t.isRoot(nodo);
	  
	  if(esRoot&&modo) return leftMost(nodo);
	  if(esRoot&&!modo) return t.root();
	  if(isRight(nodo)==modo) return conector(t.parent(nodo), modo);
	  else return t.parent(nodo);
  }
  // Devuelve true si el nodo es el hijo derecho de su padre y false en otro caso-
  private boolean isRight(Position<Entry<K,V>> nodo) {
	  if(t.parent(nodo)==null||t.right(t.parent(nodo))==null) { return false; }
	  else return t.right(t.parent(nodo)).equals(nodo);
  }
  // Devuelve el nodo de más a la izquierda del árbol.
  private Position<Entry<K,V>> leftMost(Position<Entry<K,V>> nodo) {
	  if(t.hasLeft(nodo)) return leftMost(t.left(nodo));
	  else return nodo;
  }
}
