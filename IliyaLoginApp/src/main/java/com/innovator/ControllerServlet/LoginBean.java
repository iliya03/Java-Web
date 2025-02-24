package com.innovator.ControllerServlet;

public class LoginBean {
    public boolean validateUser(String name, String password) {
        // Hardcoded validation for simplicity
        return "Iliya Fathma".equals(name) && "password".equals(password);
    }
}
