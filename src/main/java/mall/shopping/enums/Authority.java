package mall.shopping.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Authority {
    CLIENT("client",0),
    ADMIN("admin",1);

    private final String name;
    private final int level;
}
