package peaksoft.service;

import java.util.List;

public interface Service<T> {

    void save(T t);
    T findById(Long id);
    List<T> findAll();
    void deleteById(Long id);

}
