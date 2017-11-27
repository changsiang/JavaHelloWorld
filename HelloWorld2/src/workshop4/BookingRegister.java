package workshop4;

import java.util.ArrayList;
import java.util.HashMap;

import workshop2.Facility;

public class BookingRegister {
	
	private HashMap<Facility, ArrayList<Booking>[]> bookingRegister = new HashMap<Facility,ArrayList<Booking>[]>();

	public BookingRegister(HashMap<Facility, ArrayList<Booking>[]> bookingRegister) {
		super();
		this.bookingRegister = bookingRegister;
	}
	

}
