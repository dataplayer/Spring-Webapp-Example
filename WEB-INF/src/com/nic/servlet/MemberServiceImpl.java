package com.nic.servlet;

import org.springframework.stereotype.Service;

import com.nic.servlet.Member;
import java.util.*;

@Service
public class MemberServiceImpl implements MemberService {

  private List<Member> members;

  public MemberServiceImpl()
  {
    members = new ArrayList<Member>();
    members.add(new Member("Nic","Flores"));
    members.add(new Member("Tim","Schumacher"));
  }

  public List<Member> query(String firstname, String lastname)
  {
    List<Member> result = new ArrayList<Member>();
    for (Member member : members)
    {
      if(member.getFirstname().equals(firstname) && member.getLastname().equals(lastname))
      {
        result.add(member);
       }
    }
    return result;  
  }

  // returns false if it can't add member
  // returns true if it did add member
  public synchronized boolean tryAddingMember(String firstname, String lastname)
  {
    Member newmember = new Member(firstname, lastname);
    if(firstname == null || lastname == null)
    {
      return false;
    }
    else if (members.contains(newmember))
    {
      return false;
    }
    else 
    {
      members.add(newmember);
      return true;
    }

  }

  public synchronized Collection<Member> getAll()
  {
    Collection<Member> result = new ArrayList<Member>();
    for (Member member: members)
    {
      result.add(member);
    }
    return result;
  }

}
