package uzumtech.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "parcels")
public class Parcel extends BaseEntity {

    @Column(nullable = false)
    private Integer lengthCm;

    @Column(nullable = false)
    private Integer widthCm;

    @Column(nullable = false)
    private Integer heightCm;

    @Column(nullable = false)
    private Double weightKg;

    @Column(nullable = false)
    private Long volumeCubicCm;

    public Parcel(Integer lengthCm, Integer widthCm, Integer heightCm, Double weightKg) {
        this.lengthCm = lengthCm;
        this.widthCm = widthCm;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        // вычисляю объем сразу при создании
        this.volumeCubicCm = (long) lengthCm * widthCm * heightCm;
    }

    // пересчет объема если габариты изменились
    public void recalculateVolume() {
        if (lengthCm != null && widthCm != null && heightCm != null) {
            this.volumeCubicCm = (long) lengthCm * widthCm * heightCm;
        }
    }
}
