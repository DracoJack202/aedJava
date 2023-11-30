package aed.polinomios;

import java.util.Arrays;
import java.util.function.BiFunction;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


/**
 * Operaciones sobre polinomios de una variable con coeficientes enteros.
 */
public class Polinomio {

  // Una lista de monomios
  PositionList<Monomio> terms;

  /**
   * Crea el polinomio "0".
   */
  public Polinomio() {
    terms = new NodePositionList<>();
  }

  /**
   * Crea un polinomio definado por una lista con monomios.
   * @param terms una lista de monomios
   */
  public Polinomio(PositionList<Monomio> terms) {
    this.terms = terms;
  }

  /**
   * Crea un polinomio definado por un String.
   * La representación del polinomio es una secuencia de monomios separados
   * por '+' (y posiblemente con caracteres blancos).
   * Un monomio esta compuesto por tres partes,
   * el coefficiente (un entero), el caracter 'x' (el variable), y el exponente
   * compuesto por un un caracter '^' seguido por un entero.
   * Se puede omitir multiples partes de un monomio, 
   * ejemplos:
   * <pre>
   * {@code
   * new Polinomio("2x^3 + 9");
   * new Polinomio("2x^3 + -9");
   * new Polinomio("x");   // == 1x^1
   * new Polinomio("5");   // == 5x^0
   * new Polinomio("8x");  // == 8x^1
   * new Polinomio("0");   // == 0x^0
   * }
   * </pre>
   * @throws IllegalArgumentException si el argumento es malformado
   * @param polinomio - una secuencia de monomios separados por '+'
   */
  public Polinomio(String polinomio) {
	// Primero un split para conseguir cada monomio.
    String[] splat = polinomio.split("\\+");
    // Resultado será lo que se volverá terms.
    NodePositionList<Monomio> resultado = new NodePositionList<Monomio>();
    
    for (int i=0; i<splat.length; i++) {
    	// Dividiremos los monomios en 2 categorías, con x y sin x.
    	if(splat[i].contains("x")) {
    		
    		// Caso 1: El monomio tiene x.
    		
    		// Defino 2 String[] auxiliares para utilizar más adelante.
    		String[] aux = splat[i].split("x");
    		String[] aux2 = new String[2];
    		
    		// Ahora dividimos de nuevo en 2 tipos, 
    		// los que tienen un exponente N y los que no.
    		if(aux.length>1&&(contieneNumero(aux[1])||contieneCero(aux[1]))) {
    			
        		// Caso 1a: Tiene exponente N
    			
    			// Si la k = 1, lo especificamos con esto.
    			if(!contieneNumero(aux[0])) {
    				aux[0]="1";
    			}
    			
    			// Eliminamos el ^.
    			aux[1]=aux[1].split("\\^")[1];
    		}
    		//
    		else {
    			
    			// Caso 1b: La x no tiene exponente N
    			
    			// Comprobamos que sí tenga coeficiente y ponemos el valor de 1 al exponente.
    			if(aux.length>0&&contieneNumero(aux[0])) {
    			aux2[0]=aux[0]; aux2[1]="1"; aux=aux2;
    			}
    			
    			// En caso de que no tenga coeficiente, 
    			// le damos el valor de 1 al coeficiente y al exponente
    			else {
    				aux2[0]="1"; aux2[1]="1"; aux=aux2;
    			}
    		}
    		// Paso final del Caso 1, añadir el monomio 
    		// con método parseInt al NodePositionList resultado
    		resultado.addLast(new Monomio(
    				Integer.parseInt(aux[0].trim()),Integer.parseInt(aux[1].trim())));
    	}
    	
    	else if(contieneNumero(splat[i])){
    		
    		// Caso 2: Tiene coeficiente, pero no tiene x
    		
    		// Añado el monomio, asegurándome de que el exponente sea 0.
    		resultado.addLast(new Monomio(Integer.parseInt(splat[i].trim()),0));
    	}
    }
    
    // Si el constructor no se ha formado lanzar un IllegalArgumentException
//    if (resultado.isEmpty()) {
//    	throw new IllegalArgumentException("No se ha podido formar el polinomio");
//    }
    // Edit: No estoy muy seguro de cuando quiere que lance un IllegalArgumentException
    // porque si tenemos un 0 sin más debería ser un illegal argument.
    
    // Resultado se vuelve terms y queda terminado el constructor
    terms = resultado;
  }
  
  // Función auxiliar para determinar si contiene un número - {0}.
  private boolean contieneNumero (String s) {
	  return s.contains("1")||s.contains("2")||s.contains("3")
			  ||s.contains("4")||s.contains("5")||s.contains("6")
			  ||s.contains("7")||s.contains("8")||s.contains("9");
  }
  
