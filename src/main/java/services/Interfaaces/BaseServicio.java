package services;

import entities.Base;
import java.io.Serializable;
import java.util.List;

public interface BaseServicio<E extends Base, ID extends Serializable> {

    public List<E> findAll () throws  Exception;
    public E findByid(ID id) throws Exception;
    public  E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
