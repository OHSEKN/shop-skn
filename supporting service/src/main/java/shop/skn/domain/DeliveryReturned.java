package shop.skn.domain;

import java.util.*;
import lombok.*;
import shop.skn.domain.*;
import shop.skn.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;

    public DeliveryReturned(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
