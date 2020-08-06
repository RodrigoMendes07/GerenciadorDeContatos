<%-- 
    Document   : index
    Created on : 05/08/2020, 20:00:11
    Author     : ti
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <title>Contatos</title>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="dist/js/buscarCnpj.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <ul id="BotaoSair" class="nav justify-content-end">
                        <li class="nav-item">
                            <a class="nav-link  btn-outline-danger" href="index.jsp" role="button">&times;</a>
                        </li>
                    </ul>
                </div>  
                <!-- Alerta de Erro Ao Cadastrar -->
                <%                    if (session.getAttribute("mensagem") != null) {
                %>
                <div class="col-12">
                    <div class="alert alert-danger" role="alert">
                        Atênção : <%= session.getAttribute("mensagem")%>!
                    </div>
                </div>
                <% session.setAttribute("mensagem", null);
                    }
                %>
                <div class="col-12">
                    <div class="py-1">
                        <!--  <img class="d-block mx-auto mb-4" src="../../assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
                        --> <h2>Agendar Contato.</h2>
                        <hr>
                    </div>
                </div>
                <!-- Corpo do Formulario. -->
                <div class="container">
                    <div class="col-md-12 order-md-1">
                        <form method="post" action="CContato">
                            <div class="row">
                                <div class="col-md-12 md-3">
                                    <h4>Dados do Cliente</h4>
                                    <hr>
                                </div>
                                <%
                                    String txtCnpj;
                                    if (request.getParameter("txtCnpjCliente") != null) {
                                        txtCnpj = request.getParameter("txtCnpjCliente");
                                %>
                                <div class="col-md-4 mb-3">
                                    <label for="Cnpj">Cnpj</label>
                                    <input type="text" class="form-control" value="<%=txtCnpj%>" name="txtCnpj" id="txtCnpj" placeholder="" required="" onblur=" pesquisarcnpj(this.value);" >                             
                                </div>
                                <%} else {%>
                                <div class="col-md-4 mb-3">
                                    <label for="Cnpj">Cnpj</label>
                                    <input type="text" class="form-control"  name="txtCnpj" id="txtCnpj" placeholder="" 
                                           required="" onblur="pesquisarcnpj(this.value);" >                             
                                </div> 
                                <%}
                                %>                              
                                <div class="col-md-8 mb-3">
                                    <label for="RazaoSocial">Razão Social</label>
                                    <input type="text" class="form-control" name="txtRazaoSocial" maxlength="100" size="100" id="txtRazaoSocial" placeholder="" required>
                                </div>
                                <div class="col-md-2 mb-3">
                                    <label for="Cep">Cep Receita Federal</label>
                                    <input type="text" class="form-control" maxlength="8" size="8" name="txtCepReceita" id="txtCepReceita" placeholder="" required>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="DataAbertura">Data Contato</label>
                                    <input type="date" class="form-control" name="txtDtaAbertura" id="txtDtaAbertura" placeholder="" required>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="DataRetorno">Data Retorno</label>
                                    <input type="date" class="form-control" name="txtDtaRetorno" id="txtDtaRetorno" placeholder="" required>
                                </div>    
                                <div class="col-md-3 mb-3">
                                    <br>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="txtRadio" id="exampleRadios1" value="Sim" checked>
                                        <label class="form-check-label" for="exampleRadios1">
                                            Sim
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="txtRadio" id="exampleRadios2" value="Não">
                                        <label class="form-check-label" for="exampleRadios2">
                                            Não
                                        </label>
                                    </div>
                                </div>
                                <div class="col-md-12 md-3">
                                    <h6>Gestor Master</h6>
                                    <hr>
                                </div>
                                <div class="col-md-4 mb-3">
                                    <label for="Nome">Nome</label>
                                    <input type="text" class="form-control" maxlength="100" size="100" name="txtNome" id="txtNome" placeholder="" 
                                           required="">                             
                                </div> 
                                <div class="col-md-4 mb-3">
                                    <label for="Email">E-mail</label>
                                    <input type="email" class="form-control" maxlength="100" size="100" name="txtEmail" id="txtEmail" placeholder="" 
                                           required="">                             
                                </div> 
                                <div class="col-md-3 mb-3">
                                    <label for="Telefone">Telefone Comercial</label>
                                    <input type="tel" class="form-control" maxlength="100" size="100" name="txtTelefone" id="txtTelefone01" placeholder="" 
                                           required="">                             
                                </div> 
                                <div class="col-md-12 md-3">
                                    <h4>Observação.</h4>
                                </div>
                                <div class="col-md-12 mb-3">
                                    <textarea class="form-control" name="txtObservacao" maxlength="200" size="200" id="exampleFormControlTextarea1" rows="3"></textarea>
                                </div>
                                <div class ="oculto"> 
                                    <input type="hidden" name="txtAcao" class="form-control" value="1"  required="" >
                                </div>   
                            </div>    
                            <hr>
                            <div class="row mb-2">
                                <div class="col-md-2">
                                    <a class="btn btn-danger btn-lg btn-block" href="index.jsp">Sair</a>  
                                </div>
                                <div class="col-md-2">
                                    <button class="btn btn-primary btn-lg btn-block" type="submit">Gravar</button>
                                </div>
                            </div>
                        </form>  
                    </div>
                </div>                





            </div>
        </div>



        <!-- Principal JavaScript do Bootstrap
         ================================================== -->
        <!-- Foi colocado no final para a página carregar mais rápido -->
        <script src="dist/js/jquery341.js"></script>
        <script src="dist/js/popper.min.js"></script>
        <script src="dist/js/bootstrap.min.js"></script>   
    </body>
</html>