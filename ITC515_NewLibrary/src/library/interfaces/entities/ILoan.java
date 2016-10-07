//package that the EBookState.java exists
package library.interfaces.entities;

//importing java util Date file
import java.util.Date;

//a public interface has been created
public interface ILoan {
	
	//a static and final integer variable has been created
	public static final int LOAN_PERIOD = 14;
	
	//commit method with integer parameter and no return type is created
	public void commit(int id);
	
	//definition of a no return type method has been created
	public void complete();
	
	//definition of the boolean return type method
	public boolean isOverDue();
	
	//definition  of the boolean return type with the date parameter
	public boolean checkOverDue(Date currentDate);
	
	//accessing the borrower details from the IMember class
	public IMember getBorrower();
	
	//accessing the details of the book from IBook
	public IBook getBook();
	
	public int getID();
	

}
