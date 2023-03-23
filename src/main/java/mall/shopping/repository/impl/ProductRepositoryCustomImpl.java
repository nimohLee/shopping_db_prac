package mall.shopping.repository.impl;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import mall.shopping.dto.ProductSearchCond;
import mall.shopping.entity.Product;
import mall.shopping.repository.ProductRepositoryCustom;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<Product> findByCondition(ProductSearchCond cond) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
