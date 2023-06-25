package abstractfactory.db.dao.product;

import abstractfactory.db.domain.Product;

public class OracleProductDao implements ProductDao {

    @Override
    public String select(Product product) {
        return "SELECT * FROM oracle.product";
    }

    @Override
    public String insert(Product product) {
        return "INSERT INTO oracle.product(id, name) VALUES (" + product.getId() + ", " + product.getName() + ")";
    }

    @Override
    public String update(Product product) {
        return "UPDATE oracle.product SET name = " + product.getName() + " WHERE id = " + product.getId();
    }

    @Override
    public String delete(Product product) {
        return "DELETE FROM oracle.product WHERE id = " + product.getId();
    }
    
}
