package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string
 *
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
    String[] rotated = new String[input.length()];
    for (int i = 0; i < input.length; i++){
      rotated[i] = input.charAt(i);
    }
    String[] build = new String[input.length()];
    for (int j = 0; j < input.length() - 2; j++){
      build[j] = rotated[j + 2]
    }
    build[input.length() - 1] = rotated[1];
    build[input.length() - 2] = rotated[0];
    String done = "";
    for (int i = 0; i < build.length; i++){
      done += build[i];
    }
	  return null;
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
