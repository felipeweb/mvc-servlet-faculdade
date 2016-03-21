package br.com.fiap.servlet;

import br.com.fiap.modelo.Aluno;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmarServlet
 */
@WebServlet("/confirmar")
public class ConfirmarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConfirmarServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String disciplina = request.getParameter("disciplina");
		request.setAttribute("disciplina", disciplina);
		String[] rms = request.getParameterValues("rm");
		String[] ams = request.getParameterValues("am");		
		String[] ps = request.getParameterValues("ps");
		int qtdNacs = Integer.parseInt(request.getParameter("qtdNacs"));
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int i = 0; i < rms.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setRm(Integer.parseInt(rms[i]));
			aluno.setAm(Double.parseDouble(ams[i]));
			aluno.setPs(Double.parseDouble(ps[i]));
			for(int j = 0; j < qtdNacs; j++) {
				int pos = j + 1;
				String nome = "Nac" + pos; 
				String[] nacs = request.getParameterValues(nome);
				aluno.adicionarNac(Double.parseDouble(nacs[i]));
			}
			aluno.calcularMediaNacs();
			aluno.calcularMediaFinal();
			alunos.add(aluno);
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("alunos", alunos);
		request.getRequestDispatcher("confirmar.jsp").forward(request, response);
	}

}
