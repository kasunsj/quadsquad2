/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.List;
import junit.framework.TestCase;
import library.interfaces.entities.IMember;


public class MemberDAOTest extends TestCase {
     String firstName = "aman";
        String lastName = "kumar";
        String ContactPhone = "123";
        String emailAddress = "amanr";
    MemberDAO instance=new MemberDAO();
    public MemberDAOTest(String testName) {
        
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
     * Test of addMember method, of class MemberDAO.
     */
    public void testAddMember() {
        System.out.println("addMember");
       
     instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        IMember result = instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        assertEquals("aman", result.getFirstName());
        
    }

    /**
     * Test of getMemberByID method, of class MemberDAO.
     */
    public void testGetMemberByID() {
        System.out.println("getMemberByID");
       instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        IMember result = instance.getMemberByID(0);
        assertEquals("kumar", result.getLastName());
       
    }

    /**
     * Test of listMembers method, of class MemberDAO.
     */
    public void testListMembers() {
        System.out.println("listMembers");
         instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        List<IMember> result = instance.listMembers();
        assertEquals("aman", result.get(0).getFirstName());
       
    }

    /**
     * Test of findMembersByLastName method, of class MemberDAO.
     */
    public void testFindMembersByLastName() {
        System.out.println("findMembersByLastName");
         instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        List<IMember> result = instance.findMembersByLastName(lastName);
        assertEquals("123", result.get(0).getContactPhone());
        
    }

    /**
     * Test of findMembersByEmailAddress method, of class MemberDAO.
     */
    public void testFindMembersByEmailAddress() {
        System.out.println("findMembersByEmailAddress");
        instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        List<IMember> result = instance.findMembersByEmailAddress(emailAddress);
        assertEquals("123", result.get(0).getContactPhone());
       
    }

    /**
     * Test of findMembersByNames method, of class MemberDAO.
     */
    public void testFindMembersByNames() {
        System.out.println("findMembersByNames");
        instance.addMember(firstName, lastName, ContactPhone, emailAddress);
        List<IMember> result = instance.findMembersByNames(firstName, lastName);
        assertEquals("kumar", result.get(0).getLastName());
        
    }
    
}
