

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstproject
 */
@WebServlet("/firstproject")
public class firstproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public firstproject() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		if ((user.equals("user")) && (pass.equals("pass")))
				{
			
			pw.println("Login Success!");
				}
		else
		{
			pw.println("Login Failed");
			pw.close();
		}
		
	}

}
