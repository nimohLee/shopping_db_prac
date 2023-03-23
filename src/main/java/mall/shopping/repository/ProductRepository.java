package mall.shopping.repository;
import mall.shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long>, ProductRepositoryCustom {
}
