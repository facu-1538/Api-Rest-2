package services;

import entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BaseRepository;
import repositories.PersonaRepository;


@Service
public class PersonaServicesImpl extends BaseServicioImpl< Persona, Long> {

    @Autowired
    private PersonaRepository personaRepository;


    public PersonaServicesImpl(BaseRepository<Persona,Long> baseRepository){
        super(baseRepository);
    }


}
