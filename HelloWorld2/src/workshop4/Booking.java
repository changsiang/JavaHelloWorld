package workshop4;
import java.sql.Date;

import workshop2.*;
import workshop3.Member;

public class Booking {
	
	private Member member;
	private Facility facility;
	private Date startDate;
	private Date endDate;
	
	public Booking (Member member, Facility facility, Date startDate, Date endDate) {
		this.member = member;
		this.facility = facility;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}

	public Member getMember() {
		return member;
	}

	public Facility getFacility() {
		return facility;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	
	public boolean overlaps(Booking AnotherBooking) {
		//Check if another booking is booking the same facility
		//If same facility, check for overlapping startDate and EndDate
		//If overlaps, return true; else false;
		int index = 0;
		if(AnotherBooking.getFacility() == this.facility) {
			//Case No.1 if anotherBooking startDate is after this.booking startDate
			//&& before the this.booking endDate
			if(AnotherBooking.startDate.compareTo(this.endDate) < 0 
					&& AnotherBooking.endDate.compareTo(this.startDate) > 0)
				index = -1;
			
		}
		
	}

}
