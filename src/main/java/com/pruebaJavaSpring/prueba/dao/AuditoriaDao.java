package com.pruebaJavaSpring.prueba.dao;

import com.pruebaJavaSpring.prueba.models.Auditoria;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AuditoriaDao {
    List<Auditoria> auditorias();
    Auditoria editar(Auditoria auditoria);
    void registrar(Auditoria auditoria);
    Auditoria buscar(Long id);
    void editarEstado(Auditoria auditoria);
}
