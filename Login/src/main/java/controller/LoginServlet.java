package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        
        if("usuario".equals(email) && "123".equals(senha)) {
            request.setAttribute("sucesso", "Login realizado com sucesso!");
            request.getRequestDispatcher("/views/login.jsp").forward(request, response);

        } else {
            request.setAttribute("erro", "Usuário ou senha inválidos.");
            request.getRequestDispatcher("/views/login.jsp").forward(request, response);

        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response); 
    }
    
  


}
