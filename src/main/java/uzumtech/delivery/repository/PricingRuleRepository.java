package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.PricingRule;

import java.util.Optional;

public interface PricingRuleRepository extends JpaRepository<PricingRule, Long> {

    // беру актуальный прайс-лист (последний по дате создания)
    Optional<PricingRule> findFirstByOrderByCreatedAtDesc();
}
