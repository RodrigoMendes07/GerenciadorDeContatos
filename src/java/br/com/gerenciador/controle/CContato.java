/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciador.controle;

import br.com.gerenciador.bean.Contato;
import br.com.gerenciador.dao.ContatoJPADao;
import br.com.gerenciador.dao.Util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
            HttpSession session = request.getSession();
            Util getMascara = new Util();

            switch (acao) {

                case 1:
                    /* Inicio do Caso.*/

                    Contato contato = new Contato();

                    contato.setCnpj(request.getParameter("txtCnpj"));
                    contato.setDtaContato(getMascara.parseData(request.getParameter("txtDtaAbertura")));
                    contato.setDtaRetorno(getMascara.parseData(request.getParameter("txtDtaRetorno")));
                    contato.setEmail(request.getParameter("txtEmail"));
                    contato.setCepReceita(request.getParameter("txtCepReceita"));
                    contato.setNome(request.getParameter("txtNome"));
                    contato.setObservacao(request.getParameter("txtObservacao"));
                    contato.setRazaoSocial(request.getParameter("txtRazaoSocial"));
                    contato.setRetorna(request.getParameter("txtRadio"));
                    contato.setTelefone(request.getParameter("txtTelefone"));

                    ContatoJPADao.getInstance().persist(contato); 

                //    session.setAttribute("mensagem", "Erro ao salvar dados do cliente.");
                   
                    response.sendRedirect("criarContato.jsp");

                    break;

                case 2:
                    out.println("Acão" + acao);

                    break;
                default:

                    System.out.println("O valor da variavel não é nenhum dos anteriores");
                    response.sendRedirect("index.jsp");
            }
            /* Final do Caso. */
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
