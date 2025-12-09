package uzumtech.delivery.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipments")
public class Shipment extends BaseEntity {

    @Column(nullable = false, unique = true, length = 64)
    private String trackingNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_profile_id", nullable = false)
    private CustomerProfile senderProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_address_id", nullable = false)
    private Address senderAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipient_profile_id", nullable = false)
    private CustomerProfile recipientProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipient_address_id", nullable = false)
    private Address recipientAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parcel_id", nullable = false)
    private Parcel parcel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TariffCode tariffCode;

    @ElementCollection(targetClass = DeliveryOption.class)
    @CollectionTable(name = "shipment_options", joinColumns = @JoinColumn(name = "shipment_id"))
    @Column(name = "option_name", length = 20)
    @Enumerated(EnumType.STRING)
    private Set<DeliveryOption> options = new HashSet<>();

    @Column(nullable = false)
    private BigDecimal distanceKm;

    @Column(nullable = false)
    private BigDecimal baseFee;

    @Column(nullable = false)
    private BigDecimal weightFee;

    @Column(nullable = false)
    private BigDecimal distanceFee;

    @Column(nullable = false)
    private BigDecimal optionFee;

    @Column(nullable = false)
    private BigDecimal totalFee;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private ShipmentStatus status;

    private LocalDateTime registeredAt;

    private LocalDateTime deliveredAt;

    @OneToMany(mappedBy = "shipment")
    private List<TrackingEvent> trackingEvents = new ArrayList<>();
}
