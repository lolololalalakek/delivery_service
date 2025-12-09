package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.Shipment;
import uzumtech.delivery.entity.TrackingEvent;

import java.util.List;

public interface TrackingEventRepository extends JpaRepository<TrackingEvent, Long> {

    // получаю историю событий отправления по id, начиная с последнего
    List<TrackingEvent> findByShipmentIdOrderByOccurredAtDesc(Long shipmentId);

    // то же самое, но через объект shipment
    List<TrackingEvent> findByShipmentOrderByOccurredAtDesc(Shipment shipment);
}
