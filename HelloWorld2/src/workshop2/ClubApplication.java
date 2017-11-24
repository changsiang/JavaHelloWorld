/**
 * 
 */
package workshop2;
import workshop3.*;

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
		
		

		club1.show();
		club2.show();
		club3.show();
		person1.show();
		person2.show();

	}

}
