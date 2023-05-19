package ru.Meredov.buysell.services;

import org.springframework.stereotype.Service;
import ru.Meredov.buysell.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID,"PlayStation 5", "Simple descripton", 67000, "Ekaterinburg", "tomas"));
        products.add(new Product(++ID,"Iphone 8", "Simple descripton", 24000, "Moscow", "Egor"));

    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
