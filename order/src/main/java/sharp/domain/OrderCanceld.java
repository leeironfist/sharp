package sharp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCanceld extends AbstractEvent {

    private Long id;

    public OrderCanceld(Order aggregate) {
        super(aggregate);
    }

    public OrderCanceld() {
        super();
    }
}
//>>> DDD / Domain Event
