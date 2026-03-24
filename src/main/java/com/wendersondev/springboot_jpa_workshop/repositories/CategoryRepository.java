package com.wendersondev.springboot_jpa_workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendersondev.springboot_jpa_workshop.entities.Category;
import com.wendersondev.springboot_jpa_workshop.entities.Order;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
