package gr.aueb.cf.dao;

import java.util.Map;

/**
 * This is for all the classes, like Account, JointAcount, OverdraftAccount, e.t.c.
 * so we dont have to build every DTO for each different account.
 * @param <T>
 */
public interface IGenericDAO<T> {
    T insert(Long id, T t);
    T update(Long id, T t);
    void delete(Long id);
    T get(Long id);
    Map<Long, T> getAll();
}
