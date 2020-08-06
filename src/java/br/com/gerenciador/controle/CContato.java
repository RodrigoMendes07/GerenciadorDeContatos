/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciador.controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ti
 */
public class CContato extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Inicio do Caso.*/
            int acao = Integer.parseInt(request.getParameter("txtAcao"));

            switch (acao) {

                case 1:                    
                     /* Inicio do Caso.*/
                    out.println("Acão" + acao);

                    break;
                case 2:
                    out.println("Acão" + acao);

                    break;
                default:

                    System.out.println("O valor da variavel não é nenhum dos anteriores");
                    response.sendRedirect("index.jsp");
            }
            /* Final do Caso. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CContato</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cnpj: " + request.getParameter("txtCnpj") + "</h1>");
            out.println("<h1>Razão Social : " + request.getParameter("txtRazaoSocial") + "</h1>");
            out.println("<h1>Cep Receita : " + request.getParameter("txtCepReceita") + "</h1>");
            out.println("<h1>Data Contato : " + request.getParameter("txtDtaAbertura") + "</h1>");
            out.println("<h1>Data Retorno : " + request.getParameter("txtDtaRetorno") + "</h1>");
            out.println("<h1>Retornar ? : " + request.getParameter("txtRadio") + "</h1>");
            out.println("<h1>Nome : " + request.getParameter("txtNome") + "</h1>");
            out.println("<h1>E-mail : " + request.getParameter("txtEmail") + "</h1>");
            out.println("<h1>Telefone : " + request.getParameter("txtTelefone") + "</h1>");
            out.println("<h1>Observação : " + request.getParameter("txtObservacao") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
