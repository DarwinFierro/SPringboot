package com.pruebaJavaSpring.prueba.dao;

import com.pruebaJavaSpring.prueba.models.Auditoria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class AuditoriaDaoImp implements AuditoriaDao {

    @PersistenceContext
    EntityManager entityManager; //ayuda a conexión a base de datos

    @Override
    @Transactional
    public List<Auditoria> auditorias() {
        String query = "FROM Auditoria";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Auditoria editar(Auditoria auditoria) {
        return entityManager.merge(auditoria);
    }

    @Override
    public void registrar(Auditoria auditoria) {
        entityManager.persist(auditoria);
    }

    @Override
    public Auditoria buscar(Long id) {
        return entityManager.find(Auditoria.class, id);
    }

    @Override
    public void editarEstado(Auditoria auditoria) {
        entityManager.merge(auditoria);
    }
}
