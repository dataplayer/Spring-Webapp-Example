package com.nic.servlet;

import com.nic.servlet.Member;
import java.util.*;

public interface MemberService {

  public List<Member> query(String firstname, String lastname);
  public boolean tryAddingMember(String firstname,String lastname);
  public Collection<Member> getAll();
}
