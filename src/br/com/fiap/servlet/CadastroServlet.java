package br.com.fiap.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
@WebServlet("/cadastro")//quando formulario o "/cadastro" tem que ser igual ao <from action="/cadastro" da classe .html
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CadastroServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request � usado para pegar o que foi digitado na classe .html
		
		//pegando as informa�oes do .html digitadas para manipular
		String disciplina = request.getParameter("txtDisciplina");
		String nac = request.getParameter("txtNac");
		String qtdAluno = request.getParameter("txtQtdalunos");
		
		//colocando a requisicao de volta no entrada.html
		
		//request.setAttribute("pegarDados1", disciplina);
		request.setAttribute("nac", nac); //ela sobrepoe
		request.setAttribute("qtdAluno", qtdAluno);
		
		request.setAttribute("disciplina", disciplina);
		
		//passar as inf para o jsp
		request.getRequestDispatcher("digitacao.jsp").forward(request, response);
		
	}

}
