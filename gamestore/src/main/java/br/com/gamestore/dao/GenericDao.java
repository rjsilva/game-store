package br.com.gamestore.dao;

import java.util.List;

/**
 *
 * @author rjs
 * @param <T>
 */
public interface GenericDao<T> { 
    public void cadastrar(T obj);
    public void deletar(T obj);
    public void atualizar(Integer id);
    public List<T> getLista();
    
}
