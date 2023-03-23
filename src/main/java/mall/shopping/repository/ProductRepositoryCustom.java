package mall.shopping.repository;

import mall.shopping.dto.ProductDto;
import mall.shopping.dto.ProductSearchCond;
import mall.shopping.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryCustom {
    List<Product> findByCondition(ProductSearchCond cond);

    List<Product> findAll();
}
