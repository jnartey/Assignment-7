/**
 * Abstract class is not a requirement in this assignment
 * but added View and ConsoleView abstract classes to display in console
 */

/**
 * @author Jacob Nartey
 *
 */
public class LibraryInterfaceDemo extends ConsoleView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConsoleView ConsoleView = new LibraryInterfaceDemo();
		
		//Test case #1
		//Instantiating KidUser class
		KidUser kid = new KidUser();
		
		//Setting age 10
		kid.setAge(10);
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(kid.registerAccount());
		
		
		//Setting age 18
		kid.setAge(18);
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(kid.registerAccount());
		
		//Setting book type "Kids"
		kid.setBookType("Kids");
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(kid.requestBook());
		
		//Setting book type "Fiction"
		kid.setBookType("Fiction");
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(kid.requestBook());
		
		//Test case #2
		//Instantiating AdultUser class
		AdultUser adult = new AdultUser();
		
		//Setting age 5
		adult.setAge(5);
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(adult.registerAccount());
		
		
		//Setting age 23
		adult.setAge(23);
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(adult.registerAccount());
		
		//Setting book type "Kids"
		adult.setBookType("Kids");
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(adult.requestBook());
		
		//Setting book type "Fiction"
		adult.setBookType("Fiction");
		//displaying on console using ConsoleView abstract class
		ConsoleView.display(adult.requestBook());
	}

}
