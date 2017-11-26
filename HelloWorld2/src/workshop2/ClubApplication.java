/**
 * 
 */
package workshop2;
import workshop4.*;

/**
 * @author ChangSiang In the ClubApplication class's main() method, instantiate
 *         a few different Facility objects, using both constructors. For each
 *         instance, use the show() method to display to the console.
 *
 *
 */
public class ClubApplication {
	public static void main(String[] args) {
		Facility club1 = new Facility("Club1");
		Facility club2 = new Facility("Club 2", "This is club 2");
		Facility club3 = new Facility("Club3", "This is club number three");
		Person person1 = new Person("Tan", "Ah", "Beng");
		Person person2 = new Person("Stan", "Laurel", null);
		Club aClub = new Club();
		aClub.addMember("Tan", "Ah", "Kow");
		aClub.addMember("Tan", "Ah", "Lian");
		aClub.addMember("Esther", "Tan", null);
		aClub.addMember("Venkat", "Ramachandran", null);
		aClub.showMembers();
		aClub.removeMember(2);
		System.out.println("[---Remove Member Key \"2\"---]");
		aClub.showMembers();
		aClub.removeMember(4);
		System.out.println("[---Remove Member Key \"4\"---]");
		aClub.showMembers();
	}

}


