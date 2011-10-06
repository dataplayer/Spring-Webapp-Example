package com.nic.servlet;

import com.nic.servlet.Member;
import com.nic.servlet.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

import java.util.*;

@Controller
@RequestMapping("/memberQuery")
public class MemberQueryController {

  private MemberService memberService;

  @Autowired
  public MemberQueryController(MemberService memberService)
  {
    System.out.println("Using MemberQueryController constructor");
    this.memberService = memberService;
  }

  // used in the first initial GET request
  @RequestMapping(method = RequestMethod.GET)
  public String setupForm()
  {
    return "/WEB-INF/jsp/queryform.jsp";
  }

  // used in POST requests when doing a member query
  @RequestMapping(method = RequestMethod.POST)
  public String submitForm(@RequestParam("firstname") String firstname, 
		           @RequestParam("lastname") String lastname, Model model)
  {
    List<Member> members = java.util.Collections.emptyList();
    if (firstname == null || firstname.length() == 0 || lastname == null || lastname.length() == 0)
    {
      return "/WEB-INF/jsp/error.jsp";
    }
    else
    {
      members = memberService.query(firstname,lastname);
      model.addAttribute("members", members);
      return "/WEB-INF/jsp/memberQuery.jsp";
    }
  }

}
