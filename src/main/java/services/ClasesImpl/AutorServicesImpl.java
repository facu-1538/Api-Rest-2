package services;

import entities.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AutorRepository;
import repositories.BaseRepository;

@Service
public class AutorServices extends BaseServicioImpl<Autor,Long>{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServices(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
