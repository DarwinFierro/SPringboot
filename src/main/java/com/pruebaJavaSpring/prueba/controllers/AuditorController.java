package com.pruebaJavaSpring.prueba.controllers;

import com.pruebaJavaSpring.prueba.dao.AuditoriaDao;
import com.pruebaJavaSpring.prueba.models.Auditoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH })
public class AuditorController implements AuditoriaDao {
    @Autowired
    private AuditoriaDao auditoriaDao;

    @RequestMapping(value = "auditoria", method = RequestMethod.GET)
    public List<Auditoria> auditorias() {
        return auditoriaDao.auditorias();
    }

    @RequestMapping(value = "auditoria", method = RequestMethod.PATCH)
    public Auditoria editar(@RequestBody Auditoria auditoria) {
        return auditoriaDao.editar(auditoria);
    }

    @RequestMapping(value = "auditoria", method = RequestMethod.POST)
    public void registrar( @RequestBody Auditoria auditoria) {
        auditoriaDao.registrar(auditoria);
    }

    @RequestMapping(value = "auditoria/{id}", method = RequestMethod.GET)
    public Auditoria buscar(@PathVariable Long id) {
        return auditoriaDao.buscar(id);
    }

    @RequestMapping(value = "auditoria-estado", method = RequestMethod.PATCH)
    public void editarEstado(@RequestBody Auditoria auditoria) {
        auditoriaDao.editarEstado(auditoria);
    }
}
