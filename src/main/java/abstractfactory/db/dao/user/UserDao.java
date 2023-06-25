package abstractfactory.db.dao.user;

import abstractfactory.db.domain.User;

public interface UserDao {

    String select(User user);
    String insert(User user);
    String update(User user);
    String delete(User user);

}
