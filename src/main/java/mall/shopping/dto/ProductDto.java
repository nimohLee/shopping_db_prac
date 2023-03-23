package mall.shopping.dto;

import lombok.Builder;
import lombok.Getter;
import mall.shopping.entity.Category;

@Getter
@Builder
public class ProductDto {

    private String name;

    private String description;

    private Long price;

    private Category category;

    private String image;

    private Integer stock;

}
