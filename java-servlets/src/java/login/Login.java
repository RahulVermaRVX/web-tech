package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author rahulxxl
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Login  Page Here...
            String page = "<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "\n"
                    + "<head>\n"
                    + "    <meta charset='UTF-8'>\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "    <title>Login</title>\n"
                    + "    <style>\n"
                    + "        .main { width: 50%; margin: 50px auto; }\n"
                    + "        .title{ margin:20px; }\n"
                    + "        .form-border { width: 50%; margin:10px; padding: 10px; }\n"
                    + "        .form-element{ margin:5px; padding: 5px; }\n"
                    + "        .ele-spacer{ width: 50%; display: inline; margin: 10px; padding: 10px; margin-right: auto; }\n"
                    + "        .button{ margin: 5px 30px; padding: 2px 2px; }\n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "    <div class='main'>\n"
                    + "        <h1 class='title'>Please Login</h1>\n"
                    + "        <div class='form-border'>\n"
                    + "            <form action='/java-servlet/login-check' method='POST'>\n"
                    + "                <div class='form-element'>\n"
                    + "                   <div class='ele-spacer'><label for='user'>Username</label></div>\n"
                    + "                   <div class='ele-spacer'><input type='text' id='user' name='uname'></div>\n"
                    + "                </div>\n"
                    + "                <div class='form-element'>\n"
                    + "                    <div class='ele-spacer'><label for='pass'>Password</label></div>\n"
                    + "                    <div class='ele-spacer'><input type='password' id='pass' name='passwd'></div>\n"
                    + "                </div>\n"
                    + "                <div>\n"
                    + "                    <button class='button' type='submit'>Login</button>\n"
                    + "                </div>\n"
                    + "            </form>\n"
                    + "        </div>\n"
                    + "    </div>\n"
                    + "</body>\n"
                    + "\n"
                    + "</html>";
            out.println(page);

        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
