package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rahulxxl
 */
public class ClearCookie extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Clear Cookies</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>All Cookies Cleared</h1>");
            out.println("</body>");
            out.println("</html>");

            // Try to add cookies after the HTML in the response object has been written
            Cookie[] cks = request.getCookies();
            Cookie ckNew = null;
            for (int i = 0; i < cks.length; i++) {
                // Creating a Clone of existing Cookies and setting their value to "".
                ckNew = new Cookie(cks[i].getName(), "");
                // Adding newly cloned cookies to response after setting their MaxLife to 0
                ckNew.setMaxAge(0);
                response.addCookie(ckNew);
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
