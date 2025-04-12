package sharp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;

    public InventoryIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
