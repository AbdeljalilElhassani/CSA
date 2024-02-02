package com.CSA.CSA.Controller;

import entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, String> {
    // You can add custom query methods here if needed
}
