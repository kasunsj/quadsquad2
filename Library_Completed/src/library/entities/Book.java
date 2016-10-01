package library.entities;

import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;

public class Book implements IBook{
	String author;
	String tittle;
	String callnumber;
	int bookid;
	ILoan loan;
	EBookState state;
        //a constructor with parameters
	public Book (String author,String tittle,String callnumber,int bookid) {
		// TODO Auto-generated constructor stub
		this.author=author;
		this.tittle=tittle;
		this.callnumber=callnumber;
		this.bookid=bookid;
                //return exception on null value
		if(author==null || tittle==null || callnumber==null || bookid<0){
			throw new IllegalArgumentException ("value is null");
		}
			}
        //a method to borrow the loan
	public void borrow(ILoan loan){
		this.loan=loan;
                //exception on not available condition
		if(getState()!=EBookState.AVAILABLE){
		throw new RuntimeException("books not available"); 
		}
	}
        // return book method to retrun book is damaged or not
		public void returnBook(boolean damaged){
			loan=null;
			if(getState()==EBookState.DAMAGED){
				state=EBookState.DAMAGED;
			}
			else {
				state=EBookState.AVAILABLE;
			}
                        //exception on when not available for loan
			 if(getState()!=EBookState.ON_LOAN){
				 throw new RuntimeException("books not available"); 	
			}
		}
	//lose method dor change state of book to lost
	public void lose(){
		state=EBookState.LOST;
		 if(getState()!=EBookState.ON_LOAN){
			 throw new RuntimeException("books not available"); 	
		}
	}
	//repair method to change the state of book to available
	public void repair(){
	state=EBookState.AVAILABLE;
	if(getState()!=EBookState.DAMAGED){
		throw new RuntimeException("books is not damaged");
	}
       
	}
	// dispose method to change the state of book to disposed
	public void dispose(){
		state=EBookState.DISPOSED;
		if(getState()!=EBookState.AVAILABLE && getState()!=EBookState.DAMAGED && getState()!=EBookState.LOST){
			throw new RuntimeException("books not available");
		}
	}
	

	//getter method or accessor method to get the value 
	public String getAuthor(){
		return author;
		
	}
	public String getTitle(){
	
		return tittle;
		
	}
	
	public String getCallNumber(){
		
		return callnumber;
		
	}
	
	public int getID(){
	
		return bookid;
		
	}
	public ILoan getLoan() {
		// TODO Auto-generated method stub
		if(EBookState.ON_LOAN == null){
			return null;	
		}
		return loan;
	}
       
	public EBookState getState() {
		// TODO Auto-generated method stub
		return state;
	}
        public String toString(){
            return ("Author :"+author+", Title :"+tittle+", call number :"+callnumber);
        }
}
