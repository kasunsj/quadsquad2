/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.Testing;

import library.daos.BookDAO;
import library.daos.LoanDAO;
import library.daos.MemberDAO;


public class LoanDAOTest {
      public static void main(String[] args) {
        MemberDAO m=new MemberDAO();
        BookDAO b=new BookDAO();
        LoanDAO l=new LoanDAO();
        m.addMember("aryan", "rajput","126543765", "arfhjk1326@gmail.com");
           m.addMember("dev", "kumar","876543765", "akjh26@gmail.com");
           m.addMember("sashi", "roy","097654365", "yhjmr1326@gmail.com");
            b.addBook("aman", "twilight", "12345");
        b.addBook("aryan", "math", "97655");
         b.addBook("sashi", "ip", "578345");
          b.addBook("dev", "light", "4545");
        l.commitLoan(l.createLoan(m.getMemberByID(2),b.getBookByID(1)));
        l.commitLoan(l.createLoan(m.getMemberByID(1),b.getBookByID(2)));
        l.commitLoan(l.createLoan(m.getMemberByID(1),b.getBookByID(0)));
        System.out.println("list of loan"+l.listLoans());
        System.out.println("find loan by book's title :"+l.findLoansByBookTitle("ip"));
          System.out.println("find loan by borrower :"+l.findLoansByBorrower(m.getMemberByID(2))); 
          System.out.println("find loan by book :"+l.getLoanByBook(b.getBookByID(0)));
          System.out.println("find loan by id :"+l.getLoanByID(1));
      } 
}
