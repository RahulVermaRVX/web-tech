package sessions;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author rahulxxl
 */
public class SessionLoginCheck extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Prepare a demo database.
        String[] usernames = {"Scott", "Rohit", "Parineeti", "Megha", "Vaibhav"};
        String[] passwords = {"tiger", "abcdef", "asdfgh", "qwerty", "zxcvbn"};
        if (usernames.length != passwords.length) {
            System.out.println("The length of usernames and passwords array does not match.");
            return;
        }
        
        String uname = request.getParameter("uname");
        String passwd = request.getParameter("passwd");
        // TIP: You can fetch the username and password from the Databse here. 
        boolean isMatched = false;
        for (int i = 0; i < usernames.length; i++) {
            // We will ignore the case while checking username but not for the password.
            if (uname.equalsIgnoreCase(usernames[i]) && passwd.equals(passwords[i])) {
                isMatched = true;
            }
        }

        // Preparing the response.
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Session LoginCheck</title>");
            out.println("</head>");
            out.println("<body>");
        
            // Now we will check whether Login is successfull or not.
            if (isMatched == true){
                out.println("<h1>Login Successfull.</h1>");
                // Now we will create a session to test in the profile page
                /* getSessison returns the current HttpSession associated with this request or, 
                 * if there is no current session exists and we pass true, returns a new session.
                 * If we pass false and the request has no valid HttpSession i.e if session does not exists, this method returns null.
                 */
                HttpSession sn = request.getSession(true);
                sn.setAttribute("uname", uname);
            }
            else{
                out.println("<h1>Username or Password not correct.");
            }
            out.println("</body>");
            out.println("</html>");
            
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
