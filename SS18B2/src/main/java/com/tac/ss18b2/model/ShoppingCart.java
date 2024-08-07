package com.tac.ss18b2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ShoppingCart
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	private Integer quantity;
	
}
