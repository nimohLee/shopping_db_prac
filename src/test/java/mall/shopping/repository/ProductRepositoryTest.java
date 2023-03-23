package mall.shopping.repository;

import mall.shopping.entity.Product;
import mall.shopping.enums.CategoryEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;


    @Nested
    @DisplayName("상품 하나 조회")
    class FindOne {

        @Test
        @DisplayName("상품명으로 조회성공")
        void findByName_sucess() {
            //given

            //when
            //then
        }
    }

    @Nested
    @DisplayName("상품 등록")
    class Save {
        @Test
        @DisplayName("성공")
        void save_success() {
            //given
            Product product = new Product();
            product.setId(1L);
            product.setName("신발");
            product.setPrice(1000L);
            product.setImage("www.");
            product.setStock(2);
            product.setDescription("신발입니다");
            product.setCategory(CategoryEnum.SHOES);
            //when
            Product result = productRepository.save(product);
            //then
            assertThat(result.getId()).isEqualTo(1L);
        }


}
