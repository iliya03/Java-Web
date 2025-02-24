package sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sample-refresh")
public class Refresh extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Refresh() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get current time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = now.format(formatter);

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Auto-refresh Time Page</title>");
        out.println("<meta http-equiv='refresh' content='1'>"); // Refresh every 1 second
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Auto-refresh Page</h1>");
        out.println("<p>Current Time: <strong>" + currentTime + "</strong></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
