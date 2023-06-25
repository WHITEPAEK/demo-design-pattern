package abstractfactory.db.factory;

import abstractfactory.db.dao.product.MySqlProductDao;
import abstractfactory.db.dao.product.ProductDao;
import abstractfactory.db.dao.user.MySqlUserDao;
import abstractfactory.db.dao.user.UserDao;

public class MySqlDaoFactory extends DaoFactory {

    @Override
    public UserDao createUserDao() {
        return new MySqlUserDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new MySqlProductDao();
    }
}
