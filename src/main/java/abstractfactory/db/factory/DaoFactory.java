package abstractfactory.db.factory;

import abstractfactory.db.dao.product.ProductDao;
import abstractfactory.db.dao.user.UserDao;

public abstract class DaoFactory {

    public abstract UserDao createUserDao();
    public abstract ProductDao createProductDao();

}
