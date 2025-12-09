package uzumtech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzumtech.delivery.entity.ProfileRevision;

public interface ProfileRevisionRepository extends JpaRepository<ProfileRevision, Long> {
}
