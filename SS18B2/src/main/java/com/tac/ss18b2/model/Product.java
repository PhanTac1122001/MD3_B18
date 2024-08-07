package com.tac.ss18b2.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToMany
	@JoinTable(
			  name = "wishlist",
			  joinColumns = @JoinColumn(name = "product_id"),
			  inverseJoinColumns = @JoinColumn(name = "user_id")
	)
	private Set<Users> users;
}
