/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import library.entities.Member;
import library.interfaces.daos.IMemberHelper;
import library.interfaces.entities.IMember;


public class MemberHelper implements IMemberHelper{

    public IMember makeMember(String firstName, String lastName, String contactPhone, String emailAddress, int id) {
     Member member=new Member(firstName, lastName, contactPhone, emailAddress, id);
     return member;
    }
    
}
