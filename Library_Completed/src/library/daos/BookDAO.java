package library.daos;
import java.util.ArrayList;
import java.util.List;

import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;
public class BookDAO implements IBookDAO{

	
	  ArrayList<IBook> subbook;
	String author;
        String title;
        String callNo;
	ArrayList<IBook> book;
	static int id=0;
        IBookHelper helper;
	public BookDAO()
	{
            helper=new BookHelper();
            book=new ArrayList<IBook>();
           
	}
	public IBook addBook(String author, String title, String callNo) {
            this.author=author;
            this.title=title;
            this.callNo=callNo;
            
		book.add(helper.makeBook(author, title, callNo, id));
				
				id++;
	if(author==null || title==null || callNo==null){
			throw new IllegalArgumentException ("value is null");
		}			
		return helper.makeBook(author, title, callNo, id);
	}
	
	
	
	
	

	public IBook getBookByID(int id)
	{
		if(book.get(id)==null){
                   return null; 
                } else
                    return book.get(id);
	}

	public List<IBook> listBooks() {
		
		return book;
	}

	public List<IBook> findBooksByAuthor(String author) {
       
            subbook = new ArrayList<IBook>();
            for(int i=0;i<book.size();i++){
		if(book.get(i).getAuthor()==author){
                   subbook.add(book.get(i));
                }
            }
		return subbook;
                
	}

	public List<IBook> findBooksByTitle(String title) {
          
		   subbook = new ArrayList<IBook>(); 
            for(int i=0;i<book.size();i++){
		if(book.get(i).getTitle()==title){
                   subbook.add(book.get(i));
                }
            }
		return subbook;
              
	}

	
	public List<IBook> findBooksByAuthorTitle(String author, String title) {
          
		     subbook = new ArrayList<IBook>(); 
            for(int i=0;i<book.size();i++){
		if(book.get(i).getAuthor()==author && book.get(i).getTitle()==title){
                   subbook.add(book.get(i));
                }
            }
		return subbook;
              
	}
	
	

}
