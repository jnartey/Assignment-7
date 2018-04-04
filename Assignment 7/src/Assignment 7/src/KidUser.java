/**
 * 
 */

/**
 * @author Jacob Nartey
 *
 */
public class KidUser implements LibraryUser {
	protected int age;
	protected String bookType;
	
	/**
	 * @param age
	 * @param bookType
	 */
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	public KidUser() {
		
	}
	
	/* (non-Javadoc)
	 * @see LibraryUser#registerAccount(int)
	 */
	@Override
	public String registerAccount() {
		String response = "";
		
		if(age < 12 && age > 0) {
			response = "You have successfully registered under a Kids Account";
		}else if(age > 12) {
			response = "Sorry, Age must be less than 12 to register as a kid";
		}
		
		return response;
	}
	
	/* (non-Javadoc)
	 * @see LibraryUser#requestBook(java.lang.String)
	 */
	@Override
	public String requestBook() {
		String response = "";
		
		if(bookType == "Kids") {
			response = "Book Issued successfully, please return the book within 10 days";
		}else {
			response = "Oops, you are allowed to take only kids books";
		}
		
		return response;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
}
