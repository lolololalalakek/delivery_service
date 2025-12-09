package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.TariffCode;
import uzumtech.delivery.entity.TariffRule;

import java.util.List;
import java.util.Optional;

public interface TariffRuleRepository extends JpaRepository<TariffRule, Long> {

    // ищу правило тарифа по его коду
    Optional<TariffRule> findByCode(TariffCode code);

    // получаю все правила по приоритету для подбора тарифа
    List<TariffRule> findAllByOrderByPriorityAsc();
}
