package com.luv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Set;

/**
 * Created by Chris on 10/12/2022.
 */


@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "category_name")
    private String categoryName ;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
    private Set<Product> products ;


}
