
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.AccountService;

/**
 *
 * @author Lovro
 */
public class ForgotPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        AccountService as = new AccountService();
        
        String path = getServletContext().getRealPath("WEB-INF");
        String action = request.getParameter("action");
        String email = request.getParameter("email");
        
        switch(action) {
            case "forgot":
                as.forgotPassword(email, path);
                request.setAttribute("If the address you entered is valid, you will receive an email very soon. \n Please check your email for your password.", "emailSent");
                break;
        }
    }

}
