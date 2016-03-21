package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/final")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FinalServlet() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String disciplina = request.getParameter("disciplina");
		List<Aluno> alunos =  (List<Aluno>) session.getAttribute("alunos");
		request.setAttribute("mediaSala", Sala.calculaMediaSala(alunos));
		request.setAttribute("pior", Sala.piorDaSala(alunos));
		request.setAttribute("melhor", Sala.melhorDaSala(alunos));
		request.setAttribute("disciplina", disciplina);
		request.getRequestDispatcher("final.jsp").forward(request, response);
	}

}
