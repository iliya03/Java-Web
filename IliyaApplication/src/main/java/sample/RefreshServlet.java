package sample;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RefreshServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Set response refresh interval to 1 second
        res.setIntHeader("Refresh", 1);

        // Set response content type
        res.setContentType("text/html");

        // Get the current time
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String am_pm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        // Format the current time
        String currentTime = hour + ":" + minute + ":" + second + " " + am_pm;

        // Write the response
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<h1 align='center'>Auto Refresh Page</h1><hr>");
        out.println("<h3 align='center'>Current time: " + currentTime + "</h3>");
        out.println("<a href='index.html' align='center'>Back</a>");
        out.println("</html>");
    }
}
