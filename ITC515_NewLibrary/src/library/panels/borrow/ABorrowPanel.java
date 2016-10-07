//package the location of the ABorrowPanel1
package library.panels.borrow;

//importing the javax swing
import javax.swing.JPanel;

import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;

//abstract class extends Jpanel and implementing IBroowUI
public abstract class ABorrowPanel extends JPanel implements IBorrowUI {

	private static final long serialVersionUID = 1L;
    //private static and final long variable
	
	//no return type method with EBorrowState parameter
	@Override
	public void setState(EBorrowState state) {
		throw new RuntimeException("Illegal operation in current state");//throwing runtime exception	
	}

	//displaying member list method with no return type and parameters
	@Override
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		throw new RuntimeException("Illegal operation in current state");//throwing runtime exception	
	}

	//no return type method with string parameters
	@Override
	public void displayExistingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");//throwing runtime exception	
	}

	
	@Override
	public void displayOverDueMessage() {
		throw new RuntimeException("Illegal operation in current state");//throwing exception	
	}

	
	@Override
	public void displayAtLoanLimitMessage() {
		throw new RuntimeException("Illegal operation in current state");//throwing runtime exception	
	}

	
	@Override
	public void displayOutstandingFineMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");//throwing runtime exception	
	}

	@Override
	public void displayOverFineLimitMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");	//throwing runtime exception	
	}


	@Override
	public void displayScannedBookDetails(String bookDetails) {
		throw new RuntimeException("Illegal operation in current state");	//throwing runtime exception	
	}

	
	@Override
	public void displayPendingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");	//runtime exception 	
	}

	
	@Override
	public void displayConfirmingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");	//throwing runtime exception	
	}

	
	@Override
	public void displayErrorMessage(String errorMesg) {
		throw new RuntimeException("Illegal operation in current state");		
	}
	
}
