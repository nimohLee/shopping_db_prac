package mall.shopping.dto;

import lombok.Data;

@Data
public class ProductSearchCond {

    private String name;
    private String category;
    private Integer minPrice;
    private Integer maxPrice;

    public ProductSearchCond() {}

    public ProductSearchCond(String name, String category, Integer minPrice, Integer maxPrice) {
        this.name = name;
        this.category = category;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }
}
