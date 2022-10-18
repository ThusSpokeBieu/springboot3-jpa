package com.gmessiasc.SpringWebService.repositories;

import com.gmessiasc.SpringWebService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
