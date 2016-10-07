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
	
	//no return type method
	public void repair();
	
	//no return type method
	public void dispose();	
	
	//accessing EBookState 's get State method to get status of book
	public EBookState getState();
	
	//string return type method
	public String getAuthor();
	
	//string return type getTitle method 
	public String getTitle();
	
	//string return type getCallNumber method
	public String getCallNumber();
	
	//integer 
	public int getID();

}
