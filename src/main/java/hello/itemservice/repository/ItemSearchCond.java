package hello.itemservice.repository;

import lombok.Data;

@Data
public class ItemSearchCond { // Cond - Condition의 줄임말, 검색 조건으로 사용한다는 규칙을 정했다.

    private String itemName;
    private Integer maxPrice;

    public ItemSearchCond() {
    }

    public ItemSearchCond(String itemName, Integer maxPrice) {
        this.itemName = itemName;
        this.maxPrice = maxPrice;
    }
}
