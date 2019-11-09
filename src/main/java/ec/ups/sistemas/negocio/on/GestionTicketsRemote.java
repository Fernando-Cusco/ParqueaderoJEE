package ec.ups.sistemas.negocio.on;

import javax.ejb.Remote;

import ec.ups.sistemas.negocio.en.Ticket;
import ec.ups.sistemas.negocio.en.Vehiculo;

@Remote
public interface GestionTicketsRemote {

	public int numeroTicketNext();
	
	public String obtenerHoraActual();
	
	public Vehiculo buscarVehiculo(String placa);
	
	public boolean guardarVehiculo(Vehiculo v);
	
	public boolean registrarTicket(Ticket t);
	
	public Vehiculo buscarIdVehiculo(String placa);
	
	public boolean isOpenTicket(int idVehiculo);
	
	public Ticket buscarNumeroTicket(int numero);
	
	public boolean pagarTicket(Ticket t);
	
	public int calcularTiempo(String i, String f);
	
	public double calcularValor(int minutos);
	
}
