package ua.lviv.iot.businesslogic;

import ua.lviv.iot.DAO.CommonDAO;
import java.util.List;
import java.sql.SQLException;

public interface CommonService<T, ID> {

    CommonDAO<T, ID> giveDaoObject();

    default List<T> findAll() throws SQLException {
        return giveDaoObject().findAll();
    }

    default T findById(ID id) throws SQLException {
        return giveDaoObject().findById(id);
    }

    default int create(T entity) throws SQLException {
        return giveDaoObject().create(entity);
    }

    default void update(T entity) throws SQLException {
        giveDaoObject().update(entity);
    }

    default int delete(ID id) throws SQLException {
        return giveDaoObject().delete(id);
    }
}
