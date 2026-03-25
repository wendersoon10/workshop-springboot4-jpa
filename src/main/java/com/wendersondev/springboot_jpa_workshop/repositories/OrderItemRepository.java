package com.wendersondev.springboot_jpa_workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendersondev.springboot_jpa_workshop.entities.OrderItem;
import com.wendersondev.springboot_jpa_workshop.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
