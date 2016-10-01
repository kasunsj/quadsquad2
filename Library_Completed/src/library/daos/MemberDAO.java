/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.ArrayList;
import java.util.List;
import library.interfaces.daos.IMemberDAO;
import library.interfaces.daos.IMemberHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;


public class MemberDAO implements IMemberDAO{
IMemberHelper helper;
static int id=0;
   String firstName;
   String lastName;
   String ContactPhone;
   String emailAddress; 
    ArrayList<IMember> member;
    ArrayList<IMember> submember;
    public MemberDAO() {
        helper=new MemberHelper();
        member=new ArrayList<IMember>();
    }
    
     
    public IMember addMember(String firstName, String lastName, String ContactPhone, String emailAddress) {
      this.firstName=firstName;
      this.lastName=lastName;
      this.emailAddress=emailAddress;
      this.ContactPhone=ContactPhone;
        member.add(helper.makeMember(firstName, lastName, ContactPhone, emailAddress, id));
       id++;
       if(firstName==null || lastName==null || ContactPhone==null || emailAddress==null){
       throw new  IllegalArgumentException ("values are null");
    }
    return helper.makeMember(firstName, lastName, ContactPhone, emailAddress, id);
     }

    public IMember getMemberByID(int id) {
      
      if(member.get(id)==null){
          return null;
    } else
      return member.get(id);
      }

    public List<IMember> listMembers() {
    return member;
    }

    public List<IMember> findMembersByLastName(String lastName) {
        
        submember=new ArrayList<IMember>();
        for(int j=0;j<member.size();j++){
        if(member.get(j).getLastName()==lastName){
            submember.add(member.get(j));
        }
        }
    return submember; 
    }

    public List<IMember> findMembersByEmailAddress(String emailAddress) {
       
        submember=new ArrayList<IMember>();
        for(int j=0;j<member.size();j++){
        if(member.get(j).getEmailAddress()==emailAddress){
            submember.add(member.get(j));
        }
        }
    return submember; 
             }

    public List<IMember> findMembersByNames(String firstName, String lastName) {
   
        submember=new ArrayList<IMember>();
        for(int j=0;j<member.size();j++){
        if(member.get(j).getFirstName()==firstName && member.get(j).getLastName()==lastName){
            submember.add(member.get(j));
        }
        }
    return submember; 
    }
   
  
}
