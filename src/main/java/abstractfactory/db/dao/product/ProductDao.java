package abstractfactory.db.dao.product;

import abstractfactory.db.domain.Product;

public interface ProductDao {

    String select(Product product);
    String insert(Product product);
    String update(Product product);
    String delete(Product product);

}
