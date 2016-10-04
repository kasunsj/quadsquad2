//IMember.java in the package 
package library.interfaces.entities;

//importing the java util packages 
import java.util.List;

//interface method has been created 
public interface IMember {
	
	//static final integer variable 
	public static final int   LOAN_LIMIT = 5;
	
	//static final float variable 
	public static final float FINE_LIMIT = 10.0f;	
	
	//boolean methods
	//defining hasOverDueLoans method
	public boolean hasOverDueLoans();
	
	//defining hasReachedLoanLimit method
	public boolean hasReachedLoanLimit();
	
	//defining hasFinesPayable method
	public boolean hasFinesPayable();
	
	//defining hasReachedFineLimit method
	public boolean hasReachedFineLimit();
	
	//float methods
	//defining getFineAmount method
	public float   getFineAmount();
	
	//no return type methods are defined simply void methods
	// definition of addFine method
	public void    addFine(float fine);

	//definition of payFine method
	public void    payFine(float payment);
	
	//definition of addLoan method
	public void    addLoan(ILoan loan);
	
	//List formated getLoans method has been defined
	public List<ILoan> getLoans();
	
	//definition of removeLoan  
	public void    removeLoan(ILoan loan);
	
	//defining EMemberState method
	public EMemberState   getState();
	
	//accessor methods getFirstName with string return type
	public String  getFirstName();
	
	//accessor method getLastName with string return type
	public String  getLastName();
	
	//
	public String  getContactPhone();
	
	//
	public String  getEmailAddress();
	
	
	public int     getID();
	

}
