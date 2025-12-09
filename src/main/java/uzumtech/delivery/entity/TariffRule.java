package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tariff_rules")
public class TariffRule extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true, length = 20)
    private TariffCode code;

    @Column(nullable = false)
    private Integer maxLengthCm;

    @Column(nullable = false)
    private Integer maxWidthCm;

    @Column(nullable = false)
    private Integer maxHeightCm;

    @Column(nullable = false)
    private Double maxWeightKg;

    @Column(nullable = false)
    private Integer priority;
}
