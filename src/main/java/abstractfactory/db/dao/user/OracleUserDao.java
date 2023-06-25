package abstractfactory.db.dao.user;

import abstractfactory.db.domain.User;

public class OracleUserDao implements UserDao {

    @Override
    public String select(User user) {
        return "SELECT * FROM oracle.user";
    }

    @Override
    public String insert(User user) {
        return "INSERT INTO oracle.user(id, password, name) VALUES (" + user.getId() + ", " + user.getPassword() + ", " + user.getName() + ")";
    }

    @Override
    public String update(User user) {
        return "UPDATE oracle.user SET password = " + user.getPassword() + " WHERE id = " + user.getId();
    }

    @Override
    public String delete(User user) {
        return "DELETE FROM oracle.user WHERE id = " + user.getId();
    }
    
}
