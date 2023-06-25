package abstractfactory.db.factory;

import abstractfactory.db.dao.product.OracleProductDao;
import abstractfactory.db.dao.product.ProductDao;
import abstractfactory.db.dao.user.OracleUserDao;
import abstractfactory.db.dao.user.UserDao;

public class OracleDaoFactory extends DaoFactory {

    @Override
    public UserDao createUserDao() {
        return new OracleUserDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new OracleProductDao();
    }
}
