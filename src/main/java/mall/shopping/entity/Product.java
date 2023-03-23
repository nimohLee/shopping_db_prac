package mall.shopping.entity;

import lombok.Builder;
import lombok.Data;
import mall.shopping.enums.CategoryEnum;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Long price;

    private CategoryEnum category;

    private String image;

    private Integer stock;

    public Product() {

    }
}
