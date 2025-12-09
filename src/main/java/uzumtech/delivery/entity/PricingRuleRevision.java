package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pricing_rule_revisions")
public class PricingRuleRevision extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pricing_rule_id", nullable = false)
    private PricingRule pricingRule;

    @Column(nullable = false)
    private BigDecimal baseDistanceKmSnapshot;

    @Column(nullable = false)
    private BigDecimal baseFeeSnapshot;

    @Column(nullable = false)
    private BigDecimal baseWeightKgSnapshot;

    @Column(nullable = false)
    private BigDecimal perKgRateSnapshot;

    @Column(nullable = false)
    private BigDecimal perKmRateSnapshot;

    @Column(nullable = false)
    private BigDecimal fragileFeeSnapshot;

    @Column(nullable = false)
    private BigDecimal expressFeeSnapshot;

    @Column(length = 10)
    private String currencySnapshot;

    @Column(length = 255)
    private String changeNote;
}
