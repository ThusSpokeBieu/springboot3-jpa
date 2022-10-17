package com.gmessiasc.SpringWebService.repositories;

import com.gmessiasc.SpringWebService.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
