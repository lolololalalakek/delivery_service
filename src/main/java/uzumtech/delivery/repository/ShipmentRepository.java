package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.Shipment;
import uzumtech.delivery.entity.ShipmentStatus;

import java.util.List;
import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    // ищу отправление по трек-номеру
    Optional<Shipment> findByTrackingNumber(String trackingNumber);

    // получаю все отправления, где профиль отправитель
    List<Shipment> findBySenderProfileId(Long profileId);

    // получаю все отправления, где профиль получатель
    List<Shipment> findByRecipientProfileId(Long profileId);

    // получаю отправления по статусу
    List<Shipment> findByStatus(ShipmentStatus status);

    // получаю все отправления, где профиль либо отправитель, либо получатель
    List<Shipment> findBySenderProfileIdOrRecipientProfileId(Long senderId, Long recipientId);
}
