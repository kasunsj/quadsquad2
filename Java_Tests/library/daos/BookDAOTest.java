/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.List;
import junit.framework.TestCase;
import library.entities.Book;
import library.interfaces.entities.IBook;

public class BookDAOTest extends TestCase {
    String author = "Aman";
        String title = "twilight";
        String callNo = "123";
        BookDAO instance = new BookDAO();
        
    public BookDAOTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of addBook method, of class BookDAO.
     */
    public void testAddBook() {
        System.out.println("addBook");
        
        
        IBook result = instance.addBook(author, title, callNo);
        assertEquals("aman", result.getAuthor());
        
    }

    /**
     * Test of getBookByID method, of class BookDAO.
     */
    public void testGetBookByID() {
         instance.addBook(author, title, callNo);
        IBook result = instance.getBookByID(0);
        assertEquals("123", result.getCallNumber());
       
    }

    /**
     * Test of listBooks method, of class BookDAO.
     */
    public void testListBooks() {
        System.out.println("listBooks");
        instance.addBook(author, title, callNo);
        List<IBook> result = instance.listBooks();
        assertEquals("twilight", result.get(0).getTitle());
        
    }

    /**
     * Test of findBooksByAuthor method, of class BookDAO.
     */
    public void testFindBooksByAuthor() {
        System.out.println("findBooksByAuthor");
        instance.addBook(author, title, callNo);
        List<IBook> result = instance.findBooksByAuthor(author);
        assertEquals("aman", result.get(0).getAuthor());
       
    }

    /**
     * Test of findBooksByTitle method, of class BookDAO.
     */
    public void testFindBooksByTitle() {
        System.out.println("findBooksByTitle");
         instance.addBook(author, title, callNo);
        List<IBook> result = instance.findBooksByTitle(title);
        assertEquals("123", result.get(0).getCallNumber());
       
    }

    /**
     * Test of findBooksByAuthorTitle method, of class BookDAO.
     */
    public void testFindBooksByAuthorTitle() {
        System.out.println("findBooksByAuthorTitle");
      instance.addBook(author, title, callNo);
        List<IBook> result = instance.findBooksByAuthorTitle(author, title);
        assertEquals("123", result.get(0).getCallNumber());
        
    }
    
}
