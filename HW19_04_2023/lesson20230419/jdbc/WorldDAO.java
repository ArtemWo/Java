package HW19_04_2023.lesson20230419.jdbc;

import java.util.List;
import java.util.Optional;

public interface WorldDAO<T> {

    List<T> getAll();
    Optional<T> get(String countryCode );

    Optional<T> get(int id);

    void delete(String countryCode);

    void save(T t);

    void delete(int id);

}
