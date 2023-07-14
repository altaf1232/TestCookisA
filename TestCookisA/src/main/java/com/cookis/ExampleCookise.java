package com.cookis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleCookise extends HttpServlet
{
  
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  { 
	try 
	{  
    res.setContentType("text/html");
    PrintWriter out=res.getWriter(); 
    
    String n=req.getParameter("userName");
    out.print("Welcome" +n);
    
    Cookie ck= new Cookie("uname",n);//creating cookie object  
    res.addCookie(ck);//adding cookie in the response
    
   //creating submit button  
    out.print("<form action='ExampleCookise'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
	}
	catch(Exception e)
	 { 
	   System.out.println(e);
	 }
    
  }   
}