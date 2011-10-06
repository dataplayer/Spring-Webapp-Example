package com.nic.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController 
{

  @RequestMapping(value="/")
  public String home()
  {
    System.out.println("Hi I'm the HomeController");
    return "WEB-INF/views/home.jsp";
  }
}
