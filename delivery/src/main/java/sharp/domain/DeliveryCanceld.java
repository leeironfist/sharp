package sharp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCanceld extends AbstractEvent {

    private Long id;

    public DeliveryCanceld(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanceld() {
        super();
    }
}
//>>> DDD / Domain Event
