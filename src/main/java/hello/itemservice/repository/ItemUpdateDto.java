package hello.itemservice.repository;

import lombok.Data;

@Data
public class ItemUpdateDto { // Dto - data transfer object 데이터 전송 객체
    private String itemName;
    private Integer price;
    private Integer quantity;

    public ItemUpdateDto() {
    }

    public ItemUpdateDto(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
