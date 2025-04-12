package sharp.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import sharp.config.kafka.KafkaProcessor;
import sharp.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InventoryRepository inventoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStared'"
    )
    public void wheneverDeliveryStared_DecreasedInventory(
        @Payload DeliveryStared deliveryStared
    ) {
        DeliveryStared event = deliveryStared;
        System.out.println(
            "\n\n##### listener DecreasedInventory : " + deliveryStared + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCanceld'"
    )
    public void wheneverDeliveryCanceld_IncreasedInventory(
        @Payload DeliveryCanceld deliveryCanceld
    ) {
        DeliveryCanceld event = deliveryCanceld;
        System.out.println(
            "\n\n##### listener IncreasedInventory : " +
            deliveryCanceld +
            "\n\n"
        );

        // Sample Logic //
        Inventory.increasedInventory(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
