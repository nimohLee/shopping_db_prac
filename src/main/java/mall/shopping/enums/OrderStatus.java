package mall.shopping.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {

    IN_PROGRESS("in progress"),
    SHIPPED("shipped"),
    DELIVERED("delivered"),
    CANCELED("canceld");
    private final String status;
}

