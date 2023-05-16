package ru.postgre.MotoShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Orders {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "moto_id", referencedColumnName = "id")	
    private Motorcycle moto;
	
	@ManyToOne
	@JoinColumn(name = "client_id", referencedColumnName = "id")	
    private Client client;
    
    @Column(name = "date", nullable = false)
    private String date;
}
