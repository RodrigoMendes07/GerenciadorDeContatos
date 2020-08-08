/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gerenciador.dao;

import br.com.gerenciador.bean.Contato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ti
 */

public class ContatoJPADao {

    private static ContatoJPADao instance;
    protected EntityManager entityManager;

    public static ContatoJPADao getInstance() {
        if (instance == null) {
            instance = new ContatoJPADao();
        }
        return instance;
    }

    private ContatoJPADao() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud-jpa-hibernate");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    public Contato getById(final int id) {
        return entityManager.find(Contato.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Contato> findAll() {
        return entityManager.createQuery("FROM "
                + Contato.class.getName()).getResultList();
    }

    public void persist(Contato contato) {
        try {
            
            entityManager.getTransaction().begin();
            entityManager.persist(contato);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        
    }

    public void merge(Contato contato) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(contato);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Contato contato) {
        try {
            entityManager.getTransaction().begin();
            contato = entityManager.find(Contato.class, contato.getId());
            entityManager.remove(contato);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Contato contato = getById(id);
            remove(contato);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
