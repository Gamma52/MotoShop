package ru.postgre.MotoShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "motorcycle")
public class Motorcycle {
	@Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model", length = 50, nullable = false)
    private String model;

    @Column(name = "power", length = 50, nullable = false)
    private Integer power;

    @Column(name = "brand", length = 50, nullable = false)
    private String brand;
    
    @Column(name = "price", length = 50, nullable = false)
    private Integer price;
}
