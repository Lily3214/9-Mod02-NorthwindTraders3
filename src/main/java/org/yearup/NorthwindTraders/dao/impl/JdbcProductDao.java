package org.yearup.NorthwindTraders.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yearup.NorthwindTraders.dao.interfaces.IProductDao;
import org.yearup.NorthwindTraders.models.Product;

import javax.sql.DataSource;
import java.util.List;

@Component
public class JdbcProductDao implements IProductDao {
private DataSource dataSource;

@Autowired
    public JdbcProductDao (DataSource dataSource) {
    this.dataSource = dataSource;
}

    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getProductById(int productId) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
