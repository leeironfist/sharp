package sharp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStared extends AbstractEvent {

    private Long id;

    public DeliveryStared(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStared() {
        super();
    }
}
//>>> DDD / Domain Event
