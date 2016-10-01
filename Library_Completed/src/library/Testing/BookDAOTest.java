/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.Testing;

import library.daos.BookDAO;
public class BookDAOTest {

	
	   public static void main(String[] args) {
              
        BookDAO b=new BookDAO();
        b.addBook("J.D.Paul", "Twilight", "12345");
        b.addBook("Aryan", "MATH", "97655");
         b.addBook("Sashi", "CPP", "578345");
          b.addBook("Andersen", "Light", "4545");
               System.out.println(b.getBookByID(3));
               System.out.println("Book by author "+b.findBooksByAuthor("J.D.Paul").get(0).getCallNumber());
                System.out.println("Book by Title "+b.findBooksByTitle("CPP").get(0).getAuthor());
                System.out.println("Book by Author and title "+b.findBooksByAuthorTitle("Andersen", "Light").get(0).getCallNumber());
    }

}
