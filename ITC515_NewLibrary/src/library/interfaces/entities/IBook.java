//package in the IBook exists
package library.interfaces.entities;

//public interface IBook has been created
public interface IBook {
	
	//definition of the method borrow with no return type and ILoan parameter has been created
	public void borrow(ILoan loan);
	
	//access to the ILoan class method getLoan
	public ILoan getLoan();
	
	//no return type with boolean parameter has defined
	public void returnBook(boolean damaged);
	
	//no return type method defined
	public void lose();
	
	public void repair();
	
	public void dispose();	
	
	public EBookState getState();
	
	public String getAuthor();
	
	public String getTitle();
	
	public String getCallNumber();
	
	public int getID();

}
