package demoPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h2><a href='Rec'>For Rectangle</a></h2>");
		out.println("<h2><a href='Rec'>For Square</a></h2>");
		out.println("<h2><a href='Rec'>For Triangle</a></h2>");
	}
}