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
	
	public boolean isOverDue();
	
	public boolean checkOverDue(Date currentDate);
	
	public IMember getBorrower();
	
	public IBook getBook();
	
	public int getID();
	

}
