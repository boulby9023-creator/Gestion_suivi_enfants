package main.java.DAO;

import main.java.Modele.Utilisateur;

import java.util.List;

public interface Repository<T, ID> {
    void save(T entity);
    T findById(ID id);
    List<T> findAll();
    void delete(ID id);
    void update(ID id, T entity);

    void updtae(Integer id, Utilisateur entity);
}