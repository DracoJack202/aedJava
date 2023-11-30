package aed.individual1;

public class ArrayCheckSumUtils {

  // a no es null, podria tener tamaño 0, n>0
  public static int[] arrayCheckSum(int[] arr, int n) {
	  
	// Defino el tamaño del arrayFinal, la cual siempre será 1 mayor que el arr.
	// El tamaño se reduce en 1 si es exacta la división.
	// Creo el arrayFinal.
	int tamaño = arr.length+1+arr.length/n;
	if(arr.length%n==0) tamaño--;
    int[] arrayFinal = new int[tamaño];
    
    // Compruebo que el arr no esté vacío.
    // Empiezo el bucle si es cierto que no está vacío
    if (arr.length!=0) {
	    for (int iArr=0, iArrFin=0, checkSum=0; iArr<arr.length; iArr++, iArrFin++) {
	    	
	    	// checkSum es una variable que almacenará el valor de la suma
	    	checkSum+=arr[iArr];
	    	
	    	arrayFinal[iArrFin]=arr[iArr];
	    	
	    	// Compruebo si tengo que añadir el sumatorio al arrayFinal
	    	if ((iArr+1)%n==0&&iArr!=arr.length-1) {
	    		iArrFin++; arrayFinal[iArrFin]=checkSum; checkSum=0;
	    		}
	    	else if (iArr==arr.length-1) {
	    		arrayFinal[iArrFin+1]=checkSum;
	    		}
	    	}
	    }
    
    return arrayFinal;
  }
}


