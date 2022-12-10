package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Chris on 10/12/2022.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {


}
