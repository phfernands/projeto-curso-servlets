package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//oi
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public OiMundoServlet () {
		System.out.println("Criando Oi Mundo Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter print = resp.getWriter();
		print.println("<html>");
		print.println("<body>");
		print.println("Oi mundo. Parabéns, voce escreveu seu primeiro servlet.");
		print.println("</body>");
		print.println("</html>");
		
		System.out.println("OiMundo foi chamado.");

	}

}
