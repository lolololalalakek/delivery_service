package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.PricingRuleRevision;

import java.util.List;

public interface PricingRuleRevisionRepository extends JpaRepository<PricingRuleRevision, Long> {

    // получаю историю изменений прайс-листа, начиная с последнего
    List<PricingRuleRevision> findByPricingRuleIdOrderByCreatedAtDesc(Long pricingRuleId);
}
