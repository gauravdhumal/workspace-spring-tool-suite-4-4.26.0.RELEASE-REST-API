package com.REST_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.REST_API.Model.Product;

public interface Product_repo extends JpaRepository<Product, Integer> {

}
