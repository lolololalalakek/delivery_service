package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.Parcel;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
}
