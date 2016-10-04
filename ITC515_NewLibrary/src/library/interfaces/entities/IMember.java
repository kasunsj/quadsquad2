//IMember.java in the package 
package library.interfaces.entities;

//importing the java util packages 
import java.util.List;

//interface method has been created 
public interface IMember {
	
	public static final int   LOAN_LIMIT = 5;
	
	public static final float FINE_LIMIT = 10.0f;	
	
	
	public boolean hasOverDueLoans();
	
	public boolean hasReachedLoanLimit();
	
	public boolean hasFinesPayable();
	
	public boolean hasReachedFineLimit();
	
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
