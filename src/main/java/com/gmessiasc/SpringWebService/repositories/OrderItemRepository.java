package com.gmessiasc.SpringWebService.repositories;

import com.gmessiasc.SpringWebService.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