  // Función auxiliar para determinar si contiene un 0
  private boolean contieneCero (String s) {
	  return s.contains("0");
  }

  /**
   * Suma dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return la suma de los polinomios.
   */
  public static Polinomio suma(Polinomio p1, Polinomio p2) {
	  
	  Position<Monomio> auxP1 = p1.terms.first();
	  Position<Monomio> auxP2 = p2.terms.first();
	  PositionList<Monomio> resultado = new NodePositionList<>();
	  boolean fin = false; // Queremos esto para poder poner fin rápidamente al bucle
	  
	  while(!fin) {
		  
		  // Dividimos en 3 casos.
		  
		  if(auxP1 != null && auxP2 != null) {
			  
			  // Caso 1: No hemos llegado al final de ningún polinomio
			  
			  Monomio m1 = auxP1.element();
			  Monomio m2 = auxP2.element();
			  boolean cicloFin = false;		// Nos sirve para saber si hemos añadido al
			  								// resultado algún monomio
			  
			  // Volvemos a dividir en 3 casos
			  
			  if(esMayor(m1,m2)) {
				  
				  // Caso 1a: El grado de m1 > el grado m2
				  
				  resultado.addLast(m1);
				  auxP1 = p1.terms.next(auxP1);
				  cicloFin = true;
			  }
			  
			  if(!cicloFin&&esMayor(m2,m1)) {
				  
				  // Caso 1b: El grado de m2 > el grado m1. Si hemos añadido algo en
				  // en el anterior if(), no entra en este if().
				  
				  resultado.addLast(m2);
				  auxP2 = p2.terms.next(auxP2);
				  cicloFin = true;
			  }
			  
			  if(!cicloFin) {
				  
				  // Caso 1c: El grado de m1 = el grado m2. Esto ocurre si no hemos entrado
				  // en ninguno de los if() anteriores. Sumamos los coeficientes de m1 y m2,
				  // si la suma de coeficientes da 0, no lo añadimos.
				  
				  int m1Coef = m1.getCoeficiente();
				  int m2Coef = m2.getCoeficiente();
				  int suma = m1Coef + m2Coef;
				  
				  if(suma!=0) {
					  resultado.addLast(new Monomio(suma, m1.getExponente()));
				  }
				  
				  auxP1 = p1.terms.next(auxP1);
				  auxP2 = p2.terms.next(auxP2);  
			  }
			  
		  }
		  
		  if(auxP1 == null) {
			  
			  // Caso 2: Hemos llegado al final del polinomio p1
			  
			  fin=true;
			  addHastaFin(resultado, auxP2, p2);
		  }
		  
		  if(auxP2 == null && !fin) {
			  
			  // Caso 3: Hemos llegado al final del polinomio p2, sin haber llegado
			  // al final del polinomio p1 y sin haber entrado al Caso 2.
			  
			  fin = true;
			  addHastaFin(resultado, auxP1, p1);
		  }
	  }
	  // Devolvemos el polinomio que sería la suma de los polinomios dados.
	  return new Polinomio(resultado);
  }
    
  // Método auxiliar para determinar si m1 es de mayor grado que m2.
  private static boolean esMayor(Monomio m1, Monomio m2) {
	  return m1.getExponente()>m2.getExponente();
  }
  
  // Método auxiliar para ir añadiendo hasta el final de la lista
  private static void addHastaFin(PositionList<Monomio> resultado, 
		  Position<Monomio> auxP, Polinomio p) {
	  
	  // Añado a la lista resultado los monomios que faltan de p, a partir de auxP
	  while(auxP!=null) {
		  resultado.addLast(auxP.element());
		  auxP = p.terms.next(auxP);
	  }
  }
  /**
   * Substraccion de dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return la resta de los polinomios.
   */
  public static Polinomio resta(Polinomio p1, Polinomio p2) {
	  // Una resta no es más que una suma de dos polinomios pero uno con los
	  // signos opuestos en cada uno de sus términos.
	  Polinomio p2Neg = negativo(p2);
	  return suma(p1, p2Neg);
  }
    
