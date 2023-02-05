package company.repositories.interfaces;

import company.entities.Product1;

import java.util.List;

public interface IProductRepository {
    List<Product1> getAllProducts();
    boolean createProduct(Product1 product1);
}
