package mall.shopping.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Nested
    @DisplayName("상품 등록")
    class Save {
        @Test
        @DisplayName("상품 등록 실패")
        void save_fail() {

        }
    }


}
