package sharp.domain;

import java.util.*;
import lombok.*;
import sharp.domain.*;
import sharp.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceld extends AbstractEvent {

    private Long id;
}
