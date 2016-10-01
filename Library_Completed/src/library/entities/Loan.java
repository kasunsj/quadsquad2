/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

import java.util.Date;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;


public class Loan implements ILoan{
    IBook book;
    IMember borrower;
    Date borrowDate,dueDate;
    int loanID;
    ELoanState state;
    public Loan(IBook book,IMember borrower,Date borrowDate,Date dueDate,int loanID) {
        this.book=book;
        this.borrower=borrower;
        this.borrowDate=borrowDate;
        this.dueDate=dueDate;
        this.loanID=loanID;
        if(book==null || borrower==null || borrowDate==null || dueDate==null || loanID<0){
            throw new IllegalArgumentException("vlues are null");
        }
    }
    
  

    public void commit(int id) {
     state=ELoanState.CURRENT;
     book.borrow(this);
     borrower.addLoan(this);
     if(state!=ELoanState.PENDING){
         throw new RuntimeException("state not pending");
     }
    }

    public void complete() {
    state=ELoanState.COMPLETE;
    if(state!=ELoanState.CURRENT || state!=ELoanState.OVERDUE){
         throw new RuntimeException("state not cuurent or overdue");
    }
    }

    public boolean isOverDue() {
    if(state==ELoanState.OVERDUE){
        return true;
    }   else
        return false;
    }

    public boolean checkOverDue(Date currentDate) {
    if(currentDate.after(dueDate)){
        state=ELoanState.OVERDUE;
        return true;
    }  else if(state==ELoanState.OVERDUE){
        return true;
    }else if(state!=ELoanState.CURRENT || state!=ELoanState.OVERDUE){
         throw new RuntimeException("state not cuurent or overdue");
    } else
        return  false;
    }

    public IMember getBorrower() {
    return borrower;  
    }

    public IBook getBook() {
    return book;
    }

    public int getID() {
    return loanID;
    }
    public String toString(){
        return "Book :"+book+", Borrower :"+borrower+", Borrow date :"+borrowDate+", Due date :"+dueDate+", Loan id :"+loanID;
    }
}
