package xin.zachary.homework.dao;

import java.util.List;

public interface BaseDAO<T> {
    boolean save(T entity);
    boolean saveOrUpdate(T entity);
    boolean update(T entity);
    boolean delete(T entity);
}
