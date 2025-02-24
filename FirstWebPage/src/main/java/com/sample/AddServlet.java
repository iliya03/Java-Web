package com.sample;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
       
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            res.getWriter().println("Please provide valid numbers.");
            return;
        }

       
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);

        
        int k = i + j;

       
        PrintWriter out = res.getWriter();
        out.println("The result is: " + k);
    }
}
