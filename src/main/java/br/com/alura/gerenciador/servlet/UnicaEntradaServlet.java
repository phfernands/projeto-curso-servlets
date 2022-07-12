package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;




/**
 * Servlet implementation class UnicaEntradaServlet
 */
//@WebServlet("/unicaEntrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String paramAcao = request.getParameter("acao");
		
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean acaoProtegida = !(paramAcao.equals("FormLogin") || paramAcao.equals("Login"));
//		
//		if(acaoProtegida && usuarioNaoLogado) {
//			response.sendRedirect("unicaEntrada?acao=FormLogin");
//			return;
//		}
		
//		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
//		
//		String nome;
//		try {
//			Class classe = Class.forName(nomeDaClasse);
//			Acao acao = (Acao) classe.newInstance();
//			nome = acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
//				| IOException e) {
//			
//			throw new ServletException(e);
//		}
//		
//		String[] tipoENome = nome.split(":");
//		if(tipoENome[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view" + tipoENome[1]);
//			rd.forward(request, response);
//		} else {
//			response.sendRedirect(tipoENome[1]);
//		}
//		
		
		
//		String nome = null;
//		
//		if(paramAcao.equals("FormNovaEmpresa")) {
//			
//			FormNovaEmpresa novaEmpresa = new FormNovaEmpresa();
//			nome = novaEmpresa.executa(request, response);
//		}
//		
//		if(paramAcao.equals("ListaEmpresas")) {
//			
//			ListaEmpresas listaAcao = new ListaEmpresas();
//			nome = listaAcao.executa(request, response);
//			
//		} else if(paramAcao.equals("MostraEmpresa")) {
//			
//			MostraEmpresa mostraAcao = new MostraEmpresa();
//			nome = mostraAcao.executa(request, response);
//			
//		} else if(paramAcao.equals("RemovaEmpresa")) {
//			
//			RemovaEmpresa removaAcao = new RemovaEmpresa();
//			nome = removaAcao.executa(request, response);
//			
//		} else if(paramAcao.equals("AlteraEmpresa")) {
//			
//			AlteraEmpresa alteraAcao = new AlteraEmpresa();
//			nome = alteraAcao.executa(request, response);
//			
//		} else if(paramAcao.equals("NovaEmpresa")) {
//			
//			NovaEmpresa novaEmpresa = new NovaEmpresa();
//			nome = novaEmpresa.executa(request, response);
//			
//		}
		
		
	}

}