  // Método auxiliar para cambiarle el signo al polinomio
  private static Polinomio negativo(Polinomio p) {
	  
	  PositionList<Monomio> resultado = new NodePositionList<>();
	  Position<Monomio> auxP = p.terms.first();
	  
	  //Mismos coeficientes pero con signos opuestos
	  while(auxP!=null) {
		  Monomio m = auxP.element();
		  resultado.addLast(new Monomio(-m.getCoeficiente(),m.getExponente()));
		  auxP = p.terms.next(auxP);
	  }
	  return new Polinomio(resultado);
  }
  /**
   * Calcula el producto de dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return el producto de los polinomios.
   */
  public static Polinomio multiplica(Polinomio p1, Polinomio p2) {
	  
	  Polinomio resultado = new Polinomio();
	  Position<Monomio> auxP1 = p1.terms.first();
	  
	  // Bucle principal en el que me aprovecho de la multiplicacion
	  // de Monomio*Polinomio y voy utilizando la suma para sumárselo al resultado.
	  
	  // PD: Efecto secundario de suma() es que se va ordenando el polinomio.
	  while(auxP1!=null) {
		  Monomio m1 = auxP1.element();
		  resultado = suma(resultado,multiplica(m1,p2));
		  auxP1 = p1.terms.next(auxP1);
	  }
	  return resultado;
  }

  /**
   * Calcula el producto de un monomio y un polinomio.
   * @param m el monomio
   * @param p el polinomio
   * @return el producto del monomio y el polinomio
   */
  public static Polinomio multiplica(Monomio m, Polinomio p) {
	  
	  PositionList<Monomio> resultado = new NodePositionList<>();
	  Position<Monomio> auxP = p.terms.first();
	  
	  // Bucle principal, va multiplicando los coeficientes y las x,
	  // como las x tienen misma base, al multiplicarse se suman los exponentes.
	  while(auxP!=null) {
		  Monomio mPol = auxP.element();
		  resultado.addLast(new Monomio(m.getCoeficiente()*mPol.getCoeficiente(),
				  m.getExponente()+mPol.getExponente()));
		  auxP = p.terms.next(auxP);
	  }
	  
	  return new Polinomio(resultado);
  }
    
  /**
   * Devuelve el valor del polinomio cuando su variable es sustiuida por un valor concreto.
   * @param valor el valor asignado a la variable del polinomio
   * @return el valor del polinomio para ese valor de la variable.
   */
  public long evaluar(int valor) {
	  
	  long resultado=0;
	  Position<Monomio> auxP = terms.first();
	  
	  // Bucle principal, irá sumando al resultado el valor 
	  // igual a coeficient*valor^exponente
	  while(auxP!=null) {
		  Monomio m = auxP.element();
		  resultado += m.getCoeficiente()*potencia(valor,m.getExponente());
		  auxP = terms.next(auxP);
	  }
	  return resultado;
  }
  
  // Método auxiliar para evaluar el polinomio
  private long potencia(int base, int exponente) {
	  
	  long resultado=1;
	  
	  for(int i = 0; i<exponente&&exponente>0; i++) {
		  resultado*=base;
	  }
	  return resultado;
  }

  /**
   * Devuelve el exponente (grado) del monomio con el mayor grado
   * dentro del polinomio
   * Si el polinomio es vacio (la representacion del polinomio "0") entonces
   * el valor devuelto debe ser -1.
   * @return el grado del polinomio
   */
  public int grado() {
	  
	  int grado = -1;
	  
	  if (terms.size()>0) {
		  	grado = terms.first().element().getExponente();
	  }
	  return grado;
  }
  
//	Código para equals que al final no se utiliza.
  public boolean equals(Object o) {
	  boolean iguales = true;
	  Polinomio p2 = new Polinomio();
	  if(!getClass().equals(o.getClass())) {
		  iguales = false;
	  }
	  else {
		 p2 = (Polinomio)o;
	  }
	  if(terms.size()!=p2.terms.size()) {
		  iguales = false;
	  }
	  if(iguales&&terms.size()>0&&p2.terms.size()>0) {
		  Position<Monomio> auxP1 = terms.first();
		  Position<Monomio> auxP2 = p2.terms.first();
		  
		  while(iguales&&(auxP1!=null&&auxP2!=null)) {
			  Monomio m1 = auxP1.element();
			  Monomio m2 = auxP2.element();
			  iguales = m1.equals(m2);
			  auxP1 = terms.next(auxP1);
			  auxP2 = p2.terms.next(auxP2); 
		  }
	  }
	  return iguales;
  }

  @Override
  public String toString() {
    if (terms.isEmpty()) return "0";
    else {
      StringBuffer buf = new StringBuffer();
      Position<Monomio> cursor = terms.first();
      while (cursor != null) {
        Monomio p = cursor.element();
        int coef = p.getCoeficiente();
        int exp = p.getExponente();
        buf.append(new Integer(coef).toString());
        if (exp > 0) {
          buf.append("x");
          buf.append("^");
          buf.append(new Integer(exp)).toString();
        }
        cursor = terms.next(cursor);
        if (cursor != null) buf.append(" + ");
      }
      return buf.toString();
    }
  }
}
