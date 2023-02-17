package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) { //aqui vou testar se a data de saída é depois da data de entrada
			throw new DomainException("Check-out date must be after check-in date");
			}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
//Apagar o set de check in e out, pois teremos o método updateDates
	
	public long duration() {
		//usaremos o long para calcular a diferença entre 2 datas, pois os métodos retornam long
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //Converte em dias os milesegundos.
	}
	
	public void updateDates (Date checkIn, Date checkOut) throws DomainException{
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
		throw new DomainException("Check-out date must be after check-in date") ; //testo se são datas futuras
		} 
		if (!checkOut.after(checkIn)) { //aqui vou testar se a data de saída é depois da data de entrada
		throw new DomainException("Check-out date must be after check-in date");
		}
				
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
}
