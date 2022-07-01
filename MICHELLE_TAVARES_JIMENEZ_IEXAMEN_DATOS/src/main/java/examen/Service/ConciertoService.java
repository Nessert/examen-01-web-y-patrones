package examen.Service;

import java.util.List;

import examen.Domain.Conciertos;

public interface ConciertoService {
    public List<Conciertos> getAllConciertos();

    public void save(Conciertos concierto);

    public void delete(Conciertos concierto);

    public Conciertos getEstado(Conciertos concierto);

    public Conciertos find(Long id);
}
