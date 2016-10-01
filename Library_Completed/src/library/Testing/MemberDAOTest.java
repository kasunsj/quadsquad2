/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.Testing;

import library.daos.MemberDAO;


public class MemberDAOTest {
    public static void main(String[] args) {
        MemberDAO m=new MemberDAO();
         System.out.println(m.addMember("aman", "kumar","9876543765", "amanr1326@gmail.com"));
           m.addMember("aryan", "rajput","126543765", "arfhjk1326@gmail.com");
           m.addMember("dev", "kumar","876543765", "akjh26@gmail.com");
           m.addMember("sashi", "roy","097654365", "yhjmr1326@gmail.com");
           System.out.println(m.getMemberByID(3));
           System.out.println("List of member by Last name :"+m.findMembersByLastName("kumar"));
           System.out.println("find member by names :"+m.findMembersByNames("sashi", "roy").get(0));
    } 
}
