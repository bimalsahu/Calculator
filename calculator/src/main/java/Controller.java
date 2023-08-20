
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("removal")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			request.setAttribute("n1", new Integer(request.getParameter("op1")));
			request.setAttribute("n2", new Integer(request.getParameter("op2")));

		} catch (Exception e) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("value should be number");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
			return;
		}
		String action = request.getParameter("action");
		RequestDispatcher rd = null;
		if (action.equals("Add")) {
			rd = request.getRequestDispatcher("/add");
		} else if (action.equals("Subtract")) {
			rd = request.getRequestDispatcher("/sub");
		} else if (action.equals("Multiplication")) {
			rd = request.getRequestDispatcher("/multiple");
		} else {
			rd = request.getRequestDispatcher("/div");
		}
		rd.forward(request, response);

	}

}
