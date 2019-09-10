package com.xebia.jpaexcercises._13_element_collections;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Item {

    private String item_name;
    private BigDecimal price;

    public Item() {
    }

    public Item(String item_name, BigDecimal price) {
        this.item_name = item_name;
        this.price = price;
    }

    public String getName() {
        return item_name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
