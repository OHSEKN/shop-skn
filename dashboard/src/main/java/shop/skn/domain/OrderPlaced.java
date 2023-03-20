package shop.skn.domain;

import java.util.*;
import lombok.Data;
import shop.skn.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private Integer qty;
}
