package aed.hotel;

import es.upm.aedlib.indexedlist.*;


/**
 * Implementa el interfaz Hotel, para realisar y cancelar reservas en un hotel,
 * y para realisar preguntas sobre reservas en vigor.
 */
public class MiHotel implements Hotel {
  /**
   * Usa esta estructura para guardar las habitaciones creados.
   */
  private IndexedList<Habitacion> habitaciones;

  /**
   * Crea una instancia del hotel. 
   */
  public MiHotel() {
    // No se debe cambiar este codigo
    this.habitaciones = new ArrayIndexedList<>();
  }
  
  public void anadirHabitacion(Habitacion habitacion) throws IllegalArgumentException {

	  int indHab = buscarHabitacion(habitacion.getNombre(), true);
	  if (indHab<0) {
		  throw new IllegalArgumentException("Existe la habitacion ya");
	  }
		  habitaciones.add(habitaciones.size(), habitacion);
  }
  
  public boolean reservaHabitacion(Reserva reserva) throws IllegalArgumentException {
	  int indHab = buscarHabitacion(reserva.getHabitacion(), false);
	  if (indHab<0) {
		  throw new IllegalArgumentException("No existe la habitacion");
	  }
	  Habitacion habitacionAux = habitaciones.get(indHab);
	  IndexedList<Reserva> habReserv = habitacionAux.getReservas();
	  int size = habReserv.size();
	  boolean ocupado = false; boolean reservAdded = false;
	  if (size>0) {
		  Reserva reservAux = habReserv.get(0);
		  if (size>1) {
			  for(int i=1; i<size&&size>0&&!ocupado&&!reservAdded; i++) {
				  Reserva reservSig = habReserv.get(i);
				  if (diaEntradaDentro(reserva.getDiaEntrada(), reservAux) || 
						  diaSalidaDentro(reserva.getDiaSalida(), reservSig) ||
						  diaEntradaDentro(reservAux.getDiaEntrada(), reserva) ||
						  diaSalidaDentro(reservAux.getDiaSalida(), reserva)) {
					  ocupado = true;
				  }
				  else if(enMedias(reserva, reservAux, reservSig)) {
					  habitaciones.get(indHab).getReservas().
					  	add(addOrdenado(habReserv, reserva), reserva);
					  reservAdded = true;
				  }
				  reservAux = reservSig;
				  if(i==size-1&&diaEntradaDentro(reserva.getDiaEntrada(), reservAux)) {
					  ocupado = true;
				  }
			  }
		  }
		  else {
			  if (fechaEsAnterior(reserva.getDiaEntrada(), reservAux)) {
				  habitaciones.get(indHab).getReservas().add(1, reserva);
				  reservAdded = true;
			  }
			  else if (fechaEsPosterior(reserva.getDiaSalida(), reservAux)&&!reservAdded) {
				  habitaciones.get(indHab).getReservas().add(0, reserva);
				  reservAdded = true;
			  }
			  ocupado = !reservAdded;
		  }
	  }
	  if (!reservAdded&&!ocupado) {
		  habitaciones.get(indHab).getReservas().add(0, reserva);
	  }
	  return !ocupado;
  }
  
  private int buscarHabitacion(String habitacion, boolean invertido) throws IllegalArgumentException {
	  int size = habitaciones.size();
	  boolean encontrado = false;
	  int i=0;
	  while(i<size&&!encontrado) {
		  Habitacion habTemp = habitaciones.get(i);
		  encontrado = habTemp.getNombre().equals(habitacion);
		  if(!encontrado) i++;
	  }
	  if(invertido) { encontrado=!encontrado; }
	  if(encontrado) return i;
	  else return -1;
  }
  
  private boolean diaEntradaDentro(String diaEntrada, Reserva reservAux) {
	  return reservAux.getDiaEntrada().compareTo(diaEntrada)<=0 &&
			  reservAux.getDiaSalida().compareTo(diaEntrada)>0;
  }
  
  private boolean diaSalidaDentro(String diaSalida, Reserva reservSig) {
	  return reservSig.getDiaEntrada().compareTo(diaSalida)<0 &&
			  reservSig.getDiaSalida().compareTo(diaSalida)>=0;
  }
  
  private boolean enMedias(Reserva reserva, Reserva reservAux, Reserva reservSig) {
	  return fechaEsAnterior(reserva.getDiaEntrada(), reservAux) && 
			  fechaEsPosterior(reserva.getDiaSalida(), reservSig);
  }
  
  private boolean fechaEsAnterior (String diaEntrada, Reserva reservAux) {
	  return reservAux.getDiaSalida().compareTo(diaEntrada) <= 0;
  }
  
  private boolean fechaEsPosterior (String diaSalida, Reserva reservAux) {
	  return reservAux.getDiaEntrada().compareTo(diaSalida) >= 0;
  }
  
  private int addOrdenado (IndexedList<Reserva> lista, Reserva reserva) {
	  int size = lista.size(); int i=0; boolean mayor = false;
	  while(i<size&&!mayor) {
		  if(lista.get(i).getDiaSalida().compareTo(reserva.getDiaEntrada())<=0) {
			  mayor=true;
		  }
		  i++;
	  }
	  return i;
  }
  
