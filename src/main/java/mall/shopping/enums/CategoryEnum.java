package mall.shopping.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CategoryEnum {
    CAP("cap"),
    TOP("top"),
    BOTTOM("bottom"),
    SOCKS("socks"),
    SHOES("shoes");

    private final String name;
}
