/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciador.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ti
 */
@Entity
public class Contato implements Serializable {

  //  
   private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cnpj_contato")
    private String cnpj;
    @Column(name = "razao_contato")
    private String razaoSocial;
    @Column(name = "cep_contato")
    private String cepReceita;
    @Column(name = "dta_abertura_contato")
    @Temporal(TemporalType.DATE)
    private Calendar dtaContato;
    @Column(name = "dta_retorno_contato")
    @Temporal(TemporalType.DATE)
    private Calendar dtaRetorno;
    @Column(name = "retorna_contato")
    private String retorna;
    @Column(name = "nome_contato")
    private String nome;
    @Column(name = "email_contato")
    private String email;
    @Column(name = "telefone_contato")
    private String telefone;
    @Column(name = "observacao_contato")
    private String observacao;

    public Contato() {
    }

    public Contato(long id, String cnpj, String razaoSocial, String cepReceita, Calendar dtaContato, Calendar dtaRetorno, String retorna, String nome, String email, String telefone, String observacao) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.cepReceita = cepReceita;
        this.dtaContato = dtaContato;
        this.dtaRetorno = dtaRetorno;
        this.retorna = retorna;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCepReceita() {
        return cepReceita;
    }

    public void setCepReceita(String cepReceita) {
        this.cepReceita = cepReceita;
    }

    public Calendar getDtaContato() {
        return dtaContato;
    }

    public void setDtaContato(Calendar dtaContato) {
        this.dtaContato = dtaContato;
    }

    public Calendar getDtaRetorno() {
        return dtaRetorno;
    }

    public void setDtaRetorno(Calendar dtaRetorno) {
        this.dtaRetorno = dtaRetorno;
    }

    public String getRetorna() {
        return retorna;
    }

    public void setRetorna(String retorna) {
        this.retorna = retorna;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

}
