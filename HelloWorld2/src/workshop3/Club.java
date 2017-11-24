package workshop3;

import java.util.Collection;
import java.util.HashMap;

public class Club {

	static int memberNumber;
	HashMap<Integer, Member> members = new HashMap<Integer, Member>();

	public Club(HashMap<Integer, Member> members) {
		super();
		this.members = members;
	}

	public int addMember(String surName, String firstName, String secondName) {
		memberNumber++;
		Member member = new Member(surName, firstName, secondName, memberNumber);
		members.put(memberNumber, member);

		return memberNumber;

	}

	public Member removeMember(int removeMemberNumber) {
		Member member = members.get(removeMemberNumber);
		members.remove(removeMemberNumber);
		return member;
	}

	/*
	 * 12) Add a showMembers() method to class Club. It should display a list with
	 * each member of the club on a separate line. Make this routine very simple, by
	 * using the Member class methods
	 * 
	 * I am very last, so I convert the Hashmap to a Collection. Using foreach, loop
	 * through the Collection and use Member.show() method to point the members
	 * information
	 */

	public void showMembers() {

		Collection<Member> memberCollection = members.values();
		System.out.println("Member Number\t :\t Name");
		System.out.println("------------------------");
		for (Member member : memberCollection) {
			member.show();

		}

	}

}
