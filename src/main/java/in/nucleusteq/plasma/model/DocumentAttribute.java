package in.nucleusteq.plasma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class DocumentAttribute {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attribute_id")
	private int attributeId;
	@Column(name = "attribute_name")
	private String attributeName;
	@Column(name = "attribute_value")
	private String attributeValue;
	@ManyToOne
	@JoinColumn(name = "document_id")
	private Document document;
}
