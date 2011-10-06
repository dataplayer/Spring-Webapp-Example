package com.nic.servlet;

//import com.nic.servlet.Member;
import com.nic.servlet.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

//import java.util.*;

@Controller
@RequestMapping("/memberAdd")
public class MemberAddController {

  private MemberService memberService;

  @Autowired
  public MemberAddController(MemberService memberService)
  {
    System.out.println("Using MemberAddController constructor");
    this.memberService = memberService;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String setupForm()
  {
    return "/WEB-INF/jsp/addform.jsp";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String submitForm(@RequestParam("firstname") String firstname, 
			   @RequestParam("lastname") String lastname, Model model)
  {
    if (firstname == null || firstname.length() == 0 || lastname == null || lastname.length() == 0) 
    {
      return "/WEB-INF/jsp/memberadderror.jsp";
    }
    else
    {
      if(memberService.tryAddingMember(firstname,lastname))
      {
        model.addAttribute("members", memberService.getAll());
        return "/WEB-INF/jsp/memberAdd.jsp";
      }
      return "/WEB-INF/jsp/memberadderror.jsp";
    }
  }
}
