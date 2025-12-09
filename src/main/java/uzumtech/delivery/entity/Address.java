package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "addresses")
public class Address extends BaseEntity {

    @Column(length = 120)
    private String country;

    @Column(length = 120)
    private String city;

    @Column(length = 255)
    private String street;

    @Column(length = 50)
    private String house;

    @Column(length = 50)
    private String apartment;

    @Column(length = 20)
    private String postalCode;

    private Double latitude;

    private Double longitude;

    @Column(length = 120)
    private String label;
}
