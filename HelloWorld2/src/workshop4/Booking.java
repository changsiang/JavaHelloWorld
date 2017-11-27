package workshop4;

import java.sql.Date;
import java.text.MessageFormat;

import workshop2.*;
import workshop3.Member;

public class Booking {

	private Member member;
	private Facility facility;
	private Date startDate;
	private Date endDate;

	public Booking(Member member, Facility facility, Date startDate, Date endDate) {
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
		// Check if another booking is booking the same facility
		// If same facility, check for overlapping startDate and EndDate
		// If overlaps, return true; else false;

		if (AnotherBooking.getFacility() == this.facility) {
			// Case No.1 if anotherBooking startDate is after this.booking startDate
			// && before the this.booking endDate

			// if Booking dates overlaps
			if (AnotherBooking.getStartDate().equals(this.startDate)
					|| AnotherBooking.getEndDate().equals(this.endDate)) {
				return true;
			}
			// Left overlap of AnotherBooking on this.booking
			else if (AnotherBooking.getEndDate().after(this.startDate)
					&& AnotherBooking.getStartDate().before(this.startDate)) {
				return true;
			}
			// Inner overlap of AnotherBooking on this.booking
			else if (AnotherBooking.getEndDate().after(this.startDate)
					&& AnotherBooking.getStartDate().before(this.startDate)) {
				return true;
			}
			// Right overlap of AnotherBooking on this.booking
			else if (AnotherBooking.getEndDate().after(this.endDate)
					&& AnotherBooking.getStartDate().before(this.endDate)) {
				return true;
			} else
				return false;

		} else
			return false;

	}

	@Override
	public String toString() {
		return MessageFormat.format("Member Name: {0}\nFacility: {1}\nStart Date: {2}\nEndDate: {3}", this.member,
				this.facility, this.startDate, this.endDate);

	}
	
	public void show() {
		System.out.println(this.toString());
	}
	
	

}