  private int addOrdenado (IndexedList<Habitacion> lista, Habitacion habitacion) {
	  int size = lista.size(); int i=0; boolean menor = false;
	  while(i<size&&!menor) {
		  if(habitacion.getPrecio()<(lista.get(i).getPrecio())) {
			  menor=true;
		  }
		  if (!menor) i++;
	  }
	  return i;
  }
  
  
  
  public boolean cancelarReserva(Reserva reserva) throws IllegalArgumentException {
	  int indHab = buscarHabitacion(reserva.getHabitacion(), false);
	  if (indHab<0) {
		  throw new IllegalArgumentException("No existe la habitacion");
	  }
	  return habitaciones.get(buscarHabitacion(reserva.getHabitacion(), false)).
					 getReservas().remove(reserva);
  }

  public IndexedList<Habitacion> disponibilidadHabitaciones(String diaEntrada, String diaSalida){
	  
	  IndexedList<Habitacion> listaFinal = new ArrayIndexedList<>();
	  int sizeH = habitaciones.size();

	  for (int i = 0; i<sizeH&&sizeH>0; i++) {
		  
		  Habitacion habitacionAux = habitaciones.get(i);
		  IndexedList<Reserva> habReserv = habitacionAux.getReservas();
		  int sizeR = habReserv.size();
		  boolean disponible = true;
		  Reserva imaginaria = new Reserva("0","0",diaEntrada,diaSalida);
		  
		  if (sizeR>0) {
			  
			  Reserva reservAux = habReserv.get(0);
			  
			  for (int j=1; j<sizeR&&sizeR>1&&disponible; j++) {
				  Reserva reservSig = habReserv.get(j);
				  if (diaEntradaDentro(diaEntrada, reservAux) || 
						  diaSalidaDentro(diaSalida, reservSig)||
						  diaEntradaDentro(reservAux.getDiaEntrada(), imaginaria) ||
						  diaSalidaDentro(reservAux.getDiaSalida(), imaginaria)) {
					  disponible = false;
				  }
				  reservAux = reservSig;
				  if(i==sizeR-1&&diaEntradaDentro(diaEntrada, reservAux)) {
					  disponible = false;
				  }
			  }
			  
			  if (sizeR==1 &&
					  (!fechaEsAnterior(diaEntrada, reservAux) &&
							  !fechaEsPosterior(diaSalida, reservAux))) {
				  disponible = false;
			  }
		  }
		  
		  if (disponible) {
			  listaFinal.add(addOrdenado(listaFinal, habitacionAux), habitacionAux);
		  }
	  }
	  
	return listaFinal;
	  
  }
  
  public IndexedList<Reserva> reservasPorCliente(String dniPasaporte){
	  IndexedList<Reserva> listaFinal = new ArrayIndexedList<>();
	  int sizeH = habitaciones.size();
	  
	  for (int i = 0; i<sizeH&&sizeH>0; i++) {
		  
		  Habitacion habitacionAux = habitaciones.get(i);
		  IndexedList<Reserva> habReserv = habitacionAux.getReservas();
		  int sizeR = habReserv.size();
		  
		  for (int j=0; j<sizeR&&sizeR>0; j++) {
			  
			  Reserva resTemp = habReserv.get(j);
			  if(resTemp.getDniPasaporte().equals(dniPasaporte)) {
				  listaFinal.add(listaFinal.size(), resTemp);
			  }
		  }
	  }
	  return listaFinal;
  }
  
  public IndexedList<Habitacion> habitacionesParaLimpiar(String hoyDia){
	  IndexedList<Habitacion> listaFinal = new ArrayIndexedList<>();
	  int sizeH = habitaciones.size();
	  
	  for (int i = 0; i<sizeH&&sizeH>0; i++) {
		  
		  Habitacion habitacionAux = habitaciones.get(i);
		  IndexedList<Reserva> habReserv = habitacionAux.getReservas();
		  int sizeR = habReserv.size();
		  
		  for (int j=0; j<sizeR&&sizeR>0; j++) {
			  
			  Reserva resTemp = habReserv.get(j);
			  if(diaSalidaDentro(hoyDia, resTemp)) {
				  int sizeL = listaFinal.size(); int k = 0;
				  boolean mayor = false;
				  for (k=0; k<sizeL&&sizeL>0&&!mayor; k++) {
					  if(habitacionAux.compareTo(listaFinal.get(k))>0) {
						  mayor = true;
					  }
				  }
				  listaFinal.add(k, habitacionAux);
			  }
		  }
	  }
	  return listaFinal;
  }
  
  public Reserva reservaDeHabitacion(String nombreHabitacion, String dia) throws IllegalArgumentException {
	  Reserva reservaFinal = null;
	  int indHab = buscarHabitacion(nombreHabitacion, false);
	  if (indHab<0) {
		  throw new IllegalArgumentException("No existe la habitacion");
	  }
	  IndexedList<Reserva> habReserv = habitaciones.get(indHab).getReservas();
	  int sizeR = habReserv.size();
	  boolean encontrado = false;
	  
	  for(int i=0; i<sizeR&&sizeR>0&&!encontrado; i++) {
		  Reserva reservaAux = habReserv.get(i);
		  if (diaEntradaDentro(dia, reservaAux)) {
			  reservaFinal = reservaAux; encontrado = true;
		  }
	  }
	  return reservaFinal;
  }
}

