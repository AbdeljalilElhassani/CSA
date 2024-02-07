package com.CSA.CSA;

import com.CSA.CSA.Controller.EtudiantRepository;
import com.CSA.CSA.Controller.FormationRepository;
import com.CSA.CSA.Controller.PromotionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDataInitializerTest {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private FormationRepository formationRepository;

    @Autowired
    private PromotionRepository promotionRepository;

    @Test
    public void testTestDataInitialization() {
        TestDataInitializer initializer = new TestDataInitializer(etudiantRepository, formationRepository, promotionRepository);
        initializer.run();
        // Add assertions if needed to verify that test data has been initialized correctly
    }
}
