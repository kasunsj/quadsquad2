/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.daos.ILoanHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;


public class LoanDAO implements ILoanDAO{
    IMember borrower;
    IBook book;
    Date borrowDate,dueDate;
    ILoanHelper helper;
    static int id=0;
    ArrayList<ILoan> loanlist;
     ArrayList<ILoan> subloan;
    public LoanDAO() {
      helper=new LoanHelper();
      loanlist=new ArrayList<ILoan>();
    }
     
    public ILoan createLoan(IMember borrower, IBook book) {
        this.borrower=borrower;
        this.book=book;
        borrowDate=new Date();
        GregorianCalendar cal=new GregorianCalendar();
        cal.setTime(borrowDate);
        cal.add(Calendar.DATE, 14);
        dueDate=cal.getTime();
       helper.makeLoan(book, borrower, borrowDate ,dueDate);
       
       if(borrower==null || book==null){
           throw new IllegalArgumentException ("value is null");
       }
       return helper.makeLoan(book, borrower,  borrowDate ,dueDate);
    }

    public void commitLoan(ILoan loan) {
        id++;
        loanlist.add(loan);
        }

    public ILoan getLoanByID(int id) {
        if(loanlist.isEmpty()){
            return null;
        } else
    return loanlist.get(id);
    }

    public ILoan getLoanByBook(IBook book) {
        int index=0;
        for(int i=0;i<loanlist.size();i++){
    if(loanlist.get(i).getBook()==book) {
        index=i;
      }
        }
       return loanlist.get(index);
    }

    public List<ILoan> listLoans() {
    return loanlist;
    }

    public List<ILoan> findLoansByBorrower(IMember borrower) {
        subloan=new ArrayList<ILoan>();
        for(int i=0;i<loanlist.size();i++){
    if(loanlist.get(i).getBorrower()==borrower) {
      subloan.add(loanlist.get(i));
      }  
    }
        return subloan;
    }
      

    public List<ILoan> findLoansByBookTitle(String title) {
        subloan=new ArrayList<ILoan>();
        for(int i=0;i<loanlist.size();i++){
    if(loanlist.get(i).getBook().getTitle()==title) {
      subloan.add(loanlist.get(i));
      }  
    }
        return subloan;
    }

    public void updateOverDueStatus(Date currentDate) {
        for(int i=0;i<loanlist.size();i++){
           
        loanlist.get(i).checkOverDue(currentDate);
        }
        }

    public List<ILoan> findOverDueLoans() {
         subloan=new ArrayList<ILoan>();
        for(int i=0;i<loanlist.size();i++){
    if(loanlist.get(i).isOverDue()==true) {
      subloan.add(loanlist.get(i));
      }  
    }
        return subloan;
    }
 
 
}
