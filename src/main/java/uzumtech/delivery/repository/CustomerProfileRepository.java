package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.CustomerProfile;

import java.util.Optional;

public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Long> {

    // ищу профиль клиента по номеру телефона
    Optional<CustomerProfile> findByPhone(String phone);

    // ищу профиль клиента по email
    Optional<CustomerProfile> findByEmail(String email);

    // проверяю, есть ли уже профиль с таким телефоном
    boolean existsByPhone(String phone);
}
