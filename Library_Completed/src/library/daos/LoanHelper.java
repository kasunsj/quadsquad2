/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.Date;
import library.entities.Loan;
import library.interfaces.daos.ILoanHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;


public class LoanHelper implements ILoanHelper{

    public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate) {
    Loan loan=new Loan(book, borrower, borrowDate, dueDate, 0);
    return loan;
    }
    
}
