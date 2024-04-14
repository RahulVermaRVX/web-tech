package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author rahulxxl
 */
public class MainServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Uncomment the corresponding section to see the effect.
            // Feel free to modify as you like. if you mess something up,
            // redownload the code from the GitHub repo.

            // You can return a page using this method.
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MainServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello, World!");
            out.println("<h1>Servlet MainServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
            
            // Or you can create the page in VS Code and paste it in a string
            // then pass that string to out.println.
            // Note that I have used internal CSS for a bit of styling.
            String page = "<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "<head>\n"
                    + "    <meta charset='UTF-8'>\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "    <title>Main Servlet</title>\n"
                    + "    <style>\n"
                    + "        .head-1{\n"
                    + "            margin: 10px;\n"
                    + "            padding: 10px;\n"
                    + "            border: solid black 3px;\n"
                    + "        }\n"
                    + "        .head-2{\n"
                    + "            margin: 10px;\n"
                    + "            padding: 10px;\n"
                    + "            border: solid red 3px;\n"
                    + "        }\n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <h1 class='head-1'>Hello, World!</h1>\n"
                    + "    <h1 class='head-2'>This page was created in VS code.</h1>\n"
                    + "    <h1 class='head-1'>It uses internal CSS for styling</h1>\n"
                    + "    <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. \n"
                    + "        Qui, obcaecati impedit commodi architecto laudantium perferendis minus harum excepturi ad, \n"
                    + "        nihil expedita sint ducimus amet cupiditate! Cupiditate nobis quibusdam obcaecati illo!\n"
                    + "    </p>\n"
                    + "</body>\n"
                    + "</html>";
            out.println(page);
            
            // This was the second and preferred method of doing this. Just use Single Quotes in VS CODE
            // When you are writing your page. (in HTML atrributes etc.
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
