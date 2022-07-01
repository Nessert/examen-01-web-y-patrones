package examen.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import examen.Dao.ConciertosDao;
import examen.Domain.Conciertos;

@Service
public class ConciertoServiceImp implements ConciertoService {

    @Autowired
    private ConciertosDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Conciertos> getAllConciertos() {
        return (List<Conciertos>) dao.findAll();
    }

    @Override
    @Transactional
    public void save(Conciertos concierto) {
        dao.save(concierto);
    }

    @Override
    @Transactional
    public void delete(Conciertos concierto) {
        dao.delete(concierto);
    }

    @Override
    @Transactional(readOnly = true)
    public Conciertos getEstado(Conciertos concierto) {
        return dao.findById(concierto.getIdConcierto()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Conciertos find(Long id) {
        return dao.findById(id).orElse(null);
    }

}
