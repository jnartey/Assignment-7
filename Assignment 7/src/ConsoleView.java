/**
 * To display message on console view
 */

/**
 * @author Jacob Nartey
 *
 */
public abstract class ConsoleView extends View {

	/* (non-Javadoc)
	 * @see View#display(java.lang.String)
	 */
	@Override
	void display(String message) {
		System.out.println(message);
	}

}
