

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sub")
public class Sub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@SuppressWarnings("removal")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.getWriter().append("Served at: ").append(request.getContextPath());
			int op1 = ((Integer) request.getAttribute("n1")).intValue();
			int op2 = ((Integer) request.getAttribute("n2")).intValue();
			int result = op1 - op2;
			request.setAttribute("opearation", "Subtract");
			request.setAttribute("result", new Integer(result));
			RequestDispatcher rd = request.getRequestDispatcher("/response");
			rd.forward(request, response);
		
	}

}
