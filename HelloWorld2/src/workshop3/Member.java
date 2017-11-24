package workshop3;

import java.text.MessageFormat;

import workshop2.*;

public class Member extends Person {

	int memberNumber;

	public Member(String surName, String firstName, String secondName, int memberNumber) {
		super(surName, firstName, secondName);
		
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return MessageFormat.format("{0} : {1}", super.toString(), this.memberNumber);
	}
	
	public void show() {
		System.out.println(MessageFormat.format("{1}\t :\t {0}", this.toString(), this.memberNumber));
	}

}
