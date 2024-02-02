package com.CSA.CSA.Controller;

import entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, String> {
    // You can add custom query methods here if needed
}
