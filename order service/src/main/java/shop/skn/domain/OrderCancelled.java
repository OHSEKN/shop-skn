package shop.skn.domain;

import java.util.*;
import lombok.*;
import shop.skn.domain.*;
import shop.skn.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
