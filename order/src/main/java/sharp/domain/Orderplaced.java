package sharp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;

    public Orderplaced(Order aggregate) {
        super(aggregate);
    }

    public Orderplaced() {
        super();
    }
}
//>>> DDD / Domain Event
