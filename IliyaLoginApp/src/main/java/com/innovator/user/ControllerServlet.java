package com.innovator.user;

import java.io.IOException;

import com.innovator.user.ControllerServlet.LoginBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Map this servlet to the "/login" URL
@WebServlet("/login")
public class ControllerServlet extends HttpServlet {
    public class LoginBean {

		public boolean validateUser(String name, String password) {
			// TODO Auto-generated method stub
			return true;
		}

	}

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response); // Redirect GET to POST handling
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // Use the LogicBean for login validation
        LoginBean logicBean = new LoginBean();
        boolean isValid = logicBean.validateUser(name, password);

        if (isValid) {
            request.getRequestDispatcher("login-success.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login-error.jsp").forward(request, response);
        }
    }
    

}
