package in.nucleusteq.plasma.model;


import in.nucleusteq.plasma.enums.AssetsStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "assets")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assets_id")
    private int assetsId;
    @Column(name = "assets_name")
    private String assetsName;
    @Column(name = "assets_type")
    private String assetsType;
    @Column(name = "serial_number", unique = true)
    private String serialNumber;
    @Column(name = "provided_by")
    private String providedBy;
    @Column(name = "operating_system")
    private String operatingSystem;
    @Column(name = "work_location")
    private String workLocation;
    @Enumerated(EnumType.STRING)
    @Column(name = "assets_status")
    private AssetsStatus assetsStatus;
    @OneToOne(mappedBy = "assetsId", cascade = CascadeType.REMOVE)
    private AssetAllocation assetsAllocation;
}
