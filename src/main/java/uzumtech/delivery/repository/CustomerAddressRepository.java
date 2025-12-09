package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.AddressRole;
import uzumtech.delivery.entity.CustomerAddress;

import java.util.List;
import java.util.Optional;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {

    // получаю все адреса профиля
    List<CustomerAddress> findByProfileId(Long profileId);

    // получаю адреса профиля по роли (отправитель или получатель)
    List<CustomerAddress> findByProfileIdAndRole(Long profileId, AddressRole role);

    // беру основной адрес профиля
    Optional<CustomerAddress> findByProfileIdAndPrimaryAddressTrue(Long profileId);
}
