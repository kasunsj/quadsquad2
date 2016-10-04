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
	
	//defining hasFinesPayable
	public boolean hasFinesPayable();
	
	//defining hasReachedFineLimit
	public boolean hasReachedFineLimit();
	
	//
	public float   getFineAmount();
	
	public void    addFine(float fine);

	public void    payFine(float payment);
	
	public void    addLoan(ILoan loan);
	
	public List<ILoan> getLoans();
	
	public void    removeLoan(ILoan loan);
	
	public EMemberState   getState();
	
	public String  getFirstName();
	
	public String  getLastName();
	
	public String  getContactPhone();
	
	public String  getEmailAddress();
	
	public int     getID();
	

}
