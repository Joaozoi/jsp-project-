package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String nome = request.getParameter("nome");
	        String valor = request.getParameter("valor");
	        String categoria = request.getParameter("categoria");
	        String marca = request.getParameter("marca");

	        Produto produto = new Produto();
	        produto.setNome(nome);
	        produto.setValor(Double.parseDouble(valor));
	        produto.setCategoria(categoria);
	        produto.setMarca(marca);

	       

	        request.setAttribute("sucesso", true); // Define mensagem de sucesso
	        request.getRequestDispatcher("views/cadastroProduto.jsp").forward(request, response);
//	        response.getWriter().println("Produto Cadastrado com Sucesso");
	    }
	}
