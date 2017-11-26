package workshop4;

import java.util.ArrayList;

import workshop3.Member;

/*Arrays are not a very flexible way of storing a dynamic list such as our members' list. We
will modify class Club so that it uses an ArrayList to keep its list of members, instead
of its current Member[] array object*/

public class Club {

	static int memberNumber;
	ArrayList<Member> members = new ArrayList<Member>();

	public Member addMember(String surName, String firstName, String secondName) {
		memberNumber++;
		Member member = new Member(surName, firstName, secondName, memberNumber);
		members.add(member);

		return member;

	}

	public Member removeMember(int removeMemberNumber) {
		int index = 0;
		for (Member m : members) {
			if (m.getMemberNumber() == removeMemberNumber)
				index = members.indexOf(m);					
		}
		return members.remove(index);
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

		System.out.println("ID\t :\t Name");
		System.out.println("------------------------");
		for (Member member : this.members) {
			member.show();

		}

	}

}
