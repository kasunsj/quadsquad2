/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.Date;
import java.util.List;
import junit.framework.TestCase;
import library.entities.Book;
import library.entities.Member;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class LoanDAOTest extends TestCase {
       IMember borrower = new Member("aman", "kumar", "123", "amanr", 0);
        IBook book = new Book("aryan", "math", "12345", 0);
          LoanDAO instance = new LoanDAO();
          ILoan loan = instance.createLoan(borrower, book);
    public LoanDAOTest(String testName) {
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
     * Test of createLoan method, of class LoanDAO.
     */
    public void testCreateLoan() {
        System.out.println("createLoan");
     
        ILoan result = instance.createLoan(borrower, book);
        assertEquals(0, result.getBook().getID());
       
    }

    /**
     * Test of commitLoan method, of class LoanDAO.
     *
    public void testCommitLoan() {
        System.out.println("commitLoan");
        ILoan loan = null;
        LoanDAO instance = new LoanDAO();
        instance.commitLoan(loan);
       
    }

    /**
     * Test of getLoanByID method, of class LoanDAO.
     */
    public void testGetLoanByID() {
        System.out.println("getLoanByID");
        int id = 0;
       instance.createLoan(borrower, book);
       instance.commitLoan(loan);
        ILoan result = instance.getLoanByID(id);
        assertEquals("aman", result.getBorrower().getFirstName());
       
    }

    /**
     * Test of getLoanByBook method, of class LoanDAO.
     */
    public void testGetLoanByBook() {
        System.out.println("getLoanByBook");
       instance.createLoan(borrower, book);
       instance.commitLoan(loan);
        ILoan result = instance.getLoanByBook(book);
        assertEquals("aryan", result.getBook().getAuthor());
      
    }

    /**
     * Test of listLoans method, of class LoanDAO.
     */
    public void testListLoans() {
        System.out.println("listLoans");
       instance.createLoan(borrower, book);
       instance.commitLoan(loan);
        List<ILoan> result = instance.listLoans();
        assertEquals("aryan", result.get(0).getBook().getAuthor());
        
    }

    /**
     * Test of findLoansByBorrower method, of class LoanDAO.
     */
    public void testFindLoansByBorrower() {
        System.out.println("findLoansByBorrower");
        instance.createLoan(borrower, book);
       instance.commitLoan(loan);
        List<ILoan> result = instance.findLoansByBorrower(borrower);
        assertEquals("aman", result.get(0).getBorrower().getFirstName());
        
    }

    /**
     * Test of findLoansByBookTitle method, of class LoanDAO.
     */
    public void testFindLoansByBookTitle() {
        System.out.println("findLoansByBookTitle");
       instance.createLoan(borrower, book);
       instance.commitLoan(loan);
        List<ILoan> result = instance.findLoansByBookTitle("math");
        assertEquals(0, result.get(0).getID());
        
    }

    /**
     * Test of updateOverDueStatus method, of class LoanDAO.
     *
    public void testUpdateOverDueStatus() {
        System.out.println("updateOverDueStatus");
        Date currentDate = null;
        LoanDAO instance = new LoanDAO();
        instance.updateOverDueStatus(currentDate);
       
    }

    /**
     * Test of findOverDueLoans method, of class LoanDAO.
     */
 
    
}
