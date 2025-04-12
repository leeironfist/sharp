package sharp.domain;

import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCanceld extends AbstractEvent {

    private Long id;
}
