package workshop2;

import java.text.MessageFormat;

/**
 * @author ChangSiang
 * 
 *         Create a Facility class, which contains two attributes, both String
 *         objects: the name of the facility, and a short description. The
 *         description is not mandatory (it can be null), so you should provide
 *         the class with two constructors: one that accepts initialisation
 *         values for both attributes, and one that accepts only the facility's
 *         name.
 * 
 *         Add public accessor method getName(), and getDescription() so that
 *         the attributes of Facility can be read. Tips: Eclipse's Source >
 *         Generate Getters and Setters... is convenient.
 * 
 *         Provide the Facility class with a show() method that will display on
 *         the same line the facility name and, if present, the description of
 *         the facility between parenthesis.
 *
 */

public class Facility {

	private String name;
	private String description;

	// This is constructor. Refer to Person.java for how to generate

	public Facility(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Facility(String name) {
		super();
		this.name = name;
		this.description = null;
	}

	// This is public accessors. Refer to Person.java on how to generate
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	// This will be show() method with if/else condition to handle different
	// instantiation by different constructor

	public void show() {
		if(this.description != null) {
			System.out.println(this.toString());
		}else {
			System.out.println(this.name);
		}
		
	}
	
	//For consistency, provide toString() method in the facility class
	
	@Override
	public String toString() {
		
		return MessageFormat.format("{0} ({1})", this.name, this.description);
	}

}
