package com.nic.servlet;

public class Member {
  private String firstname;
  private String lastname;

  public Member(String firstname, String lastname)
  {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public String getFirstname()
  {
    return this.firstname;
  }

  public String getLastname()
  {
    return this.lastname;
  }

  public void setFirstname(String firstname)
  {
    this.firstname = null;
    this.firstname = firstname;
  }

  public void setLastname(String lastname)
  {
    this.lastname = null;
    this.lastname = lastname;
  }

}
