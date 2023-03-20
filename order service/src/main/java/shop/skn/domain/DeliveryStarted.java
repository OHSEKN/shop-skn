package shop.skn.domain;

import java.util.*;
import lombok.*;
import shop.skn.domain.*;
import shop.skn.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
}
