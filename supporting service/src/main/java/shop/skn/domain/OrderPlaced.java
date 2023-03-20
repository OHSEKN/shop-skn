package shop.skn.domain;

import java.util.*;
import lombok.*;
import shop.skn.domain.*;
import shop.skn.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private Integer qty;
}
