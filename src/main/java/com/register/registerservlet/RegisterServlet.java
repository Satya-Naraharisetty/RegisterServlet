package com.register.registerservlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

    public RegisterServlet(){
        System.out.println("Internal Servlet Obj is created by container");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {

        String name = request.getParameter("Uname");
        String ucity = request.getParameter("Ucity");
        System.out.println("Name "+ name + " City "+ ucity);
//        PrintWriter writer = response.getWriter();


        response.sendRedirect("/RegisterServlet/successful.jsp");
//        writer.println("Hello "+ name);
//        writer.println(" I know you're from "+ucity);
//        writer.println("<html> <head> <title> Second App</title></head>");
//        writer.println("<body bgcolor='cyan'> <h1><marquee> Welcome to our dynamic app </marquee></h1>");
//        writer.println("<table>");
//        writer.println("<tr> <th>NAME</th>  <th>CITY</th> </tr>");
//        writer.println("<tr><td> "+name+"</td> <td> "+ucity+"</td> </tr>");
//        writer.println("</table></body>");
//        writer.println("</html>");
//        writer.close();
    }
}