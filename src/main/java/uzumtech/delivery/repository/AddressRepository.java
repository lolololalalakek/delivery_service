package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
