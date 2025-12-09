package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pricing_rules")
public class PricingRule extends BaseEntity {

    @Column(nullable = false)
    private BigDecimal baseDistanceKm;

    @Column(nullable = false)
    private BigDecimal baseFee;

    @Column(nullable = false)
    private BigDecimal baseWeightKg;

    @Column(nullable = false)
    private BigDecimal perKgRate;

    @Column(nullable = false)
    private BigDecimal perKmRate;

    @Column(nullable = false)
    private BigDecimal fragileFee;

    @Column(nullable = false)
    private BigDecimal expressFee;

    @Column(length = 10)
    private String currency;

    @OneToMany(mappedBy = "pricingRule")
    private List<PricingRuleRevision> revisions = new ArrayList<>();
}
