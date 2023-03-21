package mall.shopping.entity;

import lombok.Data;
import mall.shopping.enums.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    @ManyToMany
//    private List<Product> productList;

    private OrderStatus orderStatus;

    private Integer totalAmount;

    private LocalDateTime orderDate;
}
