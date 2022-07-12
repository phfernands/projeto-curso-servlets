package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.usuarioExiste(login, senha);
		
		if(usuario != null) {
			System.out.println("Usuario existe!");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "sendRedirect:unicaEntrada?acao=ListaEmpresas";
		} else {
			return "sendRedirect:unicaEntrada?acao=FormLogin";
		}
		
		
		
	}
}
