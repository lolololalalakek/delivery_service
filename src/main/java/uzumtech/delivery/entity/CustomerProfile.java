package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "customer_profiles")
public class CustomerProfile extends BaseEntity {

    @Column(nullable = false, length = 150)
    private String fullName;

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(length = 150)
    private String email;

    @OneToMany(mappedBy = "profile")
    private List<CustomerAddress> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "profile")
    private List<ProfileRevision> revisions = new ArrayList<>();
}
