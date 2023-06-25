package abstractfactory.db.dao.product;

import abstractfactory.db.domain.Product;

public class MySqlProductDao implements ProductDao {

    @Override
    public String select(Product product) {
        return "SELECT * FROM mysql.product";
    }

    @Override
    public String insert(Product product) {
        return "INSERT INTO mysql.product(id, name) VALUES (" + product.getId() + ", " + product.getName() + ")";
    }

    @Override
    public String update(Product product) {
        return "UPDATE mysql.product SET name = " + product.getName() + " WHERE id = " + product.getId();
    }

    @Override
    public String delete(Product product) {
        return "DELETE FROM mysql.product WHERE id = " + product.getId();
    }
}
