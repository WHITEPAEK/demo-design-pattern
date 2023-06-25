package abstractfactory.db;

import abstractfactory.db.dao.product.ProductDao;
import abstractfactory.db.dao.user.UserDao;
import abstractfactory.db.domain.Product;
import abstractfactory.db.domain.User;
import abstractfactory.db.factory.DaoFactory;
import abstractfactory.db.factory.MySqlDaoFactory;
import abstractfactory.db.factory.OracleDaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class DaoFactoryTests {

    @Test
    void mySqlFactory_shouldReturnQueryOfMySql_whenMySqlIsPassed() {
        final String database = "mysql";

        DaoFactory daoFactory = null;
        if (database.equals("mysql")) {
            daoFactory = new MySqlDaoFactory();
        } else if (database.equals("oracle")) {
            daoFactory = new OracleDaoFactory();
        } else {
            throw new RuntimeException("DB support error");
        }

        assertSame(daoFactory.getClass(), MySqlDaoFactory.class);

        User user = new User();
        user.setId(1);
        user.setName("백승주");
        user.setPassword("1234");
        UserDao userDao = daoFactory.createUserDao();
        String insert = userDao.insert(user);
        System.out.println(insert);

        Product product = new Product();
        product.setId(1000);
        product.setName("물티슈");
        ProductDao productDao = daoFactory.createProductDao();
        String update = productDao.update(product);
        System.out.println(update);
    }

}
