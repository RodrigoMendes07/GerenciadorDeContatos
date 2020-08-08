/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciador.controle;

import br.com.gerenciador.bean.Contato;
import br.com.gerenciador.dao.ContatoJPADao;
import br.com.gerenciador.dao.Util;

/**
 *
 * @author ti
 */
public class Teste {
    public static void main(String[] args) {
              Util getMascara = new Util();
              
               Contato contato = new Contato();

                    contato.setCnpj("01010101010101");
                    contato.setDtaContato(getMascara.parseData("2020-08-08"));
                    contato.setDtaRetorno(getMascara.parseData("2020-08-08"));
                    contato.setEmail("tete@gmail.com.br");
                    contato.setCepReceita("00000000");
                    contato.setNome("Nome de Teste");
                    contato.setObservacao("Texto com 200 cacteres");
                    contato.setRazaoSocial("Razão Social da Empresa");
                    contato.setRetorna("Sim");
                    contato.setTelefone("0000000000");

                    ContatoJPADao.getInstance().merge(contato); 
              
        
    }
}
