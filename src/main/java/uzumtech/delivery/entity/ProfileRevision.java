package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profile_revisions")
public class ProfileRevision extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private CustomerProfile profile;

    @Column(nullable = false, length = 150)
    private String fullNameSnapshot;

    @Column(nullable = false, length = 50)
    private String phoneSnapshot;

    @Column(length = 150)
    private String emailSnapshot;

    @Column(length = 255)
    private String changeNote;
}
