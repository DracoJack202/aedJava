package aed.recursion;


import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


public class Utils {

  public static int sqrt(int n) {
	  return sqrtAux(n, 0, n);
  }
  // Método auxiliar para que funcione el sqrt con recursión.
  private static int sqrtAux(int n, int izq, int der) {
	  
	  int res = (izq + der)/2;
	  int mult = res * res;
	  
	  // El if está para garantizar que no sea infinito la recursión
	  if (izq>der) { return der; }
	  
	  // Bucle principal donde ocurre la búsqueda binaria mediante recursión.
	  if (mult>n) { return sqrtAux(n, izq, res-1); }
	  else if (mult<n) { return sqrtAux(n, res+1, der); }
	  else return res;
  }

  
  public static Iterable<Integer> primes(int n) {
	  boolean[] arr = primesAux(n,2,sqrt(n)+1, new boolean[n+1]);
	  return lista(arr);
  }
  // Métodos auxiliares de primes()
  // Método para obtener el array de booleanos
  private static boolean[] primesAux(int n, int i, int sqrt, boolean[] arr) {
	  // Condición para terminar el bucle.
	  if(i>sqrt) { return arr; }
	  // Comprobamos que sea false para cambiar sus múltiplos a false también.
	  if(arr[i]!=true) {
		  int j = i*i;
		  arr = cambioTrue(n, j, i, arr);
	  }
	  return primesAux(n,i+1,sqrt,arr);
  }
  // Cambiamos a true los valores que estaban false en el array de booleanos
  // Tener en cuenta que la implementación del array de booleanos es al revés
  // que en el pseudo código facilitado en la guía.
  private static boolean[] cambioTrue(int n, int j, int i, boolean[] arr) {
	  // Cambiamos todos los valores dentro de n, múltiplo de i a true.
	  if(j<=n) {
		  arr[j]=true;
		  return cambioTrue(n,j+i,i,arr);
	  }
	  // Condición para salir del bucle.
	  else return arr;
  }
  
  // Método para obtener el Iterable final el cual será un 
  // NodePositionList<Integer>().
  private static Iterable<Integer> lista(boolean[] arr) {
	  PositionList<Integer> res = new NodePositionList<Integer>();
	  return listaAdd(arr, res, 2);
  }
  // Método auxiliar del metodo lista para ir añadiendo a la lista 
  // todos los valores que sean false en la lista de booleanos.
  private static PositionList<Integer> listaAdd(boolean[] arr, 
		  PositionList<Integer> res, int ind) {
	  // Condición para terminar el bucle.
	  if (ind>=arr.length) { return res; }
	  // Añadimos los valores false a la NodePositionList.
	  if(arr[ind]!=true) { res.addLast(ind); }
	  return listaAdd(arr, res, ind+1);
  }
  
  public static PositionList<Monomio> suma
  (PositionList<Monomio> p1, PositionList<Monomio> p2) {
	  PositionList<Monomio> lista = new NodePositionList<>();
	  return sumaAux(p1, p2, p1.first(), p2.first(), lista);
  }
  private static PositionList<Monomio> sumaAux (PositionList<Monomio> p1, 
		  PositionList<Monomio> p2, Position<Monomio> pos1, 
		  Position<Monomio> pos2, PositionList<Monomio> lista){
	  // Nos aseguramos que las listas no hayan acabado
	  if(pos1!=null&&pos2!=null) {
		  Monomio el1 = pos1.element();
		  Monomio el2 = pos2.element();
		  // Si los coeficientes no son iguales, se añaden a la lista,
		  // y se pasa al siguiente monomio. 
		  if(esMayor(el1, el2)) {
			  lista.addLast(el1);
			  pos1 = p1.next(pos1);
		  }
		  else if(esMayor(el2, el1)) {
			  lista.addLast(el2);
			  pos2 = p2.next(pos2);
		  }
		  // Si son iguales, se suman sus coeficientes y
		  // se añaden a la lista si no son 0.
		  else {
			  int coef = el1.getCoeficiente()+el2.getCoeficiente();
			  if(coef!=0) {
				  lista.addLast(new Monomio(coef, el1.getExponente()));
			  }
			  pos1 = p1.next(pos1); pos2 = p2.next(pos2);
		  }
		  return sumaAux(p1, p2, pos1, pos2, lista);
	  }
	  // Cuando se termina con una lista añadir los monomios de la otra
	  // a la lista final.
	  if(pos1==null) { return addHastaFin(p2, pos2, lista); }
	  else { return addHastaFin(p1, pos1, lista); }
  }
    
  // Método auxiliar para determinar si m1 es de mayor grado que m2.
  private static boolean esMayor(Monomio m1, Monomio m2) {
	  return m1.getExponente()>m2.getExponente();
  }
  // Método auxiliar para ir añadiendo hasta el final de la lista
  private static PositionList<Monomio> addHastaFin(PositionList<Monomio> p, 
		  Position<Monomio> pos, PositionList<Monomio> resultado) {
	  // Añado a la lista resultado los monomios que faltan de p, a partir de pos
	  if(pos==null) { return resultado; }
	  else {
		  resultado.addLast(pos.element());
		  return addHastaFin(p, p.next(pos), resultado);
	  }
  }
}
